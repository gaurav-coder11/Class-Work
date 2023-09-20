/*Create a method to find the average of all the elements in a LinkedList of integers.
 *Test your method with a sample LinkedList.*/

import java.util.*;

public class LinkedListAverage {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        // Adding elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        // Calculate the sum and count of elements
        int sum = 0;
        int count = 0;
        // Create an iterator to traverse the linked list
        Iterator<Integer> itr = list.iterator();
        
        // Iterate through the linked list using the iterator
        while (itr.hasNext()) {
        	int currentValue = itr.next();
        	sum = sum + currentValue;
            count++;
            
        }
        if (count > 0) {
        	 // Calculate and print the average
        	double average = (double) sum / count;
        	System.out.println("Average of Linked List: " + average);
        }else {
        	System.out.println("Empty Linked List!!!");
        }
       
    }
}
