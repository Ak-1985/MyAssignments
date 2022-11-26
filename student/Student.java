package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.departmentName();
		st.studentName();
		st.studentID();
		st.studentDept();

	}
	public void studentName() {
		System.out.println("Student name is kiruthika");
	}
	
	public void studentID() {
		System.out.println("student ID is 546");
	}
	public void studentDept() {
		System.out.println("student dept is electronics");
	}

}
