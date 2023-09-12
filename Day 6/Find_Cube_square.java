/*WAP to accept number from the user 
,if it is odd find cube of it otherwise find 
square of that number.(Do not accept input as zero)*/

import java.util.Scanner;   //import scanner

public class Find_Cube_square{
  public static void main(String args[]){   //declare main method

  int num,res;    //declare veriable
  Scanner sc=new Scanner(System.in);    //create the object of 

  System.out.print("Enter Your Number:");
  num=sc.nextInt();

  //Put the logic 
  //apply if else condition
  if(num == 0){
    System.out.println("Do not accept input as zero:"+num);
  }else if(num % 2 ==0){
  	res = num*num;
    System.out.print("The Given Number Square is:"+res);
  }
  else{
    res = num*num*num;
    System.out.print("The Given Number  is:"+res);
    }
    sc.close();
  }
}