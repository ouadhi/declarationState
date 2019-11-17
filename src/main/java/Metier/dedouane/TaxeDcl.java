package Metier.dedouane;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "taxe_dcl")
@NamedQuery(name = "TaxeDcl.findAll", query = "SELECT t FROM TaxeDcl t")
public class TaxeDcl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TaxeDclPK id;
	
	@Column(name = "ass_taxi")
	private BigDecimal assTaxi;

	@Column(name = "code_taxe")
	private Integer codeTaxe;
	private Integer document;
	private Integer espece;
	@Column(name = "mon_taxi")
	private BigDecimal monTaxi;
	private Integer nombre;
	
	private Integer ordre;
	private Integer tarif;
	private String unitmes;
	private Integer unitper;
	private Integer valeur;


	public BigDecimal getAssTaxi() {
		return this.assTaxi;
	}

	public void setAssTaxi(BigDecimal assTaxi) {
		this.assTaxi = assTaxi;
	}

	

	public Integer getCodeTaxe() {
		return this.codeTaxe;
	}

	public void setCodeTaxe(Integer codeTaxe) {
		this.codeTaxe = codeTaxe;
	}

	public Integer getDocument() {
		return this.document;
	}

	public void setDocument(Integer document) {
		this.document = document;
	}

	public Integer getEspece() {
		return this.espece;
	}

	public void setEspece(Integer espece) {
		this.espece = espece;
	}

	public BigDecimal getMonTaxi() {
		return this.monTaxi;
	}

	public void setMonTaxi(BigDecimal monTaxi) {
		this.monTaxi = monTaxi;
	}

	public Integer getNombre() {
		return this.nombre;
	}

	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}



	public Integer getOrdre() {
		return this.ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}


	public Integer getTarif() {
		return this.tarif;
	}

	public void setTarif(Integer tarif) {
		this.tarif = tarif;
	}


	public String getUnitmes() {
		return this.unitmes;
	}

	public void setUnitmes(String unitmes) {
		this.unitmes = unitmes;
	}

	public Integer getUnitper() {
		return this.unitper;
	}

	public void setUnitper(Integer unitper) {
		this.unitper = unitper;
	}

	public TaxeDclPK getId() {
		return id;
	}

	public void setId(TaxeDclPK id) {
		this.id = id;
	}

	public Integer getValeur() {
		return this.valeur;
	}

	public void setValeur(Integer valeur) {
		this.valeur = valeur;
	}
}