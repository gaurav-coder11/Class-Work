package com.gaurav.project;

public class StudentDetalis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAdd student = new StudentAdd();
		student.setRollNo(5);
		student.setName("Gaurav");
		student.setAge(23);
		student.setAddress("Gondia");
		System.out.println("*********************************************");
		System.out.println("Student Roll NO : "+student.getRollNo());
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student Age : "+student.getAge());
		System.out.println("Student Address : "+student.getAddress());
		System.out.println("*********************************************");
	}

}
