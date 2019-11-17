package com.github.adminfaces.showcase.bean;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import Metier.Model.DelaisDao;
import Metier.dedouane.Delais;

@ManagedBean(name = "rech")
@ViewScoped
public class searchMB {
	
	private int annee , bureau ,  numero ;
	
	private List<Delais>  listes  ; 

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getBureau() {
		return bureau;
	}

	public void setBureau(int bureau) {
		this.bureau = bureau;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	} 
	
	public List<Delais> getListes() {
		return listes;
	}
	
	public void setListes(List<Delais> listes) {
		this.listes = listes;
	}
	
	public void dorech() {
	listes =  new DelaisDao().findAll()   ; 
	System.out.println(listes.size());
	 System.out.println(this.numero);
	 System.out.println(this.annee);
	 System.out.println(this.bureau);
	 
	 
	}
	
	
	public void show() {
		System.out.println("helllo");
	}
	
	public String edit() {
	  /*
          FacesContext context  = FacesContext.getCurrentInstance() ; 
		  Map<String,String> params = context.getExternalContext().getRequestParameterMap() ; 
	               
		  String action = params.get("action");
	        System.out.println(action);
	     
		System.out.println("helloooo");
		  return "/pages/declarationPages/Details.xhtml";
		  */
		
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
		    ipAddress = request.getRemoteAddr();
		}
		System.out.println("ipAddress:" + ipAddress);
		return"/" ; 
		}
	
	

}
