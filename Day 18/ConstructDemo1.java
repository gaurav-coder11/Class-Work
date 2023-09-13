class Dog {
    String name;
    int age;

    // Constructor for the Dog class
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructDemo1 {
    public static void main(String args[]) {
        // Create a Dog object with name "Tommy" and age 15
        Dog mydog = new Dog("Tommy", 15);

        // Print the name and age of the dog
        System.out.println("Dog's Name: " + mydog.name);
        System.out.println("Dog's Age: " + mydog.age);
    }
}
