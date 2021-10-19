package com.practice.studentmanipulation;

import java.util.*;

public class Symposium {

	List<Student> studentList = new ArrayList<Student>();

	public void addStudent(Student aobj) {
		studentList.add(aobj);
	}

	public boolean isEmpty() {
		if (studentList.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public List<Student> viewAllStudentDetails() {
		return studentList;
	}

	public List<Student> viewStudentInfoByDept(String deptName) {
		List<Student> temp = new ArrayList<Student>();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getDeptName().equalsIgnoreCase(deptName)) {
				temp.add(studentList.get(i));
			}
		}
		return temp;
	}

	public int totalStudents(String deptName) {
		int count = 0;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getDeptName().equalsIgnoreCase(deptName)) {
				count++;
			}
		}

		return count;
	}

}
