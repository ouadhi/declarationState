package Metier.Model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Metier.Configuration.SessionGeneratorDedouane;
import Metier.dedouane.Delais;

public class DelaisDao {
	
	private  Session  session ; 
    
	@SuppressWarnings({ "finally", "unchecked" })
	public  List<Delais> findAll(){
	List<Delais> liste = new  ArrayList<>()  ; 
	session =  SessionGeneratorDedouane.getSessionFactroy().openSession();    
    try {
    	
    	liste =  session.createQuery("FROM Delais").list() ; 
		
	} catch (Exception e) {
		System.err.println(e);
	}
    
    finally {
		session.close(); 
		return liste  ; 
	}
		
	}
	
	@SuppressWarnings({ "finally", "unchecked" })
	public  List<Delais> findByNumber(int number ){
	List<Delais> liste = new  ArrayList<>()  ; 
	session =  SessionGeneratorDedouane.getSessionFactroy().openSession();    
    try {
    	
    	liste =  session.createQuery("FROM Delais where num_decl = '"+number+"'").list() ; 
		
	} catch (Exception e) {
		System.err.println(e);
	}
    
    finally {
		session.close(); 
		return liste  ; 
	}
		
	}
	
	
	@SuppressWarnings({ "finally", "unchecked" })
	public  List<Delais> findByoffice(int office){
	List<Delais> liste = new  ArrayList<>()  ; 
	session =  SessionGeneratorDedouane.getSessionFactroy().openSession();    
    try {
    	
    	liste =  session.createQuery("FROM Delais where code_bur = '"+office+"'").list() ; 
		
	} catch (Exception e) {
		System.err.println(e);
	}
    
    finally {                                                      
		session.close(); 
		return liste  ; 
	}
	}
		
	@SuppressWarnings({ "finally", "unchecked" })
	public  List<Delais> findByYear(int office){
	List<Delais> liste = new  ArrayList<>()  ; 
	session =  SessionGeneratorDedouane.getSessionFactroy().openSession();    
    try {
    	
    	liste =  session.createQuery("FROM Delais where an_decl = '"+office+"'").list() ; 
		
	} catch (Exception e) {
		System.err.println(e);
	}
    
    finally {                                                      
		session.close(); 
		return liste  ; 
	}
	}	
	
	
	

}
