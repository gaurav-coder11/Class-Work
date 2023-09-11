/*conditional statements in java
1.if
2.if...else
3.if..else..if..else 

use conditional statement we are use conditional statement 
1.<
2.>
3.<=
4.>=
5.==
6.!=

if(test condition){-----}
Sangeeta Praveenkumar12:43 PM
Less than: a < b

Less than or equal to: a <= b

Greater than: a > b

Greater than or equal to: a >= b

Equal to a == b

Not Equal to: a != b
*/

//wap to print java program if user enter positive value
import java.util.Scanner;
public class conditionStatement{
	
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		num=sc.nextInt();

		if(num>0){		//terurn always boolean Expretion
			System.out.print("You have enger +ve number:"+num);

		}else{
		System.out.print("You have enger -ve number:"+num);
		}
	}
}