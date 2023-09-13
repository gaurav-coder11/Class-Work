//WAP to calculate area of rectangle,square and circle 
//using class and object concept

import java.util.*;

class Area {
    double len, hei, res, side, radius, pi = 3.142;

    // Method to get user input for dimensions
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length:");
        len = sc.nextDouble();
        System.out.print("Enter Height:");
        hei = sc.nextDouble();

        System.out.print("Enter Sides For square:");
        side = sc.nextDouble();

        System.out.print("Enter radius For Circle:");
        radius = sc.nextDouble();
    }

    // Method to calculate and display the area of a rectangle
    public void rectangle() {
        res = len * hei;
        System.out.println("The Area of Rectangle Is:" + res);
    }

    // Method to calculate and display the area of a square
    public void square() {
        res = side * side;
        System.out.println("The Area of square Is:" + res);
    }

    // Method to calculate and display the area of a circle
    public void circle() {
        res = pi * radius * radius;
        System.out.println("The Area of Circle Is:" + res);
    }
}

public class areaFind {
    public static void main(String args[]) {
        Area ar = new Area(); // Object creation
        ar.input(); // Get input from the user
        ar.rectangle(); // Calculate and display the area of a rectangle
        ar.square(); // Calculate and display the area of a square
        ar.circle(); // Calculate and display the area of a circle
    }
}
