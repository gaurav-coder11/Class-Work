/*
WAP to get details  of vehicle i.e. Bike and Car.Override engine() method to describe both bike and car
create Vehicle as base class and BIke ,Car as derived class
*/
class Vehicle {
    public void engine() {
        System.out.println("This is Engine Method");
    }
}

class Bike extends Vehicle {
    @Override
    public void engine() {
        super.engine(); // Invoke the engine method of the superclass (Vehicle)
        System.out.println("This is Bike Engine Method");
    }
}

class Car extends Bike {
    @Override
    public void engine() {
        super.engine(); // Invoke the engine method of the superclass (Bike)
        System.out.println("This is Car Engine Method");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine(); // Call the engine method of the Car class
    }
}
