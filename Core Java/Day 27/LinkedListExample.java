import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a linked list of programming languages
        LinkedList<String> programmingLanguages = new LinkedList<String>();
        
        // Adding elements to the list using add()
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        
        // Adding elements at specific indexes using add(index, element)
        programmingLanguages.add(1, "JavaScript");
        programmingLanguages.add(3, "Ruby");
        
        // Accessing elements using get(index)
        System.out.println("Programming Languages:");
        for (int i = 0; i < programmingLanguages.size(); i++) {
            System.out.println(programmingLanguages.get(i));
        }
        
        // Modifying elements using set(index, newElement)
        programmingLanguages.set(2, "C#");
        
        System.out.println("\nAfter modification:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
        
        // Removing elements by index using remove(index)
        programmingLanguages.remove(1);
        
        // Removing elements by value using remove(object)
        programmingLanguages.remove("Ruby");
        
        System.out.println("\nAfter removal:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }
}
