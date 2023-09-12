/*Amar" is HDFC bank customer his Balance is 25000. 
After  some time He trasfered 11000 amount to his friend 
"Surya".Print the current balance and find interest value 
on that amount with interest value 2%  and 12months?
*/
public class RateOfInterest  
 {  
   public static void main (String args[])  
    {   

    	double bal=25000,amounttransfer,surya,rate=2,time=1,total;

    	System.out.println("Amar Salary:"+bal);

      amounttransfer=bal-11000;
      
      surya=11000;

      System.out.println("Surya BAlance:"+surya);
      
    	System.out.println("After Trancpering The 11000,Amar Current Ballence:"+amounttransfer);

    	total=(surya*rate*time)/100;

    	System.out.println("The Amount of Interest After Transfer Ballence:"+total);

    }
  }  