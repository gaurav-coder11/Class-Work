import java.util.Scanner;

// Corrected the class name to "BaseClass"
class BaseClass {
    int a, b;
    double sum;
    Scanner scanner = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter First Number: ");
        a = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        b = scanner.nextInt();
    }
}

class Derived extends BaseClass {
    public void display() {
        sum = a + b;
        System.out.println("Addition Of Two Numbers Is: " + sum);
    }
}

public class InheritDemo {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.accept(); // Call the accept method to input numbers
        derived.display(); // Call the display method to calculate and display the sum
    }
}
