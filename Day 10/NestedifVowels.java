import java.util.Scanner;

public class NestedifVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input

        char chara; // Declaring a variable to store the input character

        System.out.print("Enter Alphabet: ");
        chara = sc.next().charAt(0); // Read the first character of the input string and store it in the 'chara' variable

        // Converting the input character to lowercase for easy comparison
        chara = Character.toLowerCase(chara);

        // Using else-if ladder to check if the character is a vowel and print the appropriate message
        if (chara == 'a') {
            System.out.println(chara+" It's a Vowel");
        } else if (chara == 'e') {
            System.out.println(chara+" It's a Vowel");
        } else if (chara == 'i') {
            System.out.println(chara+" It's a Vowel");
        } else if (chara == 'o') {
            System.out.println(chara+" It's a Vowel");
        } else if (chara == 'u') {
            System.out.println(chara+" It's a Vowel");
        } else {
            System.out.println(chara+" It's a Consonant");
        }

        sc.close(); // Closing the Scanner to release the resources
    }
}
