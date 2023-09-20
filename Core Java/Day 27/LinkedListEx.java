import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();
        
        // Adding elements to the linked list
        list.add("Ramesh");
        list.add("Vijay");
        list.add("Avi");
        list.add("Jay");
        list.add("Rohit");
        
        // Create an iterator to traverse the linked list
        Iterator<String> itr = list.iterator();
        
        // Iterate through the linked list using the iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
