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
@Table(name = "instructor")
public class Instructor {

	// variables
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
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructorDetail;

	// default constructor
	public Instructor() {

	}

	// parameterized constructor
	public Instructor(String bookName, String publisherName, String dateofpublish) {
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

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", bookName=" + bookName + ", publisherName=" + publisherName
				+ ", dateofpublish=" + dateofpublish + ", instructorDetail=" + instructorDetail + "]";
	}
}
