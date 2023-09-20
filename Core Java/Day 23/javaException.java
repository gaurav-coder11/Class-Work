import java.util.Scanner;
public class javaException{
	public static void main(String [] args){
		System.out.println("Welcome Java");
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter 1 Nuber");
			int num1=sc.nextInt() ;

			System.out.println("Enter 2 Nuber");
			int num2=sc.nextInt() ;
			int res = num1 / num2;		//may throw exception
			System.out.println("-----------------");
			System.out.println("Answer is: "+res);
			System.out.println("-----------------");
		}catch(Exception e){						//handle the exception by using exception class
			//System.out.println(e);
			System.out.println("The Number Dos't Divided By 0");
		}
	}
}