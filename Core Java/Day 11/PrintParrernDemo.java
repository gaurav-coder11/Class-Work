class PrintPatternDemo {
    public static void main(String[] args) {
        int i, j;

        // First part: Print numbers in ascending order
        for (i = 1; i <= 5; i++) { // Loop for rows (1 to 5)
            for (j = 1; j <= i; j++) { // Loop for each number in the row
                System.out.print(j); // Print the number
            }
            System.out.println(" "); // Move to the next line after each row
        }

        // Second part: Print numbers in descending order
        for (i = 4; i > 0; i--) { // Loop for rows (4 to 1)
            for (j = 1; j <= i; j++) { // Loop for each number in the row
                System.out.print(j); // Print the number
            }
            System.out.println(" "); // Move to the next line after each row
        }
    }
}
