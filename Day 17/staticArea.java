import java.util.Scanner;

class StaticArea {
    static double pi = 3.14;
    int r;
    double area;
    Scanner sc = new Scanner(System.in);

    public static void accept() {
        System.out.println("Enter Radius");
    }

    public void calculate() {
        r = sc.nextInt();
        area = pi * r * r;
        System.out.println("Area Of Circle is: " + area);
    }

    public static void main(String[] args) {
        StaticArea sa = new StaticArea();
        StaticArea.accept(); // Call the static method 'accept' using the class name 'StaticArea'
        sa.calculate();
    }
}

/*
Static variables and static methods are two important 
concepts in Java. Whenever a variable is declared as 
static, this means there is only one copy of it for 
the entire class, rather than each instance having 
its own copy. A static method means it can be called 
without creating an instance of the class
Static variables and methods in Java provide 
several advantages, including memory efficiency, 
global access, object independence, performance, 
and code organization.


Static Method in Java With Examples

The static keyword is used to construct methods that 
will exist regardless of whether or not any instances 
of the class are generated. Any method that uses the 
static keyword is referred to as a static method.

Features of static method:

A static method in Java is a method that is part of a 
class rather than an instance of that class.

Every instance of a class has access to the method.

Static methods have access to class variables 
(static variables) withou Static methods have access 
to class variables (static variables) without using 
the class’s object (instance).

Only static data may be accessed by a static method. 
It is unable to access data that is not static 
(instance variables).

In both static and non-static methods, static methods 
can be accessed directly.
*/