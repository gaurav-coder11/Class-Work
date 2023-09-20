import java.util.StringTokenizer;
public class SimpleString1{
	public static void main(String args[]){
	StringTokenizer st = new  StringTokenizer(" I, Am, Proud, Of, India");
	while(st.hasMoreTokens()){
	System.out.println(st.nextToken(","));
	}
	}
}