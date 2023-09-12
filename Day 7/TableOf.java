//WAP to accept number from user and generate table of it.
import java.util.Scanner;
class TableOf{									//Declare Class name
	public static void main(String args[]){
		int i, num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Number:");
		num=sc.nextInt();
	
	for (i=1;i<=10;i++){ 						//Initialize for loop(i++=>i+1)
		System.out.println("Table Of" + num + " *" + " =" +"num"+(num*i));		//printable statement
		}
	}
}