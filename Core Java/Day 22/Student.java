/*
Write a Package MCA which has one class Student. Accept student detail through parameterized constructor.
 Write display () method to display details. Create a main class which will use package and calculate total 
 marks and percentage.
*/

package MCA; // Package declaration indicating that this code belongs to the "MCA" package.

// Define a class named Student
public class Student {
    // Instance variables to store student information
    String sname; // Student name
    int sroll_no; // Student roll number
    String sclasess; // Class name
    int smar, seng, smath, ssci, shis, ssos; // Marks in various subjects

    // Constructor to initialize the student's attributes
    public Student(String name, int roll_no, String sclass, int mar, int eng, int math, int sci, int his, int sos) {
        this.sname = name;
        this.sroll_no = roll_no;
        this.sclasess = sclass;
        this.smar = mar;
        this.seng = eng;
        this.smath = math;
        this.ssci = sci;
        this.shis = his;
        this.ssos = sos;
    }

    // Method to display student information
    public void display() {
        System.out.println("\n");
        System.out.println("*****************************************");
        System.out.println("Your Name is: " + sname);
        System.out.println("Your Roll Number is: " + sroll_no);
        System.out.println("Your Class Name is: " + sclasess);
        System.out.println("Your Marathi Marks is: " + smar);
        System.out.println("Your English Marks is: " + seng);
        System.out.println("Your Math Marks is: " + smath);
        System.out.println("Your Science Marks is: " + ssci);
        System.out.println("Your History Marks is: " + shis);
        System.out.println("Your Social Science Marks is: " + ssos);
        System.out.println("*****************************************");
        System.out.println("\n");
    }

    // Method to calculate and return the total marks of the student
    public int getTotalMarks() {
        return smar + seng + smath + ssci + shis + ssos;
    }

    // Method to calculate and return the percentage of the student
    public double getPercentage() {
        int totalMarks = getTotalMarks();
        return (double) totalMarks / 6; // Assuming there are 6 subjects
    }
}
