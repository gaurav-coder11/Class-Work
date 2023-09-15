/*

WAP to implement  hierarchical inheritance .Create a 
class Employee with fields id,name,salary.
Create  two more classes PermantEmp and ContractEmp in 
that add hike() method to display percentage hike in the 
salary
permantEmployee hike is 10% of the salary and contractEmployee salary will be  hiked by 5% of salary

*/
import java.util.Scanner;

class Employee {
    int id;
    int permanantEmployeeHike = 10;
    int contractEmployeeHike = 5;
    int employeeType;
    String name;
    Double salary;
    Double presentSalaryPerMonth;
    Scanner scanner = new Scanner(System.in);
}

class PermantEmp extends Employee {
    // Method to input details for permanent employees
    public void permantEmpMethod() {
        System.out.println("********************** Permanent Employee **********************");
        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Your Employee ID: ");
        id = scanner.nextInt();
        System.out.print("Enter Your Basic Salary: ");
        salary = scanner.nextDouble();
        presentSalaryPerMonth = salary + (salary * permanantEmployeeHike / 100);
    }

    // Method to display salary hike for permanent employees
    public void salaryhike() {
        System.out.println("Your Name is: " + name);
        System.out.println("Your Employee ID: " + id);
        System.out.println("Your Basic Salary: " + salary);
        System.out.println("After hike, your present salary per month is: " + presentSalaryPerMonth);
        System.out.println("\n");
    }
}

class ContractEmp extends Employee {
    // Method to input details for contract employees
    public void contracEmpMethod() {
        System.out.println("********************** Contract Employee **********************");
        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Your Employee ID: ");
        id = scanner.nextInt();
        System.out.print("Enter Your Basic Salary: ");
        salary = scanner.nextDouble();
        presentSalaryPerMonth = salary + (salary * contractEmployeeHike / 100);
        System.out.println("After hike, your present salary per month is: " + presentSalaryPerMonth);
    }

    // Method to display salary hike for contract employees
    public void salaryhike() {
        System.out.println("Your Name is: " + name);
        System.out.println("Your Employee ID: " + id);
        System.out.print("Your Basic Salary: " + salary);
        System.out.println("After hike, your present salary per month is: " + presentSalaryPerMonth);
    }
}

public class SalaryHike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee type (1 for Permanent, 2 for Contract): ");
        int employeeType = scanner.nextInt();

        if (employeeType == 1) {
            PermantEmp perEmp = new PermantEmp();
            perEmp.permantEmpMethod();
            perEmp.salaryhike();
        } else if (employeeType == 2) {
            ContractEmp conEmp = new ContractEmp();
            conEmp.contracEmpMethod();
            conEmp.salaryhike();
        } else {
            System.out.println("Invalid employee type.");
        }
    }
}
