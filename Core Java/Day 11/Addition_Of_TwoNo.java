import java.util.*;

class Addition_Of_TwoNo {
    Float a, b, res;

    // Method to accept input from the user
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st No: ");
        a = sc.nextFloat();
        System.out.print("Enter Your 2nd No: ");
        b = sc.nextFloat();
    }

    // Method to calculate and display the addition
    public void displaycal() {
        System.out.print("Your Addition Is: " + (a + b));
    }

    public static void main(String args[]) {
        Addition_Of_TwoNo obj = new Addition_Of_TwoNo();
        obj.add(); // Call the add method to input the numbers
        obj.displaycal(); // Call the displaycal method to calculate and display the addition
    }
}
