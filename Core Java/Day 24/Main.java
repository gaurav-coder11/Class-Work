/*
WAP to implement multilevel inheritance to perform different operations in String
*/

class StringOperations {
    String inputString;

    // Constructor to initialize the input string
    StringOperations(String inputString) {
        this.inputString = inputString;
    }

    // Method to display the length of the string
    void displayLength() {
        System.out.println("Length of the string: " + inputString.length());
    }
}

class StringCaseOperations extends StringOperations {
    StringCaseOperations(String inputString) {
        super(inputString);
    }

    // Method to convert the string to uppercase
    void convertToUpperCase() {
        System.out.println("Uppercase string: " + inputString.toUpperCase());
    }

    // Method to convert the string to lowercase
    void convertToLowerCase() {
        System.out.println("Lowercase string: " + inputString.toLowerCase());
    }
}

class StringReverseOperations extends StringCaseOperations {
    StringReverseOperations(String inputString) {
        super(inputString);
    }

    // Method to reverse the string
    void reverseString() {
        String reversed = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";
        
        // Create an object of StringReverseOperations
        StringReverseOperations strOperations = new StringReverseOperations(input);

        // Perform different operations on the string
        strOperations.displayLength();
        strOperations.convertToUpperCase();
        strOperations.convertToLowerCase();
        strOperations.reverseString();
    }
}
