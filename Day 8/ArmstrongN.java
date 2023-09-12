//WAP to given number is Armstrong
import java.util.Scanner;

class ArmstrongN {

    public static void main(String args[]) {

        int originalNum, digit, cubeSum = 0, num;

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        originalNum = num;

        while (num > 0) {
            digit = num % 10; // Get the last digit of the number
            cubeSum = cubeSum + (digit * digit * digit); // Add the cube of the digit to cubeSum
            num = num / 10; // Remove the last digit from the number
        }

        if (cubeSum == originalNum)
            System.out.println(originalNum + " is an Armstrong number");
        else
            System.out.println(originalNum + " is not an Armstrong number");
    }
}
