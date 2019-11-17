package Metier.Model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Metier.Configuration.SessionGeneratorDedouane;
import Metier.dedouane.*;
public class ModelParametre {
	
	@SuppressWarnings({ "unchecked", "finally" })
	public List<Parametre> findAll() {
		List<Parametre> parametres  = new ArrayList<>() ; 
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			parametres = session.createQuery("From Parametre").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return parametres ; 
		}
	}
	
	@SuppressWarnings({ "unchecked", "finally" })
	public List<Parametre> findDeclarationParametre() {
		List<Parametre> parametres  = new ArrayList<>() ; 
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			parametres = session.createQuery("From Parametre where caracter ='K'").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return parametres ; 
		}
	}
	
	@SuppressWarnings({ "unchecked", "finally" })
	public Parametre findDeclarationParametreCode(String code ) {
	 Parametre parametre  = null ; 
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			parametre =(Parametre)  session.createQuery("From Parametre where caracter ='K' and code ='"+code+"'").uniqueResult()  ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return parametre ; 
		}
	}
	
	
	
}
