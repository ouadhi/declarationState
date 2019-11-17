package com.github.adminfaces.showcase.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 @Entity
 @Table
public class ContneurEnlever {
	@Id
	@Column
	private int id ;
	@Column
	private int num_bl  ;
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
	private Date date_bae ; 
	@Column
	private String type_declaration ; 
	@Column
	private String nom_agt ; 
	@Column
	private boolean flag ; 
	@Column
	private Date date_marquage  ; 
	@Column
	private  String num_cts ; 
	
	public ContneurEnlever() {}

	public ContneurEnlever(int id, int num_bl, String num_cts, int code_bur, int an_manif, int num_manif, int num_ligne,
			int num_group, int num_decl, Date date_bae, String type_declaration, String nom_agt, boolean flag,
			Date date_marquage) {
		super();
		this.id = id;
		this.num_bl = num_bl;
		this.num_cts = num_cts;
		this.code_bur = code_bur;
		this.an_manif = an_manif;
		this.num_manif = num_manif;
		this.num_ligne = num_ligne;
		this.num_group = num_group;
		this.num_decl = num_decl;
		this.date_bae = date_bae;
		this.type_declaration = type_declaration;
		this.nom_agt = nom_agt;
		this.flag = flag;
		this.date_marquage = date_marquage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getDate_bae() {
		return date_bae;
	}

	public void setDate_bae(Date date_bae) {
		this.date_bae = date_bae;
	}

	public String getType_declaration() {
		return type_declaration;
	}

	public void setType_declaration(String type_declaration) {
		this.type_declaration = type_declaration;
	}

	public String getNom_agt() {
		return nom_agt;
	}

	public void setNom_agt(String nom_agt) {
		this.nom_agt = nom_agt;
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
		result = prime * result + ((date_bae == null) ? 0 : date_bae.hashCode());
		result = prime * result + ((date_marquage == null) ? 0 : date_marquage.hashCode());
		result = prime * result + (flag ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((nom_agt == null) ? 0 : nom_agt.hashCode());
		result = prime * result + num_bl;
		result = prime * result + ((num_cts == null) ? 0 : num_cts.hashCode());
		result = prime * result + num_decl;
		result = prime * result + num_group;
		result = prime * result + num_ligne;
		result = prime * result + num_manif;
		result = prime * result + ((type_declaration == null) ? 0 : type_declaration.hashCode());
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
		ContneurEnlever other = (ContneurEnlever) obj;
		if (an_manif != other.an_manif)
			return false;
		if (code_bur != other.code_bur)
			return false;
		if (date_bae == null) {
			if (other.date_bae != null)
				return false;
		} else if (!date_bae.equals(other.date_bae))
			return false;
		if (date_marquage == null) {
			if (other.date_marquage != null)
				return false;
		} else if (!date_marquage.equals(other.date_marquage))
			return false;
		if (flag != other.flag)
			return false;
		if (id != other.id)
			return false;
		if (nom_agt == null) {
			if (other.nom_agt != null)
				return false;
		} else if (!nom_agt.equals(other.nom_agt))
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
		if (type_declaration == null) {
			if (other.type_declaration != null)
				return false;
		} else if (!type_declaration.equals(other.type_declaration))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContneurEnlever [id=" + id + ", num_bl=" + num_bl + ", num_cts=" + num_cts + ", code_bur=" + code_bur
				+ ", an_manif=" + an_manif + ", num_manif=" + num_manif + ", num_ligne=" + num_ligne + ", num_group="
				+ num_group + ", num_decl=" + num_decl + ", date_bae=" + date_bae + ", type_declaration="
				+ type_declaration + ", nom_agt=" + nom_agt + ", flag=" + flag + ", date_marquage=" + date_marquage
				+ "]";
	}
	
	
	
	
	

}
