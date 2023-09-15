//write a program to calculate simple Interest 
import java.util.Scanner;

public class SipleInterest 
 {  
   public static void main (String args[])  
    {   double principal, rate,  time,  si; //Initialize principal amount, rate of intrest, time and simple interest respectively  
			  Scanner sc=new Scanner(System.in); //Initialize Scanner
			  System.out.print("Enter Principal Amount:");
              principal = sc.nextInt(); 			//store the value throw user is put
			  System.out.print("Enter Rate:");
			  rate = sc.nextInt();					//store the value throw user is put
			  System.out.print("Enter Time:");
			  time = sc.nextInt(); 					//store the value throw user is put
              si  = (principal*rate*time)/100;   	//Calculate SipleInterest
              System.out.println("Simple Interest is: " +si);  
    }}  