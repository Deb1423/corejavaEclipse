package com.libarymanagement.libary;

import java.util.List;

import com.dao.InstructorDao;
import com.entity.Instructor;
import com.entity.InstructorDetail;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Save two instructors
		Instructor instructor = new Instructor("Byomkesh Bakshi Somogryo", "Ananda Publisher", "20th December,2022");
		InstructorDetail instructorDetail = new InstructorDetail("Sharadindu  Bandyopadhyay ",
				"Byomkesh Bakshi Detective Story");
		instructorDetail.setInstructor(instructor);
		instructor.setInstructorDetail(instructorDetail);

		Instructor instructor1 = new Instructor("Feluda Somogroy", "Ananda Publisher", "28th December,2022");
		InstructorDetail instructorDetail1 = new InstructorDetail("Satyajit Ray", "Feluda Detective Story");
		instructorDetail1.setInstructor(instructor1);
		instructor1.setInstructorDetail(instructorDetail1);

		InstructorDao instructorDao = new InstructorDao();
		instructorDao.saveInstructor(instructor);
		instructorDao.saveInstructor(instructor1);

		// Get all instructors
		List<Instructor> instructors = instructorDao.getAllInstructor();
		instructors.forEach(instructorTemp -> System.out.println(instructorTemp.getBookName()));
	}
}
