package com.github.adminfaces.showcase.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "manifest")

public class Manifest implements Serializable {

	@Id
	@Column(name = "id")
	public int id;

	@Column(name = "numero_vi")
	public String numero_vi;

	@Column(name = "num_bl")
	public String num_bl;

	@Column(name = "num_cts")
	public String num_cts;

	@Column(name = "tare_cts")
	public int tare_cts;

	@Column(name = "code_bur")
	public int code_bur;

	@Column(name = "an_manif")
	@Temporal(javax.persistence.TemporalType.DATE)
	public Date an_manif;

	@Column(name = "num_manif")
	public int num_manif;

	@Column(name = "num_ligne")
	public int num_ligne;

	@Column(name = "num_group")
	public int num_group;

	@Column(name = "flag")
	public boolean flag;

	@Column(name = "date_marquage")
	@Temporal(javax.persistence.TemporalType.DATE)
	public Date date_marquage;

	public Manifest() {
	}
	
	public Manifest(int id, String numero_vi, String num_bl, String num_cts, int tare_cts, int code_bur, Date an_manif,
			int num_manif, int num_ligne, int num_group, boolean flag, Date date_marquage) {
		super();
		this.id = id;
		this.numero_vi = numero_vi;
		this.num_bl = num_bl;
		this.num_cts = num_cts;
		this.tare_cts = tare_cts;
		this.code_bur = code_bur;
		this.an_manif = an_manif;
		this.num_manif = num_manif;
		this.num_ligne = num_ligne;
		this.num_group = num_group;
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

	public String getNum_bl() {
		return num_bl;
	}

	public void setNum_bl(String num_bl) {
		this.num_bl = num_bl;
	}

	public int getCode_bur() {
		return code_bur;
	}

	public String getNum_cts() {
		return num_cts;
	}

	public void setCode_bur(int code_bur) {
		this.code_bur = code_bur;
	}

	public void setNum_cts(String num_cts) {
		this.num_cts = num_cts;
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

	public int getNum_group() {
		return num_group;
	}

	public void setNum_group(int num_group) {
		this.num_group = num_group;
	}

	public void setNum_ligne(int num_ligne) {
		this.num_ligne = num_ligne;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void setDate_marquage(Date date_marquage) {
		this.date_marquage = date_marquage;
	}

	public Date getDate_marquage() {
		return date_marquage;
	}

	public Date getAn_manif() {
		return an_manif;
	}

	public void setAn_manif(Date an_manif) {
		this.an_manif = an_manif;
	}

	public int getTare_cts() {
		return tare_cts;
	}

	public void setTare_cts(int tare_cts) {
		this.tare_cts = tare_cts;
	}

	@Override
	public String toString() {
		return "Manifest [id=" + id + ", numero_vi=" + numero_vi + ", num_bl=" + num_bl + ", num_cts=" + num_cts
				+ ", tare_cts=" + tare_cts + ", code_bur=" + code_bur + ", an_manif=" + an_manif + ", num_manif="
				+ num_manif + ", num_ligne=" + num_ligne + ", num_group=" + num_group + ", flag=" + flag
				+ ", date_marquage=" + date_marquage + "]";
	}
	
	

}
