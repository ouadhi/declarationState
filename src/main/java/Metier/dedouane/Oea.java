package Metier.dedouane;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "oea")
public class Oea implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private OeaPK id;
	private String adresse;
	private String codeFiscal;
	private Timestamp dateCreat;
	private Timestamp dateExpir;
	private String fax;
	private String nom;
	private String nordre;
	private String tel;

	public Oea() {
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodeFiscal() {
		return codeFiscal;
	}

	public void setCodeFiscal(String codeFiscal) {
		this.codeFiscal = codeFiscal;
	}

	public Timestamp getDateCreat() {
		return dateCreat;
	}

	public void setDateCreat(Timestamp dateCreat) {
		this.dateCreat = dateCreat;
	}

	public Timestamp getDateExpir() {
		return dateExpir;
	}

	public void setDateExpir(Timestamp dateExpir) {
		this.dateExpir = dateExpir;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNordre() {
		return nordre;
	}

	public void setNordre(String nordre) {
		this.nordre = nordre;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public OeaPK getId() {
		return id;
	}

	public void setId(OeaPK id) {
		this.id = id;
	}
}
