/*Wap to accept age and weight and make a 
decision whether he can donate a blood or not
*/
import java.util.Scanner;   //import scanner
public class Age_Weight{
  public static void main(String args[]){   //declare main method

  int age,weight;    //declare veriable
  Scanner sc=new Scanner(System.in);    //create the object of 

  System.out.print("Enter Your Age:");
  age=sc.nextInt();

  System.out.print("Enter Your Weight:");
  weight=sc.nextInt();

  //Put the logic 
  //apply if else condition
  if (age >= 18) {
     if (weight >= 50) {
             System.out.println("You are eligible to donate blood.");
        } else {
           System.out.println("You are not eligible to donate blood. Your weight is less than 50 kilograms.");
        }
            
   } else {
      System.out.println("You are not eligible to donate blood. You are below 18 years old.");
  }

        sc.close();
    }
}