/* Write a program that reads a set of integers, 
and then prints the sum of the even and odd integers*/
public class EvenOddnumvers{  
	public static void main(String args[]){  
	  int i;  
		for (i=1; i<=100; i++){  		//iterate the loop in 100 times
			if (i%2==0){  				//check the number is even or not
			System.out.println("Even Number Is: "+i);  
			}else{

				System.out.println("Odd Number Is: "+i);
			}  
		}  
	}  
}  