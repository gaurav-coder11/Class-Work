/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmethod;
import java.util.Scanner;

public class Studentmethod {

    String name;
    String select;
    char division;
    int age;
    int rollno;
    Scanner sc = new Scanner(System.in);
        
    // Method to input student information
    public void info()
    {
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Select the course that you want to enroll for : ");
        select = sc.nextLine();
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Enter your roll number : ");
        rollno = sc.nextInt();

        // Display the entered information
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll Number : " + rollno);
    }
    
    // Method to determine the allotted class division based on the selected course
    public void allottedClass()
    {
        if (select.equals("Science"))
        {
            System.out.println("You have been assigned to A division");
        }
        else if (select.equals("Commerce"))
        {
            System.out.println("You have been assigned to B division");
        }
        else
        {
            System.out.println("You have been assigned to C division");
        } 
    }
    
    // Method to display the selected course
    public void selectCourse()
    {
        switch (select)
        {
            case "Science":
                System.out.println("You have enrolled in " + select);
                break; 
                
            case "Commerce":
                System.out.println("You have enrolled in " + select);
                break;   
                
            case "Arts":
                System.out.println("You have enrolled in " + select);
                break;    
                
            default:
                System.out.println("Please select a valid course");
        }
    }
   
    public static void main(String[] args) {
        // Create an instance of the Studentmethod class
        Studentmethod obj = new Studentmethod();
        
        // Call methods to input information, determine division, and display the selected course
        obj.info();
        obj.allottedClass();
        obj.selectCourse();
    }
}
