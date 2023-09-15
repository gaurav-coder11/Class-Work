import java.util.*;

class Aritmatic_Operation {
    double num1, num2, res; // Variables, fields/properties

    // Method to get user input for two numbers
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
    }

    // Method to perform addition and display the result
    public void addition() {
        res = num1 + num2;
        System.out.println("The Addition of Two Numbers Is: " + res);
    }

    // Method to perform subtraction and display the result
    public void substration() {
        res = num1 - num2;
        System.out.println("The Subtraction of Two Numbers Is: " + res);
    }

    // Method to perform multiplication and display the result
    public void multiplication() {
        res = num1 * num2;
        System.out.println("The Multiplication of Two Numbers Is: " + res);
    }

    // Method to perform division and display the result
    public void division() {
        if (num2 != 0) {
            res = num1 / num2;
            System.out.println("The Division of Two Numbers Is: " + res);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Aritmatic_Operation ao = new Aritmatic_Operation(); // Object creation
        ao.input(); // Get input from the user
        ao.addition(); // Perform addition and display the result
        ao.substration(); // Perform subtraction and display the result
        ao.multiplication(); // Perform multiplication and display the result
        ao.division(); // Perform division and display the result
    }
}
