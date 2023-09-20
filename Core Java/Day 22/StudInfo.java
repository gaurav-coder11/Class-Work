import MCA.Student;  // Assuming you have a Student class in the MCA package
import java.util.Scanner;

public class StudInfo {
    public static void main(String args[]) {
        // Declare variables to store student information
        String name;
        int roll_no;
        String sclass;
        int mar, eng, math, sci, his, sos;

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name and read it
        System.out.print("Enter Your Name is: ");
        name = sc.nextLine();

        // Prompt the user to enter their roll number and read it
        System.out.print("Enter Your Roll Number is: ");
        roll_no = sc.nextInt();

        // Consume the newline character left by nextInt()
        sc.nextLine();

        // Prompt the user to enter their class and read it
        System.out.print("Enter Your Class: ");
        sclass = sc.nextLine();

        //user to enter their Marathi marks and read it
        System.out.print("Enter Your Marathi Marks Out Of 100: ");
        mar = sc.nextInt();

        System.out.print("Enter Your English Marks Out Of 100: ");
        eng = sc.nextInt();

        System.out.print("Enter Your Math Marks Out Of 100: ");
        math = sc.nextInt();

        System.out.print("Enter Your Science Marks Out Of 100: ");
        sci = sc.nextInt();

        System.out.print("Enter Your History Marks Out Of 100: ");
        his = sc.nextInt();

        System.out.print("Enter Your Social Science Marks Out Of 100: ");
        sos = sc.nextInt();

        // Create a Student object with the entered information
        Student student = new Student(name, roll_no, sclass, mar, eng, math, sci, his, sos);

        // Display student details
        System.out.println("Student Details:");
        student.display();

        // Calculate and display total marks and percentage
        int totalMarks = student.getTotalMarks();
        double percentage = student.getPercentage();
        System.out.println("--------------Total Marks--------------");
        System.out.println("Total Marks: " + totalMarks + " Out of 600.");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("----------------------------------------");
    }
}
