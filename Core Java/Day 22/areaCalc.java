/*
Write a Java program to create a class called Shape with a method called getArea(). 
Create a subclass called Rectangle that overrides the getArea() method to calculate 
the area of a rectangle.
*/
import java.util.Scanner;

// Base class Shape
class Shape {
    // Default implementation for getting the area of a shape
    public double getArea() {
        return 0.0; // Default implementation returns 0
    }
}

// Derived class Rectangle, inherits from Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to initialize the width and height of the rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the getArea method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return width * height; // Area of rectangle = width * height
    }
}

public class areaCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter width and height
        System.out.print("Enter Width: ");
        double width = sc.nextDouble();

        System.out.print("Enter Height: ");
        double height = sc.nextDouble();

        // Create a Rectangle object with the user-provided width and height
        Rectangle rectangle = new Rectangle(width, height);

        // Calculate and print the area of the rectangle
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}

