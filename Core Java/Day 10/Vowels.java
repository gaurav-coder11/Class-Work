//WAP to given character is Vowel or Consonant.
import java.util.*;

class ElseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input

        char chara; // Declaring a variable to store the input character

        System.out.print("Enter Alphabet: ");
        chara = sc.next().charAt(0); // Read the first character of the input string and store it in the 'chara' variable

        // Check if the character is a vowel (lowercase or uppercase) and print the appropriate message
        if (chara == 'a' || chara == 'e' || chara == 'i' || chara == 'o' || chara == 'u'
                || chara == 'A' || chara == 'E' || chara == 'I' || chara == 'O' || chara == 'U') {
            System.out.println(chara+" It's a Vowel");
        } else {
            System.out.println(chara+" It's a Consonant");
        }

        sc.close(); // Closing the Scanner to release the resources
    }
}
