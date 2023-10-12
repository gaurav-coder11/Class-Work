package hibernate.database.maven.Hibernate_CURD_Operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.entity.Employee;
import hibernate.utility.HibernateUtil;

public class Insert {

	public static void main(String[] args) {
		// Creating a Hibernate SessionFactory instance using the HibernateUtil class
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// Opening a new Hibernate Session using the HibernateUtil class
		Session ses = HibernateUtil.getSession();

		try {
			// Beginning a transaction to group database operations
			ses.beginTransaction();
			// Creating a new Employee object and initializing it with data
			Employee emp1 = new Employee("Rohit", "Java", 70000.00);
			Employee emp2 = new Employee("Kunal", "HTML", 40000.00);
			Employee emp3 = new Employee("Roshni", "WEB", 50000.00);
			Employee emp4 = new Employee("Ashish", "Python", 80000.00);
			Employee emp5 = new Employee("kavyya", "Ruby", 70000.00);
			// Saving the newly created Employee object to the database
			ses.save(emp1);
			ses.save(emp2);
			ses.save(emp3);
			ses.save(emp4);
			ses.save(emp5);
		} catch (Exception e) {
			// Handling any exceptions that may occur during database operations
			e.printStackTrace();
		} finally {
			// Committing the transaction (if successful) or rolling back (if there was an
			// exception)
			ses.getTransaction().commit();
			// Closing the Hibernate Session to release resources
			ses.close();
		}
	}
}
