/*
Create a package Empdetails.Create a class Emp which has 
fields as Empid,Empname,Empdesignation ,Accept details 
from user and display the same
*/
package Empdetails; // The Emp class is in the "Empdetails" package.

public class Emp {
    // Instance variables to store employee details
    int empi; // Employee ID
    String empname; // Employee Name
    String empdesignation; // Employee Designation

    // Constructor to initialize the employee details
    public Emp(int id, String name, String designation) {
        this.empi = id;
        this.empname = name;
        this.empdesignation = designation;
    }

    // Method to display employee details
    public void display() {
        System.out.println("************* Employee Details *************");
        System.out.println("Employee Id is: " + empi);
        System.out.println("Employee Name is: " + empname);
        System.out.println("Employee Designation is: " + empdesignation);
        System.out.println("************** ************** **************");
    }
}
