/*

******
*    *
*    *
*    *
*    *
******

*/


public class DemPa {
    public static void main(String args[]) {
        int i, j;

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                // Check if the current position is on the boundary of the square
                if (i == 0 || j == 0 || i == 6 - 1 || j == 6 - 1) {
                    System.out.print("*"); // Print asterisk for boundary positions
                } else {
                    System.out.print(" "); // Print a space for interior positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
