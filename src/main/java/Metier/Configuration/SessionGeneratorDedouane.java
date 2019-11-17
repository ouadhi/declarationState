package Metier.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.primefaces.push.annotation.Singleton;

@Singleton
public class SessionGeneratorDedouane {

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
			sessionFactory = buildSessionFactory("/Metier/Configuration/hibernate_dedouane.cfg.xml"); 
		}

		return sessionFactory;
	}

}
