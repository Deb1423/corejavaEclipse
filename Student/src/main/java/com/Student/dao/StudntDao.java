package com.Student.dao;

import com.Student.model.Student;

public interface StudntDao {

	void addStudent();

	boolean deleteStudent(int id);

	boolean updateStudent(int id, Student s);

	Student findStudent(int id);

}
