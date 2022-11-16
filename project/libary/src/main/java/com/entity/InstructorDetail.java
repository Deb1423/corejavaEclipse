package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class InstructorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// variables
	@Column(name = "id")
	private int id;

	@Column(name = "Writter_name")
	private String writterName;

	@Column(name = "Based_on")
	private String basedon;

	@OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
	private Instructor instructor;

	// default constructor
	public InstructorDetail() {

	}

	// Parameterized Constructor
	public InstructorDetail(String writterName, String basedon) {
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

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", writterName=" + writterName + ", basedon=" + basedon + ", instructor="
				+ instructor + "]";
	}
}
