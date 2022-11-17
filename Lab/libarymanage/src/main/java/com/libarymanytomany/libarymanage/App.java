package com.libarymanytomany.libarymanage;

import java.util.List;

import com.dao.BookDao;
import com.entity.Book;
import com.entity.BookDetails;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Save two instructors
		Book book = new Book("Byomkesh Bakshi Somogryo", "Ananda Publisher", "20th December,2022");
		BookDetails bookDetail = new BookDetails("Sharadindu  Bandyopadhyay ", "Byomkesh Bakshi Detective Story");
		bookDetail.setBook(book);
		book.setBookDetail(bookDetail);

		Book book1 = new Book("Feluda Somogroy", "Ananda Publisher", "28th December,2022");
		BookDetails bookDetail1 = new BookDetails("Satyajit Ray", "Feluda Detective Story");
		bookDetail1.setBook(book1);
		book1.setBookDetail(bookDetail1);

		BookDao bookDao = new BookDao();
		bookDao.saveBook(book);
		bookDao.saveBook(book1);

		// Get all instructors
		List<Book> books = bookDao.getAllBook();
		books.forEach(bookTemp -> System.out.println(bookTemp.getBookName()));
	}
}
