/*
lab 3:Write a Java program that reads an integer from the user 
using the Scanner class. Handle the InputMismatchException 
that can occur if the user enters a non-integer value. 
Display an appropriate error message.
*/
import java.util.*;

public class InputMissMatchExce {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter a number
            System.out.println("Enter a Number");

            // Try to read an integer from the user's input
            Integer a = scanner.nextInt();

            // Calculate and print the square of the entered value
            System.out.println("Square Of Given Value: " + a * a);
        } catch (InputMismatchException ex) {
            // If the user enters something that's not an integer, catch the InputMismatchException
            // and print the exception message
            System.out.println(ex);
        } finally {
            // In the finally block, always print a message indicating that the executed input is an integer value
            System.out.println("The Executed input is an Integer Value!! You Got it....");
        }
    }
}
