package com.inputDemo;
import java.io.*;
public class InputBuffrReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.print("Enter Your Name: ");
		String name = br.readLine();
		
		if (name.length() > 0) {
            System.out.println("Welcome! " + name);
        } else {
            System.out.println("Name cannot be empty.");
        }
	}

}
