import java.util.Scanner;

class demo {
    public static void main(String args[]) {
        double a = 0, b = 0;
        int ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your performing Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        ch = sc.nextInt(); // Read the user's choice for the operation

        if (ch <= 4 && ch > 0) { // Check if the user's choice is valid (between 1 and 4)
            System.out.print("Enter the 1st Number: ");
            a = sc.nextDouble(); // Read the first number

            System.out.print("Enter the 2nd Number: ");
            b = sc.nextDouble(); // Read the second number
        }

        switch (ch) {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                if (b != 0) { // Check for division by zero
                    System.out.println("Division = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Not a valid choice");
                break;
        }
    }
}
