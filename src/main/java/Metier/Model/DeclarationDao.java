package Metier.Model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Metier.Configuration.SessionGeneratorDedouane;
import Metier.dedouane.Declaration;

public class DeclarationDao {
	
	
	
	@SuppressWarnings({ "unchecked", "finally" })
	public List<Declaration> findAll() {
		List<Declaration> declarations  = new ArrayList<>() ; 
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations = session.createQuery("From Declaration").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}

	
	@SuppressWarnings({ "finally" })
	public List<Declaration>  findByDeclNumber( int numDecl) {
		List<Declaration> declarations  = new ArrayList<>() ;  
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations = session.createQuery("From Declaration Where num_decl ='"+numDecl+"' ").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}
	
	@SuppressWarnings({ "finally" })
	public List<Declaration> findByOfficeNumber( int codeBur) {
		List<Declaration> declarations  =  new  ArrayList<>() ; 
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations =  session.createQuery("From Declaration Where code_bur  = '"+codeBur+"' ").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}
	
	@SuppressWarnings({ "finally" })
	public List<Declaration> findByYear( int year) {
		List<Declaration>  declarations  = new ArrayList<>() ; 
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations =  session.createQuery("From Declaration Where an_decl  = '"+year+"' ").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}
	
	@SuppressWarnings({ "finally" })
	public List<Declaration>findByDeclNumOffice( int numDecl, int  codeBur) {
		List<Declaration> declarations  = new ArrayList<>() ;  
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations = session.createQuery("From Declaration Where num_decl ='"+numDecl+"' and  code_bur  = '"+codeBur+"'").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}
	
	@SuppressWarnings({ "finally" })
	public List<Declaration>findByDeclNumYear( int numDecl,int  year) {
		List<Declaration> declarations  = new ArrayList<>() ;  
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations = session.createQuery("From Declaration Where num_decl ='"+numDecl+"' and  an_decl  = '"+year+"'").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}
	
	@SuppressWarnings({ "finally" })
	public List<Declaration>findByOfficeYear( int codeBur, int  year) {
		List<Declaration> declarations  = new ArrayList<>() ;  
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations = session.createQuery("From Declaration Where code_bur ='"+codeBur+"' and  an_decl  = '"+year+"'").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}
	
	@SuppressWarnings({ "finally" })
	public List<Declaration>findByid( int num  , int codeBur, int  year) {
		List<Declaration> declarations  = new ArrayList<>() ;  
		Session session =  SessionGeneratorDedouane.getSessionFactroy().openSession() ; 
		try {
			declarations = session.createQuery("From Declaration Where  code_bur ='"+codeBur+"' and  an_decl  = '"+year+"'").list() ; 
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			session.close(); 
			return declarations ; 
		}
	}
	
	
	

}
