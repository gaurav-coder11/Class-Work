//WAP to check whether user is eligible for vote or not
import java.util.Scanner;

public class voteDemo{
	
	public static void main(String args[]){
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Age:");
		age=sc.nextInt();
		System.out.println("Your Age is:"+age);

		if(age>18){
			System.out.println("Your Age Elegible For Vote");
		}else{
			System.out.println("Your Age Not Elegible For Vote");
		}
	}
}