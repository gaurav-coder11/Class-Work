package com.gaurav.project;

class Test extends Thread{					//create user define thread
	public void run() {						//always thread are use run() method
		for(int p = 0; p <= 100; p++) {
			System.out.println("New Document Are Want to Print Yourself at " + p + " times");
		}
	}
}
public class Thread_Example {

	public static void main(String[] args) {		//the main method is a also thread and they
		// TODO Auto-generated method stub			//are execute the process sequentially
		//job 1
		System.out.println("------------ Application Start -----------");
		
		//job 2
		Test mytest = new Test();
		mytest.start();						//start() method are start the thread
		
		//job 3
		for(int i =1; i<11; i++) {
			System.out.println("Print the documents: " + i + " Documents" );
		}
		//job 4 
		System.out.println("**************** Application Terminated ****************" );
	}
}
