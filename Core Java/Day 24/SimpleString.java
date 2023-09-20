import java.util.StringTokenizer;

public class SimpleString {
    public static void main(String args[]) {
        // Create a StringTokenizer object with the input string and the delimiter (space)
        StringTokenizer st = new StringTokenizer("I Am Proud Of India", " ");
        
        // Loop through the tokens and print each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
