package com.github.adminfaces.showcase.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.showcase.model.Manifest;
import com.github.adminfaces.showcase.service.ManifestService;

@ManagedBean(name = "dtManifestMB")
@ViewScoped
public class ManifestMB implements Serializable {

	private List<Manifest> manifests =  ManifestService.getManifest() ;  
	private  int  size  =  manifests.size() ; 
	

	public List<Manifest> getManifests() {
		return manifests;
	}

	public void setManifests(List<Manifest> manifests) {
		this.manifests = manifests;
	}
	
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
}
