package com.gaurav.project;
/*
 * WAP to create two threads...one thread will generate even numbers between 1 and 50 
 * and another thread will generate odd numbers  between 1 and 50
 */
class Even extends Thread{				//create thread for even numbers
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++){  
		//logic to check if the number is even or not  
		//if i%2 is equal to zero, the number is even  
		if (i % 2 == 0)   
		{  
			System.out.println("The even are 1 to 50: " + i);
		} 
		}
	}
	
}
//create thread for even numbers
class Odd extends Thread{    
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++){  
		//logic to check if the number is even or not  
		//if i%2 is equal to zero, the number is even  
		if (i % 2 != 0)   
		{  
			System.out.println("The Odd numbers from 1 to 50: " + i);
		} 
		}
	}
	
}

public class Even_Odd_Thread {
	public static void main(String[] args) {
		
		Even myEven = new Even();     	//create object even class
		myEven.start();
		
		Odd myOdd = new Odd();			//create object odd class
		myOdd.start();
	}

}
