package Metier.dedouane;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "declarant")
public class Declarant implements Serializable {
	
	@EmbeddedId
	private DeclarantPK id;
	@Column(name = "adr_dclt")
	private String adrDclt;
	@Column(name = "code_fiscal")
	private String codeFiscal;
	@Column(name = "code_postale")
	private String codePostale;
	@Column(name = "nom_declt")
	private String nomDeclt;
	@Column(name = "num_cred")
	private Integer numCred;
	@Column(name = "solv_dclt")
	private String solvDclt;
	@Column(name = "tel_ent")
	private String telEnt ; 

	public String getAdrDclt() {
		return this.adrDclt;
	}

	public void setAdrDclt(String adrDclt) {
		this.adrDclt = adrDclt;
	}

	public String getCodeFiscal() {
		return this.codeFiscal;
	}

	public void setCodeFiscal(String codeFiscal) {
		this.codeFiscal = codeFiscal;
	}

	public String getCodePostale() {
		return this.codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getNomDeclt() {
		return this.nomDeclt;
	}

	public void setNomDeclt(String nomDeclt) {
		this.nomDeclt = nomDeclt;
	}

	public Integer getNumCred() {
		return this.numCred;
	}

	public void setNumCred(Integer numCred) {
		this.numCred = numCred;
	}

	public String getSolvDclt() {
		return this.solvDclt;
	}

	public void setSolvDclt(String solvDclt) {
		this.solvDclt = solvDclt;
	}

	public String getTelEnt() {
		return this.telEnt;
	}

	public void setTelEnt(String telEnt) {
		this.telEnt = telEnt;
	}

	public DeclarantPK getId() {
		return this.id;
	}

	public void setId(DeclarantPK id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Declarant [id=" + id + ", adrDclt=" + adrDclt + ", codeFiscal=" + codeFiscal + ", codePostale="
				+ codePostale + ", nomDeclt=" + nomDeclt + ", numCred=" + numCred + ", solvDclt=" + solvDclt
				+ ", telEnt=" + telEnt + "]";
	}
	
	
}