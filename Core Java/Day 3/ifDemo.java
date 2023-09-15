import java.util.Scanner;

public class ifDemo {
    public static void main(String args[]) {
        // Declare two integer variables a and b
        int a, b;

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the 1st number
        System.out.print("Enter Your 1st Number:");
        a = sc.nextInt();

        // Prompt the user to enter the 2nd number
        System.out.print("Enter Your 2nd Number:");
        b = sc.nextInt();

        // Display the values of a and b
        System.out.println("a is=" + a);
        System.out.println("b is=" + b);

        // Check if a is greater than b
        if (a > b) {
            System.out.println("a is greater than b");
        }

        // Check if a is less than b
        if (a < b) {
            System.out.println("a is less than b");
        }

        // Check if a is equal to b
        if (a == b) {
            System.out.println("Your Entered Number Is Same/Equal");
        } else {
            // If none of the above conditions are met, print a generic message
            System.out.println("You Entered Negative Number");
        }
    }
}
