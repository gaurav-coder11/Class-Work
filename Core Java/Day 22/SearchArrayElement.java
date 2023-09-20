/*
Accept array of integer with size 10 .Take dat afrom user .
Ask user to search an element and find whether that element 
is present in the given arrray or not .If present then mention 
index number as well
*/
import java.util.Scanner;

public class SearchArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // Array of size 10 to store integers

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); // Read 10 integers from the user and store them in the array
        }

        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt(); // Read the element to be searched from the user

        boolean found = false; // A flag to track whether the element is found
        int index = -1; // Index to store the position of the found element

        // Loop through the array to perform a linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true; // Set the flag to true if the element is found
                index = i; // Store the index where the element is found
                break; // Exit the loop because there's no need to continue searching
            }
        }

        // Display the result of the search
        if (found) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
