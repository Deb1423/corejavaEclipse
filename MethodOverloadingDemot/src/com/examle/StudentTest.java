package com.examle;

import java.util.Scanner;

public class StudentTest {

	static void displayStudents(Student[] s1) {

		for (Student obj : s1) {
			System.out.println("Name:" + obj.getName() + " Score:" + obj.getScore() + "  Course:" + obj.getCourse());
		}

	}

	// method overloading
	static void displayStudents(Student[] s1, double marks) {

		for (Student obj : s1) {
			if (obj.getScore() >= marks)
				System.out
						.println("Name:" + obj.getName() + " Score:" + obj.getScore() + "  Course:" + obj.getCourse());
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];
		s[0] = new Student(1, "Ankit", 23, 78.9);
		s[1] = new Student(2, "Subham", 20, 90.8, "B.Tech");
		s[2] = new Student(3, "Deep", 22, 89.7);
		s[3] = new Student(4, "Pramit", 19, 80.7, "B.Tech");
		s[4] = new Student(5, "Haripada", 21, 91.2, "B.Tech");
		int ch;
		System.out.println("Enter 1 to see all students:");
		System.out.println("Enter 2 to see students above 90");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			displayStudents(s);
			break;
		case 2:
			displayStudents(s, 90.0);
			break;
		default:
			System.out.println("Wrong input");

		}
		sc.close();
	}

}
