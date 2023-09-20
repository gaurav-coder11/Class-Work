// use of multiple catch blocks
import java.util.Scanner;
public class javaExceptionmultipleCatch{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Java");
		int arr[] = new int[5];
			int num1,num2;
		for(int i=0; i<arr.length; i++){
			
		}
		try{
			arr[5] = 30/5;		//may throw exception
			System.out.println("-----------------");
			System.out.println("Answer is: "+arr);
			System.out.println("-----------------");
		}catch(ArithmeticException e){						//handle the exception by using exception class
			//System.out.println(e);
			System.out.println("The Number Dos't Divided By 0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The ArrayIndexOutOfBoundsException Accurs");
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Rest of Code");
	}
}