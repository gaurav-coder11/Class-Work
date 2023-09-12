//Write a Java program that takes an integer as input and checks if it is divisible by 5 and 11. 
//Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.

import java.util.Scanner;   //import scanner

public class NumberdividedElevenandFive{
  public static void main(String args[]){   //declare main method

  int num;    //declare veriable
  Scanner sc=new Scanner(System.in);    //create the object of 

  System.out.print("Enter Your Number:");
  num=sc.nextInt();

  //Put the logic 
  //apply if else condition
  if(num%5==0 && num%11==0){
    System.out.print("Number is Divisible By 5 & 11");
  }
  else{
    System.out.print("Number is Not Divisible By 5 And 11");
    }
  }
}
