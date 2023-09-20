import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayElement1 {
    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the target element is found
            }
        }
        return -1; // Element not found in the array
    }

    // Binary search method (assuming the array is sorted)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index where the target element is found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found in the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // Array of size 10

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); // Sort the array for binary search

        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();

        int linearIndex = linearSearch(arr, searchElement);
        int binaryIndex = binarySearch(arr, searchElement);

        if (linearIndex != -1) {
            System.out.println("Linear Search: Element found at index " + linearIndex);
        } else {
            System.out.println("Linear Search: Element not found in the array.");
        }

        if (binaryIndex != -1) {
            System.out.println("Binary Search: Element found at index " + binaryIndex);
        } else {
            System.out.println("Binary Search: Element not found in the array.");
        }
    }
}
