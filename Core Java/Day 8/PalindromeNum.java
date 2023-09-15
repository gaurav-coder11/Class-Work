//WAP to check whether the number is palindrome or no
import java.util.Scanner;
class PalindromeNum{  
 public static void main(String args[]){  
  int rem,rev=0,temp,num1;    
  int num;//It is the number variable to be checked for palindrome  
  System.out.print("Enter the number:");
  Scanner sc = new Scanner(System. in );
  num = sc.nextInt();

  temp=num;    
  while(num>0){    
   rem= num % 10;  //getting remainder  
   rev=(rev*10)+rem;    
   num=num/10;    
  }    
  if(temp==rev)    
   System.out.println(temp+" Is a palindrome number ");    
  else    
   System.out.println(temp+" Is a not palindrome");    
	}  
}  