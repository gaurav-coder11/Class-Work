/* to generate Marksheet of a student based on His 
personal details and Secured marks.
Create PersonalInfo class for accepting student 
personal information and Create another class 
MarksInfo for Accepting students marks details 
and finally create Result class to display all 
above class information using multilevel Inheritance.
*/
import java.util.Scanner;

class PersonalInfo {
    String name;
    int roll_No;
    double english_Marks, math_Marks, physics_Marks, chemestry_Marks, bio_Marks, history_Marks, marks, percentage, result;
    Scanner scanner = new Scanner(System.in);

    // Method to input personal information
    public void personalInfo() {
        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();
        System.out.println("****************** " + "WELCOME " + name + " ******************");
        System.out.print("Enter Your Roll Number: ");
        roll_No = scanner.nextInt();

        System.out.print("Enter Your English Marks Out Of 100: ");
        english_Marks = scanner.nextDouble();
        System.out.print("Enter Your Math Marks Out Of 100: ");
        math_Marks = scanner.nextDouble();
        System.out.print("Enter Your Physics Marks Out Of 100: ");
        physics_Marks = scanner.nextDouble();
        System.out.print("Enter Your Chemestry Marks Out Of 100: ");
        chemestry_Marks = scanner.nextDouble();
        System.out.print("Enter Your Biology Marks Out Of 100: ");
        bio_Marks = scanner.nextDouble();
    }
}

class marksInfo extends PersonalInfo {

    // Method to calculate percentage and result based on marks
    public void calculetPercentageMethod() {
        marks = english_Marks + math_Marks + physics_Marks + chemestry_Marks + bio_Marks;
        result = marks * 5;
        percentage = (marks / 500) * 100;
    }
}

class Result extends marksInfo {

    // Method to display personal information, marks, and percentage
    public void displayMethod() {
        System.out.println("\n");
        System.out.println("Name: " + name);
        System.out.print("Roll Number : " + roll_No);
        System.out.println("\n");
        System.out.println("Your English Marks: " + english_Marks);
        System.out.println("Your Mathematics Marks: " + math_Marks);
        System.out.println("Your Physics Marks: " + physics_Marks);
        System.out.println("Your Chemistry Marks: " + chemestry_Marks);
        System.out.println("Your Biology Marks: " + bio_Marks);
        System.out.println("\n");
        System.out.println("-----------------------------------------------");
        System.out.println("Your Total Marks: " + marks);
        System.out.println("-----------------------------------------------");
        System.out.println("\n");

        System.out.println("-----------------------------------------------");
        System.out.println("Your Total Percentage: " + percentage+"%");
        System.out.println("-----------------------------------------------");
        System.out.println("\n");

        // Providing result based on percentage
        if (percentage >= 80) {
            System.out.print("Congratulations! You are in the Distinction category, "+"* " + name+" *");
        } else if (percentage < 75 && percentage >= 60) {
            System.out.print("Congratulations! You are in the First Class category, "+"* " + name+" *");
        } else if (percentage < 60 && percentage >= 45) {
            System.out.print("Good job! You are in the Second Class category, "+"* " + name+" *");
        } else if (percentage < 45 && percentage >= 35) {
            System.out.print("You have passed, "+"* " + name+" *");
        } else {
            System.out.print("Unfortunately, you have failed, " +"* " + name+" *");
        }
    }
}

public class percentagesCalcy {

    public static void main(String args[]) {
        // Creating an object of the Result class and calling methods
        Result result = new Result();
        result.personalInfo();
        result.calculetPercentageMethod();
        result.displayMethod();
    }
}
