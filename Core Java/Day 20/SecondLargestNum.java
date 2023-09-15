//WAP to find Second largest number in an array
public class SecondLargestNum {

    public static void main(String[] args) {

        int[] a = new int[] { 23, 55, 77, 24, 62 };
        int temp = 0;

        // Sorting the array in ascending order
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        // Finding and printing the second-largest number
        System.out.println("\nSecond largest number is: " + a[a.length - 2]);
    }
}
