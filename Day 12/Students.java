/*

WAP that takes Basic information of student and 
Display the same.Add two more methods in the same 
program which are related to Student class

*/ 

import java.util.*;

public class Students {

    String name;
    int rollno, age,sem;
    String address;
    String contactNumber;

    // Method to get student details from the user
    void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        contactNumber = sc.nextLine();

        System.out.print("Select Branch: ");
        System.out.println("1.CS");
        System.out.println("2.Mech");

        sem = sc.nextInt();
    }

    											// Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);

        System.out.println("Age: " + age);
		
		if (age >= 18 && age <= 100) {
            System.out.println(name+" Your Age Is.");
        } else {
            System.out.println(name+ " You Are Bellow 18.");
        }



        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }
    void displayRollNo(){
    	if (rollno >= 1 && rollno <= 100) {
            System.out.println(rollno + " Valid Roll Number");
        } else {
            System.out.println(rollno+ " Valid Roll Number.");
        }
    }

    										// Method to check if the student is eligible for voting (18 years or older)
    void checkVotingEligibility() {
        if (age >= 18) {
            System.out.println(name + " is eligible for voting.");
        } else {
            System.out.println(name + " is not eligible for voting.");
        }
    }

    										// Method to check if the student is a minor (below 18 years)
    void checkSemester() {
        if (sem == 1) {
            System.out.println(name + " Your Admission Is CS Branch.");
        } else {
            System.out.println(name + " Your Admission Is Mechanical Branch!!!");
        }
    }

    public static void main(String args[]) {
        Students stu = new Students();

        									// Get student information from the user
        stu.getInfo();

        									// Display student information
        System.out.println("\nStudent Information:");
        stu.displayInfo();

        									// Check voting eligibility
        stu.checkVotingEligibility();

        									// Check minor status
        stu.checkSemester();
    }
}
