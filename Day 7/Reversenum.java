//WAP to accept number from  user and do reverse of it
import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        int number, reverse = 0, remainder; // Declare integer variables

        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter the number: ");
        number = sc.nextInt(); // Read an integer from the user

        while (number > 0) { // Continue the loop until the number becomes 0
            remainder = number % 10; // Get the last digit of the number
            reverse = reverse * 10 + remainder; // Build the reverse number
            number = number / 10; // Remove the last digit from the original number
        }

        System.out.println("The reverse of the given number is: " + reverse); // Print the reversed number
    }
}
 