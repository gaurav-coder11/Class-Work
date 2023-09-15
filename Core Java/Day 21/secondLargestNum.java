////WAP to find Second largest number in an array
import java.util.Scanner;

public class secondLargestNum {
    public static void main(String[] args) {
        int i, j, temp;
        int[] a = new int[5];

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter 5 numbers for Array
        System.out.println("Enter 5 numbers:");

        // Read and store 5 numbers in the array 'a'
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the array in descending order using a simple bubble sort algorithm
        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }


        // Print the second largest number
        System.out.println("Second Largest Number Is: " + a[1]);

        // Close the Scanner to release resources
        sc.close();
    }
}
