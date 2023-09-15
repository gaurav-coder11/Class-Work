/*
create a class Shape with fields length,breadth,radius and other two classes rectangle and Circle extending from that Shape class.Apply other methods to calculate area of rectangle and circle.
*/

class Shape {
    double length, breadth, radius, area, pi = 3.14;
}

class Rectangle extends Shape {
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        this.radius = radius;
        area = pi * radius * radius;
    }
}

public class AreaCalculate {
    public static void main(String args[]) {
        // Create a Rectangle object with length 8 and breadth 9
        Rectangle rec = new Rectangle(8, 9);
        System.out.println("Area of Rectangle is: " + rec.area);

        // Create a Circle object with radius 5
        Circle cir = new Circle(5);
        System.out.println("Area of Circle is: " + cir.area);
    }
}
