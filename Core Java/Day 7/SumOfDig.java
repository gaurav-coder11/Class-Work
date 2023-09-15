/* WAP a program to accept numbers from user 
and find sum of digits */
/*
import java.util.Scanner;  
public class SumOfDig{  
	public static void main(String arg[]){  
	long number, sum;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a number: ");  //reads a long number from the user  
	number=sc.nextLong(); //executes until the condition number!=0 becomes false  
	
	for(sum=0; number>0; number=number/10) {//finds the last digit and add it to the variable sum 
		sum = sum + number % 10;  
	} //prints the result  
	System.out.println("Sum of digits: "+sum);  
	}  
}
*/
import java.util.Scanner;  
public class SumOfDig{  
	public static void main(String args[]){  
	int number, digit, sum = 0;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number: ");  
	number = sc.nextInt();  
	while(number > 0){ 			//finds the last digit of the given number    
		digit = number % 10; 	//adds last digit to the variable sum  
		sum = sum + digit; 		//removes the last digit from the number  
		number = number / 10;  
		}  
								//prints the result  
	System.out.println("Sum of Digits: "+sum);  
	}  
}  

