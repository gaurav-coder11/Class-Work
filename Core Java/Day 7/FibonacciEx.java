/* fibonacci series
0   1    1    2  3     5   8 */
import java.util.Scanner;
class FibonacciEx{  
	public static void main(String args[]){    
 	int num1,num2,num3,i;    
 		System.out.print(n1+" "+n2);		//printing 0 and 1    
    
 	for(i=2;i<=10;++i){					//loop starts from 2 because 0 and 1 are already printed    
  		num3=num1+num2;    
  		System.out.print(" "+num3);    
  		num1=num2;    
  		num2=num3;    
 		}    
  }
}  