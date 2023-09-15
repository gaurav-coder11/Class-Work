/*
Mr.John wants to buy a car but he needs 
color of the car as blue.And In Car showroom 
THere Are black,white,Red and blue cars Are 
available.Now Accept some basic Information 
from the user and based on that make decision 
whether blue car is available or not.

Basic info(Cust_name,brand,color)

Based on that color print a msg  
"john Congradulation you purchased 
your dream car of blue color +brand

*/
import java.util.Scanner;

class CarShop {
    public static void main(String args[]) {
        String color, name, carChoice; // Declare variables for user input

        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Prompt and read user's name
        System.out.print("What is your Name: ");
        name = sc.nextLine();

        // Display a welcome message with the user's name
        System.out.println("Welcome, " + name);

        // Display car options
        System.out.println("Car Options:");
        System.out.println("1. Toyota");
        System.out.println("2. Chevrolet");
        System.out.println("3. Jeep");
        System.out.println("4. Tata");
        System.out.println("5. Honda");

        // Prompt and read the user's car choice
        System.out.print("Which Car You Want: ");
        carChoice = sc.nextLine();

        // Prompt the user to choose a car color
        System.out.println("Please Choose Car Colour:");
        System.out.println("1. BLACK");
        System.out.println("2. WHITE");
        System.out.println("3. RED");
        System.out.println("4. BLUE");

        // Read the user's choice for car color
        color = sc.nextLine();

        // Use a switch statement to determine the color chosen and provide a message
        switch (color) {
            case "BLACK":
            case "black":
                System.out.println("Congratulations, " + name + "! You purchased a " + carChoice + " car in BLACK.");
                break;

            case "WHITE":
            case "white":
                System.out.println("Congratulations, " + name + "! You purchased a " + carChoice + " car in WHITE.");
                break;

            case "RED":
            case "red":
                System.out.println("Congratulations, " + name + "! You purchased a " + carChoice + " car in RED.");
                break;

            case "BLUE":
            case "blue":
                System.out.println("Congratulations, " + name + "! You purchased a " + carChoice + " car in BLUE.");
                break;

            default:
                System.out.println("Sorry, " + name + "! The chosen color for your " + carChoice + " car is not available in the showroom.");
                break;
        }
    }
}
