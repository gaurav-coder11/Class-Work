//WAP to print whether the number is positive,negative or zero
import java.util.Scanner;		//import scanner

public class NumberdividedFive{
	public static void main(String args[]){		//declare main method

	int num;		//declare veriable
	Scanner sc=new Scanner(System.in);  	//create the object of 

	System.out.print("Enter Your Number:");
	num=sc.nextInt();

	//Put the logic 
	//apply if else condition
	if(num%5==0 && num%3==0){
		System.out.print("Number is Divisible By 5");
	}
	 else if(num%5==0 || num%3==0){
		System.out.print("Number is Divisible By 5 or 3");
	}
	else{
		System.out.print("Number is Not Divisible By 5 And 3");
		}
	}
}
