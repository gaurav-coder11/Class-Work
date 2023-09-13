// Defining a class named methodOverloading
public class methodOverloading {

    // Method to add two integers
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add two doubles
    double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to add an integer and two doubles
    double add(int num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    // The main method where the program execution begins
    public static void main(String[] args) {
        // Creating an instance of the methodOverloading class
        methodOverloading mo = new methodOverloading();

        // Calling the add method with two integers and printing the result
        System.out.println("Sum of two numbers: " + mo.add(7, 7));

        // Calling the add method with two doubles and printing the result
        System.out.println("Sum of two numbers: " + mo.add(9.1, 9.2));

        // Calling the add method with an integer and two doubles, printing the result
        System.out.println("Sum of three numbers: " + mo.add(9, 9.2, 10.2));
    }
}
