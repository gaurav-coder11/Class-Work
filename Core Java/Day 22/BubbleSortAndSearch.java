import java.util.Scanner;

public class BubbleSortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // Create an array of size 10 to store integers

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); // Read 10 integers from the user and store them in the array
        }

        // Bubble Sort Algorithm to sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt(); // Read the element to be searched from the user

        boolean found = false;
        int index = -1;

        // Linear Search to find the index of the searchElement in the sorted array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;
                index = i;
                break; // Element found, no need to continue searching
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
