package Metier.dedouane;


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "taxe_art")

public class TaxeArt implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private TaxeArtPK id;
	@Column(name = "ass_taxa")
	private BigDecimal assTaxa;
	@Column(name = "ass_taxi")
	private BigDecimal assTaxi;
	private Integer assemble;
	@Column(name = "code_taxe")
	private Integer codeTaxe;
	private Integer espece;
	@Column(name = "mon_taxa")
	private BigDecimal monTaxa;
	@Column(name = "mon_taxi")
	private BigDecimal monTaxi;
	private Integer ordre;
	@Column(name = "quo_taxa")
	private BigDecimal quoTaxa;
	@Column(name = "quo_taxi")
	private BigDecimal quoTaxi;
	private Integer tarif;
	private String unitmes;
	private Integer unitper;
	private Integer valeur;
	
	public TaxeArtPK getId() {
		return id;
	}
	public void setId(TaxeArtPK id) {
		this.id = id;
	}
	public BigDecimal getAssTaxa() {
		return assTaxa;
	}
	public void setAssTaxa(BigDecimal assTaxa) {
		this.assTaxa = assTaxa;
	}
	public BigDecimal getAssTaxi() {
		return assTaxi;
	}
	public void setAssTaxi(BigDecimal assTaxi) {
		this.assTaxi = assTaxi;
	}
	public Integer getAssemble() {
		return assemble;
	}
	public void setAssemble(Integer assemble) {
		this.assemble = assemble;
	}
	public Integer getCodeTaxe() {
		return codeTaxe;
	}
	public void setCodeTaxe(Integer codeTaxe) {
		this.codeTaxe = codeTaxe;
	}
	public Integer getEspece() {
		return espece;
	}
	public void setEspece(Integer espece) {
		this.espece = espece;
	}
	public BigDecimal getMonTaxa() {
		return monTaxa;
	}
	public void setMonTaxa(BigDecimal monTaxa) {
		this.monTaxa = monTaxa;
	}
	public BigDecimal getMonTaxi() {
		return monTaxi;
	}
	public void setMonTaxi(BigDecimal monTaxi) {
		this.monTaxi = monTaxi;
	}
	public Integer getOrdre() {
		return ordre;
	}
	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}
	public BigDecimal getQuoTaxa() {
		return quoTaxa;
	}
	public void setQuoTaxa(BigDecimal quoTaxa) {
		this.quoTaxa = quoTaxa;
	}
	public BigDecimal getQuoTaxi() {
		return quoTaxi;
	}
	public void setQuoTaxi(BigDecimal quoTaxi) {
		this.quoTaxi = quoTaxi;
	}
	public Integer getTarif() {
		return tarif;
	}
	public void setTarif(Integer tarif) {
		this.tarif = tarif;
	}
	public String getUnitmes() {
		return unitmes;
	}
	public void setUnitmes(String unitmes) {
		this.unitmes = unitmes;
	}
	public Integer getUnitper() {
		return unitper;
	}
	public void setUnitper(Integer unitper) {
		this.unitper = unitper;
	}
	public Integer getValeur() {
		return valeur;
	}
	public void setValeur(Integer valeur) {
		this.valeur = valeur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}