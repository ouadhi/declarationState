package Metier.dedouane;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ligne_manif")

public class LigneManif implements Serializable {
	
	@EmbeddedId
	private LigneManifPK id;
	@Column(name = "an_oper")
	private Timestamp anOper;
	@Column(name = "code_oper")
	private Integer codeOper;
	@Column(name = "dat_date")
	private Timestamp datDate;
	@Column(name = "date_manif")
	private Timestamp dateManif;
	@Column(name = "date_rectif")
	private Timestamp dateRectif;
	@Column(name = "date_sit")
	private Timestamp dateSit;
	@Column(name = "date_transf")
	private Timestamp dateTransf;
	@Column(name = "design_march")
	private String designMarch;
	@Column(name = "etat_lign")
	private String etatLign;
	@Column(name = "lieu_chgt")
	private String lieuChgt;
	private String motif;
	private String nature;
	@Column(name = "nbr_colisd")
	private Integer nbrColisd;
	@Column(name = "nbr_colise")
	private Integer nbrColise;
	@Column(name = "nbr_colism")
	private Integer nbrColism;
	@Column(name = "nbr_colisr")
	private Integer nbrColisr;
	@Column(name = "nbr_coliss")
	private Integer nbrColiss;
	@Column(name = "num_extrait")
	private Integer numExtrait;
	@Column(name = "num_magasin")
	private Integer numMagasin;
	@Column(name = "num_quitt")
	private Integer numQuitt;
	@Column(name = "num_reference")
	private String numReference;
	@Column(name = "num_situation")
	private Integer numSituation;
	@Column(name = "poidsb_m")
	private BigDecimal poidsbM;
	@Column(name = "poidsb_r")
	private BigDecimal poidsbR;
	@Column(name = "poidsn_m")
	private BigDecimal poidsnM;
	@Column(name = "poidsn_r")
	private BigDecimal poidsnR;
	@Column(name = "type_manif")
	private String typeManif;

	public Timestamp getAnOper() {
		return this.anOper;
	}

	public void setAnOper(Timestamp anOper) {
		this.anOper = anOper;
	}

	public Integer getCodeOper() {
		return this.codeOper;
	}

	public void setCodeOper(Integer codeOper) {
		this.codeOper = codeOper;
	}

	public Timestamp getDatDate() {
		return this.datDate;
	}

	public void setDatDate(Timestamp datDate) {
		this.datDate = datDate;
	}

	public Timestamp getDateManif() {
		return this.dateManif;
	}

	public void setDateManif(Timestamp dateManif) {
		this.dateManif = dateManif;
	}

	public Timestamp getDateRectif() {
		return this.dateRectif;
	}

	public void setDateRectif(Timestamp dateRectif) {
		this.dateRectif = dateRectif;
	}

	public Timestamp getDateSit() {
		return this.dateSit;
	}

	public void setDateSit(Timestamp dateSit) {
		this.dateSit = dateSit;
	}

	public Timestamp getDateTransf() {
		return this.dateTransf;
	}

	public void setDateTransf(Timestamp dateTransf) {
		this.dateTransf = dateTransf;
	}

	public String getDesignMarch() {
		return this.designMarch;
	}

	public void setDesignMarch(String designMarch) {
		this.designMarch = designMarch;
	}

	public String getEtatLign() {
		return this.etatLign;
	}

	public void setEtatLign(String etatLign) {
		this.etatLign = etatLign;
	}

	public String getLieuChgt() {
		return this.lieuChgt;
	}

	public void setLieuChgt(String lieuChgt) {
		this.lieuChgt = lieuChgt;
	}

	public String getMotif() {
		return this.motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public Integer getNbrColisd() {
		return this.nbrColisd;
	}

	public void setNbrColisd(Integer nbrColisd) {
		this.nbrColisd = nbrColisd;
	}

	public Integer getNbrColise() {
		return this.nbrColise;
	}

	public void setNbrColise(Integer nbrColise) {
		this.nbrColise = nbrColise;
	}

	public Integer getNbrColism() {
		return this.nbrColism;
	}

	public void setNbrColism(Integer nbrColism) {
		this.nbrColism = nbrColism;
	}

	public Integer getNbrColisr() {
		return this.nbrColisr;
	}

	public void setNbrColisr(Integer nbrColisr) {
		this.nbrColisr = nbrColisr;
	}

	public Integer getNbrColiss() {
		return this.nbrColiss;
	}

	public void setNbrColiss(Integer nbrColiss) {
		this.nbrColiss = nbrColiss;
	}

	public Integer getNumExtrait() {
		return this.numExtrait;
	}

	public void setNumExtrait(Integer numExtrait) {
		this.numExtrait = numExtrait;
	}

	public Integer getNumMagasin() {
		return this.numMagasin;
	}

	public void setNumMagasin(Integer numMagasin) {
		this.numMagasin = numMagasin;
	}

	public Integer getNumQuitt() {
		return this.numQuitt;
	}

	public void setNumQuitt(Integer numQuitt) {
		this.numQuitt = numQuitt;
	}

	public String getNumReference() {
		return this.numReference;
	}

	public void setNumReference(String numReference) {
		this.numReference = numReference;
	}

	public Integer getNumSituation() {
		return this.numSituation;
	}

	public void setNumSituation(Integer numSituation) {
		this.numSituation = numSituation;
	}

	public BigDecimal getPoidsbM() {
		return this.poidsbM;
	}

	public void setPoidsbM(BigDecimal poidsbM) {
		this.poidsbM = poidsbM;
	}

	public BigDecimal getPoidsbR() {
		return this.poidsbR;
	}

	public void setPoidsbR(BigDecimal poidsbR) {
		this.poidsbR = poidsbR;
	}

	public BigDecimal getPoidsnM() {
		return this.poidsnM;
	}

	public void setPoidsnM(BigDecimal poidsnM) {
		this.poidsnM = poidsnM;
	}

	public BigDecimal getPoidsnR() {
		return this.poidsnR;
	}

	public void setPoidsnR(BigDecimal poidsnR) {
		this.poidsnR = poidsnR;
	}

	public String getTypeManif() {
		return this.typeManif;
	}

	public void setTypeManif(String typeManif) {
		this.typeManif = typeManif;
	}
}