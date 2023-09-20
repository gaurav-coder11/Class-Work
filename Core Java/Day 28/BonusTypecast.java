/*
WAP to accept salary from user and typecast it into 
double after adding bonus (11 % of salary)into it
*/
import java.util.*;
public class BonusTypecast{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Name: ");
	String name = sc.nextLine();
	System.out.print("Enter Your Sallary: ");
	int sal = sc.nextInt();

	//adding bonus 11%
	double salaryBonus = 0.11 * sal; // 11% bonus
	
	//adding bonus into the salary
	double salasyFinal = sal + salaryBonus; 	

	//print your information
	System.out.println("\n********************************");
	System.out.println("You are Name: " + name);
	System.out.println("After Adding Bonus The Salary is: " + sal);
	System.out.println("Bonus: " + salaryBonus);
	System.out.println("Before Adding Bonus The Salary is: " + salasyFinal);
	System.out.println("********************************");
	}
}