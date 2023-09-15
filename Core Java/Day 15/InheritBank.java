import java.util.Scanner;

// Define a base class named BaseClass
class BaseClass {
    double balance = 50000;
    double amount;
    Scanner sc = new Scanner(System.in);

    // Method for withdrawing money
    public void withdraw() {
        System.out.println("Your Current Balance Is: " + balance);
        System.out.print("Enter the amount to withdraw: ");
        amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful ");
            System.out.println("Your total balance is : " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Define a derived class named Derived that extends BaseClass
class Derived extends BaseClass {

    // Method for depositing money
    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        amount = sc.nextDouble();
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful ");
            System.out.println("Your total balance is : " + balance);
        } else {
            System.out.println("Invalid deposit amount ");
        }
    }
}

// Define a class named InheritBank for the main method
public class InheritBank {
    public static void main(String[] args) {
        Derived dv = new Derived();
        dv.withdraw(); // Call the withdraw method to withdraw money
        dv.deposit();  // Call the deposit method to deposit money
    }
}
