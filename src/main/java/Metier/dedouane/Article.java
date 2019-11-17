package Metier.dedouane;


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
@NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ArticlePK id;
	private Integer assemble;
	@Column(name = "code_pays")
	private Integer codePays;
	@Column(name = "des_art")
	private String desArt;
	private Integer document;
	private Integer espece;
	private BigDecimal lavaleur;
	@Column(name = "n_prod")
	private Integer nProd;
	@Column(name = "num_prod")
	private Integer numProd;
	@Column(name = "num_rectif")
	private Integer numRectif;
	@Column(name = "num_stat")
	private String numStat;
	@Column(name = "poidsn_art")
	private BigDecimal poidsnArt;
	@Column(name = "qte_compl")
	private BigDecimal qteCompl;
	@Column(name = "qte_fact")
	private BigDecimal qteFact;
	@Column(name = "qte_txint")
	private BigDecimal qteTxint;
	@Column(name = "unite_comp")
	private String uniteComp;
	@Column(name = "unite_fact")
	private String uniteFact;
	@Column(name = "val_adm")
	private BigDecimal valAdm;
	@Column(name = "val_admi")
	private BigDecimal valAdmi;
	@Column(name = "val_art")
	private BigDecimal valArt;

	public Integer getAssemble() {
		return this.assemble;
	}

	public void setAssemble(Integer assemble) {
		this.assemble = assemble;
	}

	public Integer getCodePays() {
		return this.codePays;
	}

	public void setCodePays(Integer codePays) {
		this.codePays = codePays;
	}

	public String getDesArt() {
		return this.desArt;
	}

	public void setDesArt(String desArt) {
		this.desArt = desArt;
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

	public BigDecimal getLavaleur() {
		return this.lavaleur;
	}

	public void setLavaleur(BigDecimal lavaleur) {
		this.lavaleur = lavaleur;
	}

	public Integer getNProd() {
		return this.nProd;
	}

	public void setNProd(Integer nProd) {
		this.nProd = nProd;
	}

	public Integer getNumProd() {
		return this.numProd;
	}

	public void setNumProd(Integer numProd) {
		this.numProd = numProd;
	}

	public int getNumRectif() {
		return this.numRectif;
	}

	public void setNumRectif(int numRectif) {
		this.numRectif = numRectif;
	}

	public String getNumStat() {
		return this.numStat;
	}

	public void setNumStat(String numStat) {
		this.numStat = numStat;
	}

	public BigDecimal getPoidsnArt() {
		return this.poidsnArt;
	}

	public void setPoidsnArt(BigDecimal poidsnArt) {
		this.poidsnArt = poidsnArt;
	}

	public BigDecimal getQteCompl() {
		return this.qteCompl;
	}

	public void setQteCompl(BigDecimal qteCompl) {
		this.qteCompl = qteCompl;
	}

	public BigDecimal getQteFact() {
		return this.qteFact;
	}

	public void setQteFact(BigDecimal qteFact) {
		this.qteFact = qteFact;
	}

	public BigDecimal getQteTxint() {
		return this.qteTxint;
	}

	public void setQteTxint(BigDecimal qteTxint) {
		this.qteTxint = qteTxint;
	}

	public String getUniteComp() {
		return this.uniteComp;
	}

	public void setUniteComp(String uniteComp) {
		this.uniteComp = uniteComp;
	}

	public String getUniteFact() {
		return this.uniteFact;
	}

	public void setUniteFact(String uniteFact) {
		this.uniteFact = uniteFact;
	}

	public BigDecimal getValAdm() {
		return this.valAdm;
	}

	public void setValAdm(BigDecimal valAdm) {
		this.valAdm = valAdm;
	}

	public BigDecimal getValAdmi() {
		return this.valAdmi;
	}

	public void setValAdmi(BigDecimal valAdmi) {
		this.valAdmi = valAdmi;
	}

	public BigDecimal getValArt() {
		return this.valArt;
	}

	public void setValArt(BigDecimal valArt) {
		this.valArt = valArt;
	}

	public ArticlePK getId() {
		return this.id;
	}

	public void setId(ArticlePK id) {
		this.id = id;
	}
}