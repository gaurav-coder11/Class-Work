import java.util.Scanner;

class Rectangle1 {
    double length;
    double breadth;
    Scanner sc = new Scanner(System.in);

    // Constructor to input length and breadth
    Rectangle1() {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    // Method to calculate and print the area
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area is: " + area);
    }
}

public class Rectangle_Main {
    public static void main(String[] args) {
        // Create a Rectangle1 object
        Rectangle1 rect = new Rectangle1();

        // Calculate and print the area
        rect.calculateArea();
    }
}
