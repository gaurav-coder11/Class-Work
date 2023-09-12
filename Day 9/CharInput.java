import java.util.*;

class CharInput {
    public static void main(String[] args) {
        String name;
        char gender;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = sc.nextLine();

        System.out.print("Enter Your Gender (M/F): ");
        gender = sc.next().charAt(0); // Use next().charAt(0) to capture the first character

        if (gender == 'M' || gender == 'm') { // Compare with 'M' or 'm' to cover both cases
            System.out.println("You Can Do Hard Work");
        } else if (gender == 'F' || gender == 'f') { // Check for 'F' or 'f' for female
            System.out.println("You Are Strong");
        } else {
            System.out.println("Invalid Gender Input");
        }
    }
}
