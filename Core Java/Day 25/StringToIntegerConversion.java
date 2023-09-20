/*
Write  a Java program that reads a string input from the user. 
Convert the string to an integer using the Integer.parseInt() 
method. Handle the NumberFormatException that can occur if 
the input cannot be parsed as an integer. Display a message 
indicating that the input is not a valid integer.
*/
import java.util.Scanner;

public class StringToIntegerConversion {
    public static void main(String[] args) {
    	String input;
    	int intValue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        input = scanner.nextLine();

        try {
            intValue = Integer.parseInt(input);
            System.out.println("You entered a valid integer: " + intValue);
        } 
        catch (NumberFormatException e) {
        	System.out.println("NumberFormatException Occurred.");
            System.out.println("Input is not a valid integer.");
        } 
        /*finally {
        	System.out.println("The Executed input is an Integer Value!! You Got it....");	
        }*/
        scanner.close(); // Close the scanner
    }
}
