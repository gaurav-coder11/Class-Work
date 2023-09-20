/*
WAP to create arraylist of languages and add running 
programming languages in that
*/
import java.util.*;
public class ArrayListLang{
	public static void main(String [] Args){
	ArrayList<String> languages = new ArrayList<String>();
	languages.add("Java");
	languages.add("Python");
	languages.add("C");
	languages.add("C++");
	languages.add("PHP");

	//System.out.println(languages);

	for (String language : languages) {
            System.out.println(language);
        }

	}
}