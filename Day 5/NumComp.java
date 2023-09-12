//WAP to accept three numbers from users and make a desicion which is the greatest number among three

import java.util.Scanner;		//import scanner

public class NumComp{
	public static void main(String args[]){		//declare main method

	int num1,num2,num3;		//declare veriable
	Scanner sc=new Scanner(System.in);  	//create the object of 

	System.out.print("Enter Your 1st number:");
	num1=sc.nextInt();

	System.out.print("Enter Your 2nd Number:");
	num2=sc.nextInt();

	System.out.print("Enter Your 3rd number:");
	num3=sc.nextInt();
  	
	//Put the logic 
	//apply if else condition
	if(num1>num2 && num1>num3 ){
		System.out.print("Number 1 is Greater");
	}
	else if(num2>num3 && num2>num1){
		System.out.print("Num 2 is Greater");
	}
	else if(num3>num1 && num3>num2){
		System.out.print("Num 3 is Greater");
	}
	else{
		System.out.print("You Enter Negative Value!!!");
	}
	}
}


/*
//WAP to accept three numbers from users and make a desicion which is the greatest number among three

import java.util.Scanner;		//import scanner

public class NumComp1{
	public static void main(String args[]){		//declare main method

	int num1,num2,num3;		//declare veriable
	Scanner sc=new Scanner(System.in);  	//create the object of 

	System.out.print("Enter Your 1st number:");
	num1=sc.nextInt();

	System.out.print("Enter Your 2nd Number:");
	num2=sc.nextInt();

	System.out.print("Enter Your 3rd number:");
	num3=sc.nextInt();
  	
	//Put the logic 
	//apply if else condition
	if(num1>num2 && num1>num3 ){
		System.out.print("Number 1 is Greater");
	}
	else if(num2>num3){
		System.out.print("Num 2 is Greater");
	}
	else if(num3>num2){
		System.out.print("Num 3 is Greater");
	}else{
		System.out.print("Negative Value");
	}
	}
}*/