/*
WAP to calculate area of rectangle, area of Square and area of circle using method overloading
*/

public class Area {

    // Method to calculate the area of a rectangle
    double area(double width, double height) {
        return width * height;
    }

    // Method to calculate the area of a circle
    double area(double radius) {
        return (radius * radius) * 3.14;
    }

    // Method to calculate the area of a square
    int area(int sides) {
        return sides * sides;
    }

    // The main method where the program execution begins
    public static void main(String[] args) {
        // Creating an instance of the Area class
        Area a = new Area();

        // Calculating and printing the area of a rectangle
        System.out.println("Area of Rectangle: " + a.area(7.5, 7));

        // Calculating and printing the area of a circle
        System.out.println("Area of Circle: " + a.area(45.5));

        // Calculating and printing the area of a square
        System.out.println("Area of Square : " + a.area(9));
    }
}
