package Metier.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hibernate.Session;

@WebListener
public class Start implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			System.out.println("-------------------------------------");
           Session  session  = SessionGeneratorDedouane.getSessionFactroy().openSession() ;  
           session.close(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}