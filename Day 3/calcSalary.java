//wao to calculate total salary of employ
import java.util.Scanner;
class calcSalary{
	public static void main(String args[]){		//main method 

		//declaration veriable

		int basicSal;
		float da;
		double hra,gross;

		//Scanner Initializing
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Your Basic salary:");
		basicSal=scan.nextInt();
		System.out.print("Enter Your Daily Allowance:");
		da=scan.nextFloat();
		System.out.print("Enter Your HRA:");
		hra=scan.nextDouble();

		//apply formula for calculate total salary
		gross=basicSal+da+hra;
		System.out.println("Total Salary IS:"+gross);
		scan.close();

	}


}