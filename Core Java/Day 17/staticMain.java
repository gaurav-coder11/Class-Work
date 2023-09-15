//Static & Static Method
import java.util.Scanner;

class StaticDemo {
    int res;

    // Non-static method for addition
    public void add(int a, int b) {
        res = a + b;
        System.out.println("The Addition Is: " + res);
    }

    // Static method for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class StaticMain {
    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();

        // Call the non-static method 'add' using an instance of StaticDemo
        sd.add(3, 4);

        // Call the static method 'multiply' using the class name 'StaticDemo'
        System.out.println("Multiplication is " + StaticDemo.multiply(8, 9));
    }
}
