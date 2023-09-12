/*WAP program to accept a number and
 check whether it is less than 100,
 greater than 50 else greater than 100
*/
import java.util.Scanner;   //import scanner
public class NestedIf{
  public static void main(String args[]){   //declare main method

  int num;    //declare veriable
  Scanner sc=new Scanner(System.in);    //create the object of 

  System.out.print("Enter Your Number:");
  num=sc.nextInt();

  //Put the logic 
  //apply if else condition
  if(num<100){
    System.out.println("Number is Less Than 100");
    if(num>50){
    	 System.out.print("Number is  Greater Than 50");
    }else{
    	System.out.print("Number is Less Than 50");
    }
  }
  else{
    System.out.print("Number is Greater Than 100");
    }
  }
}
