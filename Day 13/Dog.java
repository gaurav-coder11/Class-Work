import java.util.Scanner;

public class Dog {
    String breed;
    int age;
    String colour;
    Scanner sc = new Scanner(System.in);

    // Method to input dog information
    void input() {
        System.out.print("Enter dog breed color : ");
        breed = sc.nextLine();

        System.out.print("Enter dog age : ");
        age = sc.nextInt();

        sc.nextLine(); // Consume the newline character
        System.out.print("Enter dog colour : ");
        colour = sc.nextLine();
    }

    // Method to simulate the dog barking
    void barking() {
        System.out.println("The dog is barking: Bhoo, Bhoo...");
    }

    // Method to indicate that the dog is hungry
    void hungry() {
        System.out.println("The dog is very hungry.");
    }

    // Method to mention the dog's sleeping time
    void sleeping() {
        System.out.println("The dog's sleeping time is 10 PM every night.");
    }

    // Method to display dog information
    void output() {
        System.out.println("Dog breed : " + breed);
        System.out.println("Dog age : " + age + " years");
        System.out.println("Dog color : " + colour);
    }

    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog();

        // Call methods to input dog information, display it, and simulate dog actions
        dog.input();
        dog.output();
        dog.barking();
        dog.hungry();
        dog.sleeping();
    }
}
