/*
WAP to input set of N  characters. Find and display the number of 
uppercase and lowercase charachers.Assume that none of the 
character is digit or a special character
*/
// Java program to count the uppercase,
// lowercase, special characters
// and numeric values
/*
import java.util.Scanner;

class Count
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String Value: ");
        String str = sc.nextLine();

        int upper = 0, lower = 0, number = 0, special = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);
    }
}
*/
import java.util.Scanner;

public class CountUpperCaseLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int N = sc.nextInt(); // Read the number of characters

        int uppercaseCount = 0; // Counter for uppercase characters
        int lowercaseCount = 0; // Counter for lowercase characters

        System.out.println("Enter " + N + " characters:");

        // Loop to read N characters and count uppercase and lowercase characters
        for (int i = 0; i < N; i++) {
            char ch = sc.next().charAt(0);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }

        // Display the counts of uppercase and lowercase characters
        System.out.println("Number of Uppercase characters: " + uppercaseCount);
        System.out.println("Number of Lowercase characters: " + lowercaseCount);
    }
}
