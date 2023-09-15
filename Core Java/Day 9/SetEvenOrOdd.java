/*
 Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
*/
import java.util.Scanner;

public class SetEvenOrOdd {
    public static void main(String args[]) {
        int num, sum_even = 0, sum_odd = 0;
        char ans;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                sum_even = sum_even + num; // If num is even, add it to the sum of even numbers
            } else {
                sum_odd = sum_odd + num; // If num is odd, add it to the sum of odd numbers
            }

            System.out.println("Do you want to continue? (y/n)");
            ans = sc.next().charAt(0); // Read the user's choice to continue or not

        } while (ans == 'y' || ans == 'Y'); // Continue the loop if the user enters 'y' or 'Y'

        System.out.println("Sum of even numbers is: " + sum_even);
        System.out.println("Sum of odd numbers is: " + sum_odd);
    }
}
