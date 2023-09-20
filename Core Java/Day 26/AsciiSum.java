/*
WAP to accept a set of any 10 characters. Calculate and print the sum of ASCII codes of the characters.


import java.util.Scanner;

// Define a public class named Alphabate
public class AsciiSum {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        char char0, char1, char2, char3, char4, char5, char6, char7, char8, char9; // Declare variables to store characters
        int sumASCII=0, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
        // Prompt the user to enter a character
        System.out.println("Enter a 1st Character");
        char0 = sc.next().charAt(0); // Read the character
 		num0 = (int) char0;
 		System.out.println("Character 1: "+char0 + " - ASCII: " + (int) char0);

 		System.out.println("Enter a 2nd Character");
        char1 = sc.next().charAt(0); // Read the character
 		num1 = (int) char1;
 		System.out.println("Character 2: "+char1 + " - ASCII: " + (int) char1);
    
    	System.out.println("Enter a 1st Character");
        char2 = sc.next().charAt(0); // Read the character
 		num2 = (int) char2;
 		System.out.println("Character 1: "+char2 + " - ASCII: " + (int) char2);
    
    	System.out.println("Enter a 3rd Character");
        char3 = sc.next().charAt(0); // Read the character
 		num3 = (int) char3;
 		System.out.println("Character 3: "+char3 + " - ASCII: " + (int) char3);
    
    	System.out.println("Enter a 4th Character");
        char4 = sc.next().charAt(0); // Read the character
 		num4 = (int) char4;
 		System.out.println("Character 4: "+char4 + " - ASCII: " + (int) char4);
    
    	System.out.println("Enter a 5th Character");
        char5 = sc.next().charAt(0); // Read the character
 		num5 = (int) char5;
 		System.out.println("Character 5: "+char5 + " - ASCII: " + (int) char5);
    
    	System.out.println("Enter a 6th Character");
        char6 = sc.next().charAt(0); // Read the character
 		num6 = (int) char6;
 		System.out.println("Character 6: "+char6 + " - ASCII: " + (int) char6);
    
    	System.out.println("Enter a 7th Character");
        char6 = sc.next().charAt(0); // Read the character
 		num6 = (int) char6;
 		System.out.println("Character 7: "+char6 + " - ASCII: " + (int) char6);

 		System.out.println("Enter a 8th Character");
        char7 = sc.next().charAt(0); // Read the character
 		num7 = (int) char7;
 		System.out.println("Character 8: "+char7 + " - ASCII: " + (int) char7);
    
    	System.out.println("Enter a 9th Character");
        char8 = sc.next().charAt(0); // Read the character
 		num8 = (int) char8;
 		System.out.println("Character 9: "+char8 + " - ASCII: " + (int) char8);
    
    	System.out.println("Enter a 10th Character");
        char9 = sc.next().charAt(0); // Read the character
 		num9 = (int) char9;
 		System.out.println("Character 10: "+char9 + " - ASCII: " + (int) char9);
    
    	sumASCII=num0+ num1+ num2+ num3+ num4+ num5+ num6+ num7+ num8+ num9;
    	System.out.println("Sum of num = "+sumASCII);
    }
}
*/

import java.util.Scanner;

public class AsciiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] characters = new char[10]; // Array to store the characters
        int sumASCII = 0; // Variable to store the sum of ASCII codes

        System.out.println("Enter 10 characters:");

        // Loop to read 10 characters from the user
        for (int i = 0; i < 10; i++) {
            characters[i] = sc.next().charAt(0);
            sumASCII += (int) characters[i]; // Add ASCII code to the sum
        }

        // Display the characters and their corresponding ASCII codes
        System.out.println("Characters and their ASCII codes:");
        for (int i = 0; i < 10; i++) {
            System.out.println(characters[i] + " - ASCII: " + (int) characters[i]);
        }

        // Display the sum of ASCII codes
        System.out.println("Sum of ASCII codes: " + sumASCII);
    }
}
