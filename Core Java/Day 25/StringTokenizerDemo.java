import java.util.StringTokenizer;
public class StringTokenizerDemo{
	public static void main(String args[]){
	StringTokenizer st = new  StringTokenizer(" Hello EveryOne Have a Nice Day", " ");
	//while(st.hasMoreTokens()){
	System.out.println("Totle NNumber Of Tockens:"+st.countTokens());
	//}
	}
}