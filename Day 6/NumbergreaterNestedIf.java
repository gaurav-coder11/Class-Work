/*WAP program to accept a number and
 check whether it is less than 100,
 greater than 50 else greater than 100
*/
import java.util.Scanner;   //import scanner
public class NumbergreaterNestedIf{
  public static void main(String args[]){   //declare main method

  int num1,num2,num3;    //declare veriable
  Scanner sc=new Scanner(System.in);    //create the object of 

  System.out.print("Enter Your 1st Number:");
  num1=sc.nextInt();

   System.out.print("Enter Your 2st Number:");
   num2=sc.nextInt();

  System.out.print("Enter Your 3st Number:");
  num3=sc.nextInt();

  //Put the logic 
  //apply if else condition
    if(num1 > num2) {
            if(num1 > num3)
                System.out.println("1st is the largest number.");
            else
                System.out.println("3rd is the largest number.");
        } else {
            if(num2 >= num3)
                System.out.println("2nd is the largest number.");
            else
                System.out.println("3rd is the largest number.");
        }
    }
}
