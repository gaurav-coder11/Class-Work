public class CompareThreeNumbers {
    public static void main(String[] args) {
        int num1 = 55;
        int num2 = 25;
        int num3 = 88;

        int max = num1; // Assume num1 is the largest initially

        // Compare num2 with max
        if (num2 > max) {
            max = num2;
        }

        // Compare num3 with max
        if (num3 > max) {
            max = num3;
        }

        System.out.println("The largest number is: " + max);
    }
}
