/*.1)WAP to accept Salary from the user and make a decision as 
per given condition.
sal>=50000      print "I am happy"
sal>=75000  print "I have better life"
sal>-=100000 print "My family is happy with me"
*/

import java.util.Scanner;		//import scanner

class Salary {
	public static void main(String args[])
	{
		int salary;							//declare veriable
		Scanner sc=new Scanner(System.in);	//create the object of 

		System.out.println("***************************** Enter Your Salary *****************************");
		salary=sc.nextInt();
		
		//apply the conditions
		if(salary>=50000 && salary<=75000)
		{
			System.out.print("I am Happy");
		}
		else if(salary>=75000 && salary<=100000)
		{
			System.out.print("I Have Better Life");
		}
		 else if(salary>=100000)
		{
			System.out.print("My Family Is Happy With Me");
		}
		else 
		{
			System.out.print("I Am Sad. / Unsatisfied Life");
		}
	}
	
}