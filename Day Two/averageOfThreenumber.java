// Import the Scanner class to read input from the user
import java.util.Scanner;

// Create a class named averageOfThreenumber
public class averageOfThreenumber {

    public static void main(String[] args) {
        // Declare variables for three numbers and the result
        double a, b, c, res;
        
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        a = scan.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        b = scan.nextDouble();
        
        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        c = scan.nextDouble();
        
        // Close the Scanner to release system resources
        scan.close();
        
        // Calculate the average of the entered numbers
        res = (a + b + c) / 3;
        
        // Display the result, which is the average of the entered numbers
        System.out.print("The average of entered numbers is: " + res);
    }
}
