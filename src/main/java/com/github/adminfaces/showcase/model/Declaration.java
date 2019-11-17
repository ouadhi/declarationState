package com.github.adminfaces.showcase.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="declaration")
public class Declaration {
	
	@Id
	@Column
	private int  id ; 
	@Column
	private String numero_vi ; 
	@Column
	private int num_bl  ;
	@Column 
	private String num_cts ; 
	@Column
	private int code_bur ; 
	@Column
	private int an_manif ; 
	@Column
	private int num_manif ; 
	@Column
	private int num_ligne ; 
	@Column
	private int num_group ;
	@Column
	private int num_decl ; 
	@Column
	private String type_decl ; 
	@Column
	private Date date_heur ; 
	@Column
	private String fap ;
	@Column
	private String nom_agent ; 
	@Column
	private boolean flag ; 
	@Column
	private Date date_marquage ; 
	
	public Declaration() {}

	public Declaration(int id, String numero_vi ,int num_bl, String num_cts, int code_bur, int an_manif, int num_manif, int num_ligne,
			int num_group, int num_decl, String type_decl, Date date_heur, String fap, String nom_agent, boolean flag,
			Date date_marquage) {
		super();
		this.id = id;
		this.numero_vi =  numero_vi ; 
		this.num_bl = num_bl;
		this.num_cts = num_cts;
		this.code_bur = code_bur;
		this.an_manif = an_manif;
		this.num_manif = num_manif;
		this.num_ligne = num_ligne;
		this.num_group = num_group;
		this.num_decl = num_decl;
		this.type_decl = type_decl;
		this.date_heur = date_heur;
		this.fap = fap;
		this.nom_agent = nom_agent;
		this.flag = flag;
		this.date_marquage = date_marquage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNumero_vi() {
		return numero_vi;
	}
	
	public void setNumero_vi(String numero_vi) {
		this.numero_vi = numero_vi;
	}

	public int getNum_bl() {
		return num_bl;
	}

	public void setNum_bl(int num_bl) {
		this.num_bl = num_bl;
	}

	public String getNum_cts() {
		return num_cts;
	}

	public void setNum_cts(String num_cts) {
		this.num_cts = num_cts;
	}

	public int getCode_bur() {
		return code_bur;
	}

	public void setCode_bur(int code_bur) {
		this.code_bur = code_bur;
	}

	public int getAn_manif() {
		return an_manif;
	}

	public void setAn_manif(int an_manif) {
		this.an_manif = an_manif;
	}

	public int getNum_manif() {
		return num_manif;
	}

	public void setNum_manif(int num_manif) {
		this.num_manif = num_manif;
	}

	public int getNum_ligne() {
		return num_ligne;
	}

	public void setNum_ligne(int num_ligne) {
		this.num_ligne = num_ligne;
	}

	public int getNum_group() {
		return num_group;
	}

	public void setNum_group(int num_group) {
		this.num_group = num_group;
	}

	public int getNum_decl() {
		return num_decl;
	}

	public void setNum_decl(int num_decl) {
		this.num_decl = num_decl;
	}

	public String getType_decl() {
		return type_decl;
	}

	public void setType_decl(String type_decl) {
		this.type_decl = type_decl;
	}

	public Date getDate_heur() {
		return date_heur;
	}

	public void setDate_heur(Date date_heur) {
		this.date_heur = date_heur;
	}

	public String getFap() {
		return fap;
	}

	public void setFap(String fap) {
		this.fap = fap;
	}

	public String getNom_agent() {
		return nom_agent;
	}

	public void setNom_agent(String nom_agent) {
		this.nom_agent = nom_agent;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Date getDate_marquage() {
		return date_marquage;
	}

	public void setDate_marquage(Date date_marquage) {
		this.date_marquage = date_marquage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + an_manif;
		result = prime * result + code_bur;
		result = prime * result + ((date_heur == null) ? 0 : date_heur.hashCode());
		result = prime * result + ((date_marquage == null) ? 0 : date_marquage.hashCode());
		result = prime * result + ((fap == null) ? 0 : fap.hashCode());
		result = prime * result + (flag ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((nom_agent == null) ? 0 : nom_agent.hashCode());
		result = prime * result + num_bl;
		result = prime * result + ((num_cts == null) ? 0 : num_cts.hashCode());
		result = prime * result + num_decl;
		result = prime * result + num_group;
		result = prime * result + num_ligne;
		result = prime * result + num_manif;
		result = prime * result + ((type_decl == null) ? 0 : type_decl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Declaration other = (Declaration) obj;
		if (an_manif != other.an_manif)
			return false;
		if (code_bur != other.code_bur)
			return false;
		if (date_heur == null) {
			if (other.date_heur != null)
				return false;
		} else if (!date_heur.equals(other.date_heur))
			return false;
		if (date_marquage == null) {
			if (other.date_marquage != null)
				return false;
		} else if (!date_marquage.equals(other.date_marquage))
			return false;
		if (fap == null) {
			if (other.fap != null)
				return false;
		} else if (!fap.equals(other.fap))
			return false;
		if (flag != other.flag)
			return false;
		if (id != other.id)
			return false;
		if (nom_agent == null) {
			if (other.nom_agent != null)
				return false;
		} else if (!nom_agent.equals(other.nom_agent))
			return false;
		if (num_bl != other.num_bl)
			return false;
		if (num_cts == null) {
			if (other.num_cts != null)
				return false;
		} else if (!num_cts.equals(other.num_cts))
			return false;
		if (num_decl != other.num_decl)
			return false;
		if (num_group != other.num_group)
			return false;
		if (num_ligne != other.num_ligne)
			return false;
		if (num_manif != other.num_manif)
			return false;
		if (type_decl == null) {
			if (other.type_decl != null)
				return false;
		} else if (!type_decl.equals(other.type_decl))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Declaration [id=" + id + ", num_bl=" + num_bl + ", num_cts=" + num_cts + ", code_bur=" + code_bur
				+ ", an_manif=" + an_manif + ", num_manif=" + num_manif + ", num_ligne=" + num_ligne + ", num_group="
				+ num_group + ", num_decl=" + num_decl + ", type_decl=" + type_decl + ", date_heur=" + date_heur
				+ ", fap=" + fap + ", nom_agent=" + nom_agent + ", flag=" + flag + ", date_marquage=" + date_marquage
				+ "]";
	}
	
	
	
	
	

}
