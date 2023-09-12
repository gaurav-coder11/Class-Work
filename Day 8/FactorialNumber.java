/*Write a Java program that prompts the user to enter a positive integer and calculates its factorial using a while loop. The program should display the factorial as the output.
fact=fact*i*/ 
import java.util.Scanner;
class FactorialNumber{  
 public static void main(String args[]){  
  int i,fact=1,number;							//It is the number to calculate factorial  
  
  System.out.print("Enter the number:");
  Scanner sc = new Scanner(System. in );
  number = sc.nextInt();

  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  