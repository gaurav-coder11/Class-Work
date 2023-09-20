public class TextFinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Inside the try block");

            // The code below performs a division operation
            int numerator = 25;
            int denominator = 5;
            int result = numerator / denominator;
            System.out.println("Division = " + result);
        } 
        // The catch block can't handle ArithmeticException
        // It can only handle NullPointerException
        catch (NullPointerException e) {
            System.out.println(e);
        } 
        // The finally block executes regardless of whether an exception occurred or not
        finally {
            System.out.println("Finally Block Always Executes");
            System.out.println("This block is always executed irrespective of execution path");
        }
        
        // Code execution continues here after try-catch-finally block
        System.out.println("Remaining Code...");
    }
}

/*
import java.util.Scanner;

public class TextFinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator:");
            int numerator = scanner.nextInt();

            System.out.println("Enter the denominator:");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally Block is Always Executed");
            System.out.println("This Block is Compulsory Executed Irrespective of Execution");
            scanner.close(); // Close the scanner
        }

        System.out.println("Remaining Code...");
    }
}
*/