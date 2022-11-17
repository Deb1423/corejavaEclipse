package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.BookDetails;
import com.util.HibernateUtil;

public class BookDetailsDao {

	/**
	 * Save Instructor Details
	 * 
	 * @param instructordetails
	 */

	public void saveBookDetail(BookDetails bookDetail) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(bookDetail);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Update Instructor Details
	 * 
	 * @param instructordetails
	 */

	public void updateBookDetail(BookDetails bookDetail) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(bookDetail);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Get Instructor Details By ID
	 * 
	 * @param id
	 * @return
	 */

	public BookDetails getBookDetail(int id) {

		Transaction transaction = null;
		BookDetails book = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object
			book = session.get(BookDetails.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return book;
	}

}
