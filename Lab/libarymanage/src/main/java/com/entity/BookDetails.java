package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class BookDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// variables
	@Column(name = "id")
	private int id;

	@Column(name = "Writter_name")
	private String writterName;

	@Column(name = "Based_on")
	private String basedon;

	@OneToOne(mappedBy = "bookDetail", cascade = CascadeType.ALL)
	private Book book;

	// default constructor
	public BookDetails() {

	}

	// Parameterized Constructor
	public BookDetails(String writterName, String basedon) {
		this.writterName = writterName;
		this.basedon = basedon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWritterName() {
		return writterName;
	}

	public void setWritterName(String writterName) {
		this.writterName = writterName;
	}

	public String getBasedon() {
		return basedon;
	}

	public void setBasedon(String basedon) {
		this.basedon = basedon;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "BookDetails [id=" + id + ", writterName=" + writterName + ", basedon=" + basedon + ", book=" + book
				+ "]";
	}
}
