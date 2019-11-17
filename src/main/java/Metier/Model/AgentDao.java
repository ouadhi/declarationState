package Metier.Model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Metier.Configuration.SessionGeneratorDedouane;
import Metier.dedouane.Agent;

public class AgentDao {
	
  public  List<Agent>  findAll(){
	  List<Agent>  list  = new ArrayList<>()  ;  
	  Session session  = SessionGeneratorDedouane.getSessionFactroy().openSession() ;  
	  try {
		list  = session.createQuery("From Agent").list()  ;  
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		session.close(); 
		return  list  ; 
	}
  }
  
  public  Agent findById(Integer id){
	  Agent  agent =  new Agent() ; 
	  Session session  = SessionGeneratorDedouane.getSessionFactroy().openSession() ;
	  try {
		agent  =(Agent) session.createQuery("From Agent where matAgent = '"+id+"'").uniqueResult();  
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		session.close(); 
		return  agent  ; 
	}
  }
  

}
