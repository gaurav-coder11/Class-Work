// WAP to find gretest value in array

import java.util.Scanner;

// Define a class named GreatestNumberArray
public class gretestNumberArray {
    public static void main(String[] args) {
        // Declare variables
        int i, temp = 0, j;
        int[] a = new int[5];

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter 5 numbers for Array One
        System.out.println("Enter 5 numbers: ");

        // Read and store 5 numbers in the array 'a'
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the array in ascending order using a simple bubble sort algorithm
        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                // Compare the current element with the next element
                if (a[i] > a[j]) {
                    // Swap elements if necessary
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Print the greatest number, which will be the last element after sorting
        System.out.println("Greatest Number Is: " + a[4]);

        // Close the Scanner to release resources
        sc.close();
    }
}
