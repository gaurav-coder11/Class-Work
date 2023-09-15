import java.util.Scanner;

public class SwitchVowelsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input

        char chara; // Declaring a variable to store the input character

        System.out.print("Enter Alphabet: ");
        chara = sc.next().charAt(0); // Read the first character of the input string and store it in the 'chara' variable

        // Converting the input character to lowercase for easy comparison
        chara = Character.toLowerCase(chara);

        // Using switch statement to check if the character is a vowel and print the appropriate message
        switch (chara) {
            case 'a':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'e':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'i':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'o':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'u':
                System.out.println(chara+" It's a Vowel");
                break;
            case 'A':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'E':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'I':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'O':
            	System.out.println(chara+" It's a Vowel");
                break;
            case 'U':
                System.out.println(chara+" It's a Vowel");
                break;
            default:
                System.out.println(chara+" It's a Consonant");
                break;
        }

        sc.close(); // Closing the Scanner to release the resources
    }
}
