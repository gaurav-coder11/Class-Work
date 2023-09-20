import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> stack = new LinkedList<String>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C");
        stack.push("C++");
        stack.push("PHP");
        stack.pop();

        // Create an iterator to traverse the linked list
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}