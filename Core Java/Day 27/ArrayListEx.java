/*.Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.*/


import java.util.*;
public class ArrayListEx{
	public static void main(String [] Args){
	ArrayList<String> list = new ArrayList<String>();
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	list.add("5");

	// print the aray list objects
	for (String employees : list) {
            System.out.println("Employee id: "+employees);
        }

	//to access particular value
	String str = list.get(1);
	System.out.println("\nElements At Index " + str);

	//modify array list

	list.set(2, "10");
	System.out.println("\nAdd New Employee id 2nd Position: " + list);	

	//remove perticular elemennts
	String str1 = list.remove(2);
	System.out.println("\nUpdate ArrayList");
	for (String employees : list) {
            System.out.println("Employee id: "+employees);
        }


	System.out.println("\nRemove Employee id:");	
	for (String employees : list) {
            System.out.println("Remove Employee id: "+employees);
        }
	} 
}