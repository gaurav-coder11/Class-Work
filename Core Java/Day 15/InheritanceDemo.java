//addition of two number using inheritance

import java.util.Scanner;
class baceClass{
	int a,b;
	double sum;
	Scanner scanner=new Scanner(System.in);

	public void accetp(){
		System.out.println("Enter First Number: ");
		a=scanner.nextInt();
		System.out.println("Enter Second Number: ");
		b=scanner.nextInt();
	}
}
class Add extends baceClass{
	public void display(){
		sum=a+b;
		System.out.println("Addition Of Two Number Is: "+sum);
	}
	
}

class Sub extends baceClass{
	public void display(){
		sum=a-b;
		System.out.println("Substraction Of Two Number Is: "+sum);
	}
	
}

class Mul extends baceClass{
	public void display(){
		sum=a*b;
		System.out.println("Multiplication Of Two Number Is: "+sum);
	}
	
}

class Div extends baceClass{
	public void display(){
		sum=a%b;
		System.out.println("Division Of Two Number Is: "+sum);
	}
	
}

public class InheritanceDemo{
	public static void main(String[] args) {
		Add add=new Add();
		add.accetp();
		add.display();

		Sub sub=new Sub();
		// sub.accetp();
		sub.display();

		Mul mul=new Mul();
		// add.accetp();
		mul.display();

		Div div=new Div();
		// div.accetp();
		div.display();
	}
}