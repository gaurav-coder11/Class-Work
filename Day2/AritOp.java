//Adding Two Numbers
import java.util.Scanner;
class AritOp{
public static void main(String args[]){
					//program to demonstrate use of arithmatic operations	
	int a,b,su;      //declaretion of veriables
	
	Scanner sc=new Scanner(System.in);   //initialize a Scanner
	
	System.out.println("Pleare Two Number");
	
	a=sc.nextInt();  	//store the value throw user is put
	b=sc.nextInt();  	//store the value throw user is put
	
	su=a+b;				//Addition 
	System.out.println("Addithion Result Is:-"+su);
	
	su=a-b;				//Substraction 
	System.out.println("Substraction Result Is:-"+su);
	
	su=a*b;				//Multiplecation 
	System.out.println("Multiplecation Result Is:-"+su);
	
	su=a/b;				// Division
	System.out.println("Division Result Is:-"+su);
	
	su=a%b;				//Modulas 
	System.out.println("Modulas Result Is:-"+su);
	
	
	
	}
}