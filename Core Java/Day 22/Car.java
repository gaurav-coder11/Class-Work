package vehicles; // The package declaration indicates that this class belongs to the "vehicles" package.

public class Car implements Vehicle { // The Car class implements the Vehicle interface.
    public void run() {
        System.out.println("Car is running");
    }

    public void speed() {
        System.out.println("Speed of Car is 50mk/h");
    }

    public static void main(String args[]) {
        Car c = new Car(); // Create an instance of the Car class.

        c.run(); // Call the run method of the Car class, which prints "Car is running".
        c.speed(); // Call the speed method of the Car class, which prints "Speed of Car is 50mk/h".

        System.out.println("Hello World"); // Print "Hello World" to the console.
    }
}
package vehicles; // The package declaration indicates that this class belongs to the "vehicles" package.

public class Car implements Vehicle { // The Car class implements the Vehicle interface.
    public void run() {
        System.out.println("Car is running");
    }

    public void speed() {
        System.out.println("Speed of Car is 50mk/h");
    }

    public static void main(String args[]) {
        Car c = new Car(); // Create an instance of the Car class.

        c.run(); // Call the run method of the Car class, which prints "Car is running".
        c.speed(); // Call the speed method of the Car class, which prints "Speed of Car is 50mk/h".

        System.out.println("Hello World"); // Print "Hello World" to the console.
    }
}
