import java.util.*;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter;
        int i = 0;
        int num = 0;
        int sumOdd = 0;
        int sumEven = 0;

        System.out.println("Enter integers other than Zero: ");
        num = sc.nextInt(); // Read the first integer from the user

        System.out.println("The numbers you entered are: ");

        // This loop runs until the user enters a zero or a negative number
        for (i = num; i >= 0; i = sc.nextInt()) {
            if (i % 2 == 0) {
                sumEven = sumEven + i; // If i is even, add it to the sum of even numbers
            } else {
                sumOdd = sumOdd + i; // If i is odd, add it to the sum of odd numbers
            }
        }

        System.out.println("Even sum: " + sumEven); // Print the sum of even numbers
        System.out.println("Odd sum: " + sumOdd); // Print the sum of odd numbers
    }
}
