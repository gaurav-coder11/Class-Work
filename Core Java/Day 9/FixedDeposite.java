/*
WAP to  calculate interest rate of Fixed deposite or Saving intertest based 
on choice provided by user whether he wants to keep money for fixed deposite or saving .
Interest Rate for fixed Deposit is 7 % and for saving it is 3.5%

*/
import java.util.Scanner;

class FixedDeposit {
    public static void main(String[] args) {
        double principal, time, interest;
        int choice;

        // Create an object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Take input from users
        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the time period (years): ");
        time = sc.nextDouble();

        System.out.println("Choose the type of account:");
        System.out.println("1. Savings Account");
        System.out.println("2. Fixed Deposit Account");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Calculate interest for savings account (3.5% annual interest rate)
                interest = (principal * time * 3.5) / 100;
                System.out.println("Interest earned for Savings Account: " + interest);
                break;

            case 2:
                // Calculate interest for fixed deposit account (7% annual interest rate)
                interest = (principal * time * 7) / 100;
                System.out.println("Interest earned for Fixed Deposit Account: " + interest);
                break;

            default:
                System.out.println("INVALID INPUT: Please choose 1 for Savings or 2 for Fixed Deposit.");
                break;
        }
    }
}
