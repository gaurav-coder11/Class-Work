public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 7; // Adjust this value to control the size of the butterfly

        // Loop to print the upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left half of the wing (ascending order of asterisks)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Calculate the number of spaces between the wings
            int spaces = 2 * (n - i);

            // Print the spaces between the wings
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print right half of the wing (ascending order of asterisks)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line after completing a row
        }

        // Loop to print the lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left half of the wing (descending order of asterisks)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Calculate the number of spaces between the wings
            int spaces = 2 * (n - i);

            // Print the spaces between the wings
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print right half of the wing (descending order of asterisks)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line after completing a row
        }
    }
}
