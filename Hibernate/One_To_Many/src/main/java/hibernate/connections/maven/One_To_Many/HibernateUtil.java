package hibernate.connections.maven.One_To_Many;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

		private static final SessionFactory sessionFactory = buildSessionFactoryNew();
		
		private static SessionFactory buildSessionFactory() {
			System.out.println("abc");
			try {
				return new Configuration().configure("connection.cfg.xml").buildSessionFactory();
			}
			catch(Throwable ex) {
				System.err.println("Initial SessionFactory creation failed "+ex);
				throw new ExceptionInInitializerError(ex);
			}
		}

		private static SessionFactory buildSessionFactoryNew() {	
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("Connection.cfg.xml").build();
	        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
	        return metadata.getSessionFactoryBuilder().build();
			}


		public static SessionFactory getSessionFactory() {
			return sessionFactory;
	}

}
