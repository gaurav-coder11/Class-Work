import java.util.*;
public class ArrayListExamle{
	public static void main(String [] Args){
	ArrayList<String> list = new ArrayList<String>();
	list.add("Mango");
	list.add("Apple");
	list.add("Banana");
	list.add("Grapes");
	list.add("Orange");

	// print the aray list objects
	System.out.println(list);

	//to access particular value
	String str = list.get(1);
	System.out.println("Elements At Index " + str);

	//modify array list

	list.set(2, "plum");
	System.out.println("modified array list: " + list);	

	//remove perticular elemennts
	String str1 = list.remove(2);
	System.out.println("Update ArrayList: " + list);
	System.out.println("Remove Element: " + str1);
	} 
}