package com.gaurav; // Assuming both Employee and EmployeeDetails are in the same package or subpackages under com.gaurav

public class EmployeeDetails {

    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee();

        // Set employee values
        employee.setId(01);
        employee.setName("Gaurav");

        // Print employee details
        System.out.println("Employee Id: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
    }
}
