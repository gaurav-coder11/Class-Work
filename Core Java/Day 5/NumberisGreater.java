//WAP to print whether the number is positive,negative or zero
import java.util.Scanner;		//import scanner

public class NumberdividedFive{
	public static void main(String args[]){		//declare main method

	int num;		//declare veriable
	Scanner sc=new Scanner(System.in);  	//create the object of 

	System.out.print("Enter Your 1st number:");
	num=sc.nextInt();

	//Put the logic 
	//apply if else condition
	if(num/5==0){
		System.out.print("Number is Divideb By 5");
	}
	
	}
	else{
		System.out.print("Number is NotDivideb By 5");
	}
	}
}