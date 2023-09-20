import java.util.Scanner;
public class Autoboxing{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number");
	int x = sc.nextInt() ;
	//System.out.ptintln("Enter 2st Number");
	//int y = sc.nextInt();

	Integer val = new Integer(x); //Autoboxing
	int y=val;  				  //Unboxing
	System.out.println("Value after autoboxing\t"+val);
	System.out.println("Value after Unboxing\t"+y);
	}
}