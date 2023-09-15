/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21

*/
class PrintPattern1 {
    public static void main(String[] args) {
        int i, j, num = 1;

        for (i = 1; i <= 5; i++) { // Loop for rows (1 to 5)
            for (j = 1; j <= i; j++) { // Loop for each number in the row
                System.out.print(num + " "); // Print the number followed by a space
                num++; // Increment the number for the next iteration
            }
            System.out.println(" "); // Move to the next line after each row
        }
    }
}
