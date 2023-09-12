//WAP to print even numbers in a range of 1 to 100
public class OnetoHundredEvenNumbers {
    public static void main(String args[]) {
        int i; // Declare an integer variable i

        System.out.print("List of even numbers from 1 to 100: "); // Print a message

        for (i = 1; i <= 100; i++) { // Loop from 1 to 100
            if (i % 2 == 0) { // Check if the current number (i) is even
                System.out.print(i + " "); // If even, print the number followed by a space
            }
        }
    }
}
 