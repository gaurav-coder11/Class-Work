/*switch case in java
swich(choice){
	case1:
	code body;
	break;
	.
	.
	.
	default:
	code body;
	break;
}
*/
import java.util.Scanner;

class SwitchCaseDemo {
    public static void main(String args[]) {
        int a, b, ch;
  
        Scanner sc = new Scanner(System.in); // Create a single Scanner object for input

        System.out.print("Enter the first number: ");
        a = sc.nextInt(); // Read the first number

        System.out.print("Enter the second number: ");
        b = sc.nextInt(); // Read the second number

        System.out.println("Enter a number from 1 to 4 for operation selection:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        ch = sc.nextInt(); // Read the user's choice

        switch (ch) {
            case 1:
                System.out.print("Addition: " + (a + b));
                break;

            case 2:
                System.out.print("Subtraction: " + (a - b));
                break;

            case 3:
                System.out.print("Multiplication: " + (a * b));
                break;

            case 4:
                if (b != 0) { // Check for division by zero
                    System.out.print("Division: " + (a / (double) b)); // Convert one operand to double for accurate division
                } else {
                    System.out.print("Division by zero is not allowed");
                }
                break;

            default:
                System.out.print("Invalid choice");
                break;
        }
    }
}
