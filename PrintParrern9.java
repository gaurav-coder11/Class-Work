/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/

class PrintPattern9 {
    public static void main(String[] args) {
        int i, j, num = 1;

        // First part: Print numbers in ascending order
        for (i = 1; i <= 5; i++) { // Loop for rows (1 to 5)
            for (j = 1; j <= i; j++) { // Loop for each number in the row
                System.out.print(num + " "); // Print the number followed by a space
                num++; // Increment the number for the next iteration
            }
            System.out.println(" "); // Move to the next line after each row
        }

        // Second part: Print numbers in ascending order (same pattern as the first part)
        for (i = 1; i <= 5; i++) { // Loop for rows (1 to 5)
            for (j = 1; j <= i; j++) { // Loop for each number in the row
                System.out.print(num + " "); // Print the number followed by a space
                num++; // Increment the number for the next iteration
            }
            System.out.println(" "); // Move to the next line after each row
        }
    }
}
