//Example program of narrowing type casting
public class Narrowing {
    public static void main(String[] args) {
        // Declare and initialize a double value
        double myDouble = 8558.6400000;

        // Convert double to float (explicit casting)
        float myFloat = (float) myDouble;

        // Convert float to long (explicit casting)
        long myLong = (long) myFloat;

        // Convert long to int (explicit casting)
        int myInt = (int) myLong;

        // Convert int to short (explicit casting)
        short myShort = (short) myInt;

        // Convert short to byte (explicit casting)
        byte myByte = (byte) myShort;

        // Print the original and converted values
        System.out.println("Original double: " + myDouble);
        System.out.println("Converted float: " + myFloat);
        System.out.println("Converted long: " + myLong);
        System.out.println("Converted int: " + myInt);
        System.out.println("Converted short: " + myShort);
        System.out.println("Converted byte: " + myByte);
    }
}
