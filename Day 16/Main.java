//WAP to Multilevel Inheritance
import java.util.Scanner;

// Define a base class named BaseClass
class BaseClass {
    int num1, num2, res;
    Scanner scanner = new Scanner(System.in);

    // Method to input two numbers
    public void inputData() {
        System.out.print("Enter 1st Number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = scanner.nextInt();
    }
}

// Define a derived class named DeriveOne that extends BaseClass
class DeriveOne extends BaseClass {
    // Method to calculate the sum of two numbers
    public void calculateMethod() {
        res = num1 + num2;
    }
}

// Define another derived class named DeriveTwo that extends DeriveOne
class DeriveTwo extends DeriveOne {
    // Method to display the result
    public void displayMethod() {
        System.out.println("The Output is: " + res);
    }
}

// Main class
public class Main {
    public static void main(String args[]) {
        // Create an instance of DeriveTwo
        DeriveTwo deriveTwo = new DeriveTwo();

        // Call methods to input data, calculate, and display the result
        deriveTwo.inputData();
        deriveTwo.calculateMethod();
        deriveTwo.displayMethod();
    }
}
