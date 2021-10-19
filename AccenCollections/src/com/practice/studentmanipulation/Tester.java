package com.practice.studentmanipulation;

import java.util.*;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Symposium sym = new Symposium();
		int choice;

		do {
			System.out.println("1.Register Student");
			System.out.println("2.Display all Student Details");
			System.out.println("3.Display Student Details  based on Department Name");
			System.out.println("4.Display total Count of Students – by Department Name");
			System.out.println("5.Exit");

			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Student student = new Student();
				System.out.println("Enter the Student Id:");
				student.setStudId(sc.nextInt());
				System.out.println("Enter the Student name:");
				student.setStudName(sc.next());
				System.out.println("Enter the department Name:");
				student.setDeptName(sc.next());

				sym.addStudent(student);
				break;
			case 2:

				List<Student> obj = sym.viewAllStudentDetails();

				if (sym.isEmpty()) {
					System.out.println("No Student Registered");
				} else {
					for (Student stu : obj) {
						System.out.println("Student Id:" + stu.getStudId());
						System.out.println("Student Name:" + stu.getStudName());
						System.out.println("Department Name:" + stu.getDeptName());
					}
				}

				break;

			case 3:
				System.out.println("Enter the Department Name:");
				String deptname = sc.next();
				List<Student> obj1 = sym.viewStudentInfoByDept(deptname);

				if (deptname.equalsIgnoreCase("EEE") || deptname.equalsIgnoreCase("CS")
						|| deptname.equalsIgnoreCase("IT") || deptname.equalsIgnoreCase("ECE")) {
					if (sym.totalStudents(deptname) == 0) {
						System.out.println("No Students enrolled");
					} else {
						for (Student stu : obj1) {
							System.out.println("Student Id:" + stu.getStudId());
							System.out.println("Student Name:" + stu.getStudName());
							System.out.println("Department Name:" + stu.getDeptName());
						}
					}
				} else {
					System.out.println("This Department not eligible for Symposium");
				}
				break;

			case 4:
				System.out.println("Enter the Department Name:");
				String deptname1 = sc.next();
				int count = sym.totalStudents(deptname1);
				System.out.println("Total No of Students:" + count);

			case 5:
				break;
			}
		} while (choice != 5);

	}
}
