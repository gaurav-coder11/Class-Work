//addition of two number using inheritance

import java.util.Scanner;

// Define a base class named BaseClass
class BaseClass {
    int a, b;
    double sum;
    Scanner scanner = new Scanner(System.in);

    // Method for accepting two numbers
    public void accept() {
        System.out.println("Enter First Number: ");
        a = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        b = scanner.nextInt();
    }
}

// Define a derived class named Derived that extends BaseClass
class Derived extends BaseClass {
    // Method for displaying the sum of two numbers
    public void display() {
        sum = a + b;
        System.out.println("Addition Of Two Numbers Is: " + sum);
    }
}

// Define a class named InheritDemo for the main method
public class InheritDemo {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.accept(); // Call the accept method to input two numbers
        derived.display(); // Call the display method to calculate and display the sum
    }
}

