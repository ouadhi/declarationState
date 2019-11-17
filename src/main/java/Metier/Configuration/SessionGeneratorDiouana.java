package Metier.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionGeneratorDiouana {
	private static SessionFactory sessionFactory = null;

	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory(String configFile) {
		try {
			return new Configuration().configure(configFile).buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactroy() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory("/dz/cnis/entities/Hconfig/hibernate_diouana.cfg.xml"); 
		}

		return sessionFactory;
	}
}
