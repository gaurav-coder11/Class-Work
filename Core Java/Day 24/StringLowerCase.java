/*If the first string is lexicographically greater than the 
second string, it returns a positive number (difference of character 
value). If the first string is less than the second string 
lexicographically, it returns a negative number, and, If 
the first string is lexicographically equal to the second 
string, it returns 0. 
*/
import java.util.Scanner;

public class StringLowerCase {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        // Display the entered strings
        System.out.println("\nFirst String = " + str1);
        System.out.println("Second String = " + str2);

        // Compare the two strings using the compareTo method
        int res = str1.compareTo(str2);
        System.out.println("Comparison Result: " + res);

        // Convert the first string to lowercase
        String str3 = str1.toLowerCase();
        System.out.println("First String in Lowercase: " + str3);
    }
}
