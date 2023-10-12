package com.gaurav.project;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		//setting bean values
		employee.setId(01);
		employee.setName("Gaurav");
		
		System.out.println("Employee Id : "+employee.getId());
		System.out.println("Student name : "+employee.getName());

	}

}
