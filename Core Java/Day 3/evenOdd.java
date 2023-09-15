//WAP to check whether the number is even or odd
import java.util.Scanner;

public class evenOdd{
	
	public static void main(String args[]){		//declare main method
		int num;								//veriable name
		Scanner sc=new Scanner(System.in);		//create object of Scanner 
		System.out.print("Enter Your Number:");
		num=sc.nextInt();						//store value in veriable
		System.out.println("Your Given Number is:"+num);

		//condition for check the given number is even orr odd
		if(num % 2 == 0){
			System.out.println("The Given Number Is Even");
		}else{
			System.out.println("The Given Number Is Odd");
		}
	}
}