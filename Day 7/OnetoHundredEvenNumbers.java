//WAP to print even numbers in a range of 1 to 100
class Onetohundredevennumbers{  
	public static void main(String args[]){  
	  int i;
	  System.out.println("List of even numbers from 1 to 100: ");  
		for (i=1; i<=100; i++){  		//iterate the loop in 100 times
			if (i%2==0){  				//check the number is even or not
			System.out.println(i);  
			}  
		}  
	}  
}  