/*A Leap Year is a year having 366 days. 
A year is said to be a leap year if the 
following conditions are satisfied:

The year is a multiple of 400.
The year is multiple of 4 but not 100.

*/

import java.util.Scanner;  					//import scanner

public class Leap_Year{						//create class
  public static void main(String args[]){   //declare main method

  int year;   //declare veriable
  Scanner sc=new Scanner(System.in);    	//create the object of 

  System.out.print("Enter The Year:");
  year=sc.nextInt();

  //Put the logic 
  //apply if else condition
  if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)){ //year % 100 != 0 (centure years means 2000,1900,etc)
    System.out.println(year+"- Year is a leap year");
  }else{
  	System.out.println(year+"- Year is not a leap year");
    }
    sc.close();
  }
}