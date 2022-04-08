package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Anandh Ajay");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("belongs to ece");

	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("09,06");

	}
	public static void main(String[] args) {
	Student stu=new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		
		
		
	}

}
