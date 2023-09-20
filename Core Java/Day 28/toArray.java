import java.util.*;

public class toArray {
    public static void main(String[] args) {
        // Create an ArrayList of strings with an initial capacity of 5
        ArrayList<String> color_list = new ArrayList<String>(5);

        // Add colors to the ArrayList
        color_list.add("Red");
        color_list.add("Blue");
        color_list.add("Green");
        color_list.add("Yellow");
        color_list.add("Orange");

        // Print the size of the ArrayList
        System.out.println("Size of list: " + color_list.size());

        // Iterate and print the elements in the ArrayList
        System.out.println("Print elements from first to last:");
        for (String value : color_list) {
            System.out.println("Color = " + value);
        }

        // Convert the ArrayList to an array of Objects
        Object[] obj = color_list.toArray();

        // Iterate and print the elements in the resulting array
        System.out.println("Print elements from first to last in the array:");
        for (Object value : obj) {
            System.out.println("Color = " + value);
        }
    }
}
