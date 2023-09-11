//program to swap 2 number
import java.util.Scanner;
class swapNum{
	
	public static void main(String args[]){

	int a,b,temp;
	Scanner sc=new Scanner(System.in);

	//get the number hwough user
	System.out.print("Enter Your 1st Number:");
	a=sc.nextInt();
	System.out.print("Enter Your 2nd Number:");
	b=sc.nextInt();

	System.out.println("Before Swaping Number:"+"a="+a+"b="+b);

	//logic part of swap two numbers
	temp=a;
	a=b;
	b=temp;

	System.out.println("After Swap Number:"+"a="+a+"b="+b);

	}
}