import java.util.Scanner;

public class StringComparision {
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

        // Check the result of the comparison and display a message
        if (res == 0) {
            System.out.println("Entered Two Strings Are Equal");
        } else {
            System.out.println("Entered Two Strings Are Not Equal!!!");
        }
    }
}
