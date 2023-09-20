/*
1)Creating a linked list using the LinkedList class add programming languages
2)Adding elements to the list in multiple ways i.e. direct add and adding elements to specific index 
Accessing elements of linked list using get() and set()
How to remove the elements of the linked list
*/
import java.util.*;

public class LinkedListLanguage {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<String>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        languages.add("PHP");

        // Create an iterator to traverse the linked list
        Iterator<String> itr = languages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Access and print the 0th element
        System.out.println("The 0th element is: " + languages.get(0));

        // Modify an element at index 3
        languages.set(3, "javascript");
        System.out.println("The list after modifying index 3 is: " + languages);

        // Remove a particular element by index
        String removedElement = languages.remove(2);
        System.out.println("Updated LinkedList: " + languages);
        System.out.println("Removed Element: " + removedElement);
    }
}
