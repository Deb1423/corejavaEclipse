package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "Book_name")
	private String bookName;

	@Column(name = "Publisher_name")
	private String publisherName;

	@Column(name = "Dateofpublish")
	private String dateofpublish;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookDetail_id")
	private BookDetails bookDetail;

	// default constructor
	public Book() {

	}

	// parameterized constructor
	public Book(String bookName, String publisherName, String dateofpublish) {
		this.bookName = bookName;
		this.publisherName = publisherName;
		this.dateofpublish = dateofpublish;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getDateofpublish() {
		return dateofpublish;
	}

	public void setDateofpublish(String dateofpublish) {
		this.dateofpublish = dateofpublish;
	}

	public BookDetails getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(BookDetails bookDetail) {
		this.bookDetail = bookDetail;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", publisherName=" + publisherName + ", dateofpublish="
				+ dateofpublish + "]";
	}
}
