public class DemP {
    public static void main(String args[]) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row of asterisks
        }
    }
}
