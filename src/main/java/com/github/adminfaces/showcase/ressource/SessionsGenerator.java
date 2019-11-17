package com.github.adminfaces.showcase.ressource;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.github.adminfaces.showcase.model.Manifest;

public class SessionsGenerator {

	// class singleton pour generer les sessions,

	static SessionFactory factory = null;
	static int singletonCounter = 0;

	public static SessionFactory getFactory() {
		return factory;
	}

	public SessionsGenerator() {

		if (singletonCounter == 0) {
			// create singleton factory object
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
					// Configuration configuration = new
					// Configuration().configure("/resources/hibernatep.cfg.xml")
					.addAnnotatedClass(Manifest.class);
			System.out.println("ORM mapped secssuful");

			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			factory = configuration.buildSessionFactory(builder.build());
			singletonCounter++;
		}
	}

}
