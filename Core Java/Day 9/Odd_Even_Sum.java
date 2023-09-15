/*Write a program that reads a set of integers, 
and then prints the sum of the even and odd integers.
*/
import java.util.*;

class Odd_Even_Sum {
    public static void main(String[] args) {
        int num = 0, i = 0, oddsum = 0, evensum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Numbers:");

        while (true) { // Use an infinite loop to continuously input numbers
            num = sc.nextInt();

            if (num == 0) {
                break; // Exit the loop if the user enters 0
            }

            if (num % 2 == 0) {
                evensum += num; // Add even numbers to evensum
            } else {
                oddsum += num; // Add odd numbers to oddsum
            }
        }

        System.out.println("Sum of Even Numbers Is: " + evensum);
        System.out.println("Sum of Odd Numbers Is: " + oddsum);
    }
}
