// WAP to create user define package and give info to user
package user;
import java.util.Scanner;
public class UserDemo{
	public static void main(String [] args){
		String name;
		int id;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Name ");
		name=scanner.nextLine();

		System.out.println("Enter Your ID ");
		name=scanner.nextInt();

		System.out.println("Your Name is: "+name);
		System.out.println("Your ID is: "+id);

	}
}