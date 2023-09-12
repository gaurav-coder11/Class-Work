import java.util.Scanner;

class SwitchWeekoff {
    public static void main(String args[]) {
        int ch; // Declare an integer variable to store the user's choice

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 7 to select your weekly off: ");
        ch = sc.nextInt(); // Read the user's choice

        switch (ch) {
            case 1:
                System.out.print("Your weekly off is Monday");
                break;

            case 2:
                System.out.print("Your weekly off is Tuesday");
                break;

            case 3:
                System.out.print("Your weekly off is Wednesday");
                break;

            case 4:
                System.out.print("Your weekly off is Thursday");
                break;

            case 5:
                System.out.print("Your weekly off is Friday");
                break;

            case 6:
                System.out.print("Your weekly off is Saturday");
                break;

            case 7:
                System.out.print("Your weekly off is Sunday");
                break;

            default:
                System.out.print("No weekly off for you");
                break;
        }
    }
}
