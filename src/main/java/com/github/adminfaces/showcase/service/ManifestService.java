package com.github.adminfaces.showcase.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.github.adminfaces.showcase.model.Manifest;
import com.github.adminfaces.showcase.ressource.SessionsGenerator;


public class ManifestService implements Serializable {
	  
	
	
	

	
	public static  List <Manifest> getManifest () {
		List<Manifest>  liste  = new ArrayList<>(); 
		
		SessionsGenerator sessionsGenerator  = new SessionsGenerator()  ; 
		Session session  = SessionsGenerator.getFactory().openSession(); 
		try {
			liste =  session.createQuery("from Manifest").list() ;
			
		} finally {
			session.close(); 
		}
		
		return liste ; 
		}
	
	
	public static  List <Manifest> getManifestliste () {
		List<Manifest>  liste  = new ArrayList<>(); 
		
		for (int i = 0; i <100; i++) {
			Manifest  manifest  = new   Manifest()  ; 
			manifest.setId(i);
			liste.add(manifest) ; 
		}
		
		return liste ; 
		}
	
	
	
	
	
	
	
	
	

}
