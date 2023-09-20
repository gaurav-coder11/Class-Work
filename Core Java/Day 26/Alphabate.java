/*
wap to enter a letter and change the case of that letter and print the ASCII vavlue of it
*/

import java.util.Scanner;

// Define a public class named Alphabate
public class Alphabate {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        char char1, char2; // Declare variables to store characters
        
        // Prompt the user to enter a character
        System.out.println("Enter a Character");
        char1 = sc.next().charAt(0); // Read the character
        
        // Check if the entered character is uppercase
        if (Character.isUpperCase(char1) == true) {
            char2 = Character.toLowerCase(char1); // Convert to lowercase
            System.out.println("The Lower Case of " + char1 + " is " + char2);
            System.out.println("The ASCII value of " + char1 + " is " + (int) char2);
        } else {
            char2 = Character.toUpperCase(char1); // Convert to uppercase
            System.out.println("The Lower Case of " + char1 + " is " + char2);
            System.out.println("The ASCII value of " + char1 + " is " + (int) char2);
        }
    }
}
