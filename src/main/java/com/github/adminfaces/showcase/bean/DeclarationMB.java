package com.github.adminfaces.showcase.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.showcase.model.Declaration;
import com.github.adminfaces.showcase.service.DeclarationService;

@ManagedBean(name = "dtdeclaration")
@ViewScoped
public class DeclarationMB implements Serializable {

	private List<Declaration> liste;
	private DeclarationService service;

	@PostConstruct
	public void init() {
		service = new DeclarationService();
		liste = service.declarationsList(100);
	}

	public List<Declaration> getListe() {
		return liste;
	}

	public void setListe(List<Declaration> liste) {
		this.liste = liste;
	}

}
