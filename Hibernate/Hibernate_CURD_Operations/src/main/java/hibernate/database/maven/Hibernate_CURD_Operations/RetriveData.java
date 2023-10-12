package hibernate.database.maven.Hibernate_CURD_Operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.entity.Employee;
import hibernate.utility.HibernateUtil;

public class RetriveData {

	public static void main(String[] args) {
		// Creating a Hibernate SessionFactory instance using the HibernateUtil class
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// Opening a new Hibernate Session using the HibernateUtil class
		Session ses = HibernateUtil.getSession();

		try {
			// Beginning a transaction to group database operations
			ses.beginTransaction();
			Employee emp = ses.get(Employee.class, 1);
			System.out.println("Ep with id 1 info" + emp);

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