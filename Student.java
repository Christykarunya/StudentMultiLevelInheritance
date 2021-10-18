package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {

	public void studentName() {
		
		System.out.println("Student Name: Christy");
	}

	public void studentDept() {

		System.out.println("Student Department: Computer Science");
	}

	public void studentID() {
		
		System.out.println("Student ID: 4001");
	}

	public static void main(String[] args) {
		College col = new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();

		Department dept = new Department();
		dept.departmentName();

		Student stu = new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentID();

	}

}
