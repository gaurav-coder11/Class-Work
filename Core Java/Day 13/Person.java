/*

WAP to create a class Person with Data members as ubique_id,name,age,city and gender also include methods study() sleep() and play()

*/

import java.util.*;

public class Person {
    int unique_id, age, s_time, sl_time, p_time;
    String name;
    String city;
    String gender;

    Scanner sc = new Scanner(System.in);

    // Method to input personal information
    public void input() {
        System.out.print("Enter your name : ");
        name = sc.nextLine();

        System.out.print("Enter your ID : ");
        unique_id = sc.nextInt();

        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your City Name: ");
        city = sc.nextLine();

        System.out.print("Enter your Gender : ");
        gender = sc.nextLine();
    }

    // Method to input study hours
    public void study() {
        System.out.println("Enter your Study Hour : ");
        s_time = sc.nextInt();
    }

    // Method to input sleep hours
    public void sleep() {
        System.out.println("Enter your Sleep Time : ");
        sl_time = sc.nextInt();
    }

    // Method to input play hours
    public void play() {
        System.out.println("Enter your Play Time : ");
        p_time = sc.nextInt();
    }

    // Method to display the gathered information
    public void display() {
        System.out.println("Student Information: ");
        System.out.println("Your name : " + name);
        System.out.println("Your ID : " + unique_id);
        System.out.println("Your age : " + age);
        System.out.println("Your City : " + city);
        System.out.println("Your Gender : " + gender);
        System.out.println("Your Study Hour: " + s_time);
        System.out.println("Your Sleep Time : " + sl_time);
        System.out.println("Your Play Time : " + p_time);
    }

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();
        person.input(); // Call the input method to gather information
        person.study(); // Call the study method to input study hours
        person.sleep(); // Call the sleep method to input sleep hours
        person.play();  // Call the play method to input play hours
        person.display(); // Call the display method to show the gathered information
    }
}
