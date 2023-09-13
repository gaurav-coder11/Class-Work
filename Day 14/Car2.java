/*WAP to get car details from the  user.
Here properties to display are  brand,modelname,topspeed 
 and write corresponding getters and setters
Atleast two car details should be visible
*/
import java.util.Scanner;

public class Car2 {
    private String brand;
    private String modelname;
    private int topspeed;

    // Setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for brand
    public String getBrand() {
        return brand;
    }

    // Setter method for model name
    public void setModelName(String modelname) {
        this.modelname = modelname;
    }

    // Getter method for model name
    public String getModelName() {
        return modelname;
    }

    // Setter method for top speed
    public void setTopSpeed(int topspeed) {
        this.topspeed = topspeed;
    }

    // Getter method for top speed
    public int getTopSpeed() {
        return topspeed;
    }

    public static void main(String args[]) {
        // Create an instance of the Car2 class
        Car2 car = new Car2();

        // Set car attributes
        car.setBrand("Toyota");
        car.setModelName("Supra");
        car.setTopSpeed(349);

        // Create another instance of the Car2 class
        Car2 car1 = new Car2();
        car1.setBrand("Bugatti");
        car1.setModelName("Chiron");
        car1.setTopSpeed(420);

        // Print car information
        System.out.println("Car Brand is: " + car.getBrand());
        System.out.println("Car ModelName is: " + car.getModelName());
        System.out.println("Car Top Speed is: " + car.getTopSpeed());

        System.out.println("Car Brand is: " + car1.getBrand());
        System.out.println("Car Model Name is: " + car1.getModelName());
        System.out.println("Car Top Speed is: " + car1.getTopSpeed());
    }
}
