//write a program to find area of rectrangle
import java.util.Scanner;
class AreaofRect{
public static void main(String args[]){

int width,hight,area;
//initialize scanner
Scanner sc=new Scanner(System.in);
System.out.print("Enter Width of Rectangle:");
	width=sc.nextInt();  	//store the value throw user is put
	System.out.print("Enter Hight of Rectangle:");
	hight=sc.nextInt(); 
	area=width*hight;
	System.out.println("Area of rectangle="+ area);
}
}