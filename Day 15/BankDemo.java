/*Create a bank class with withdraw and deposit methods.
assign balance amount and perform the said Operations
*/
// Import the Scanner class to enable user input
import java.util.Scanner;

// Define a class named BankDemo
class BankDemo {
    // Initialize the initial balance to 50,000
    double balance = 50000;
    double amount; // Variable to store withdrawal or deposit amount
    Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

    // Method for withdrawing money
    public void withdraw() {
        // Display the current balance
        System.out.println("Your Current Balance Is: " + balance);
        System.out.print("Enter the amount to withdraw: ");
        amount = sc.nextDouble(); // Read the withdrawal amount from the user

        // Check if the withdrawal amount is valid and within the available balance
        if (amount > 0 && amount <= balance) {
            balance = balance - amount; // Deduct the withdrawal amount from the balance
            System.out.println("Withdrawal successful");
            System.out.println("Your total balance is : " + balance); // Display the updated balance
        } else {
            System.out.println("Insufficient balance"); // Display an error message for insufficient balance
        }
    }

    // Method for depositing money
    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        amount = sc.nextDouble(); // Read the deposit amount from the user
        if (amount > 0) {
            balance = balance + amount; // Add the deposit amount to the balance
            System.out.println("Deposit successful");
            System.out.println("Your total balance is : " + balance); // Display the updated balance
        } else {
            System.out.println("Invalid deposit amount"); // Display an error message for invalid deposit amount
        }
    }

    // Main method where the program execution begins
    public static void main(String args[]) {
        BankDemo bank = new BankDemo(); // Create an instance of the BankDemo class
        bank.withdraw(); // Call the withdraw method to withdraw money
        bank.deposit(); // Call the deposit method to deposit money
    }
}
