package Metier.dedouane;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "manifeste")

public class Manifeste implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ManifestePK id;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_arrive")
	private Date dateArrive;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_enr")
	private Date dateEnr;
	@Column(name = "date_entre")
	private Timestamp dateEntre;
	private String entree;
	@Column(name = "lieu_debarq")
	private String lieuDebarq;
	@Column(name = "nat_manif")
	private String natManif;
	@Column(name = "nbre_lig")
	private Integer nbreLig;
	@Column(name = "num_consig")
	private int numConsig;
	@Column(name = "num_magasin")
	private Integer numMagasin;
	@Column(name = "num_transp")
	private String numTransp;
	@Column(name = "poidsb_t")
	private BigDecimal poidsbT;
	@Column(name = "poidsm_t")
	private BigDecimal poidsmT;
	private String transport;
	@Column(name = "type_manif")
	private String typeManif;

	public Date getDateArrive() {
		return this.dateArrive;
	}

	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}

	public Date getDateEnr() {
		return this.dateEnr;
	}

	public void setDateEnr(Date dateEnr) {
		this.dateEnr = dateEnr;
	}

	public Timestamp getDateEntre() {
		return this.dateEntre;
	}

	public void setDateEntre(Timestamp dateEntre) {
		this.dateEntre = dateEntre;
	}

	public String getEntree() {
		return this.entree;
	}

	public void setEntree(String entree) {
		this.entree = entree;
	}

	public String getLieuDebarq() {
		return this.lieuDebarq;
	}

	public void setLieuDebarq(String lieuDebarq) {
		this.lieuDebarq = lieuDebarq;
	}

	public String getNatManif() {
		return this.natManif;
	}

	public void setNatManif(String natManif) {
		this.natManif = natManif;
	}

	public Integer getNbreLig() {
		return this.nbreLig;
	}

	public void setNbreLig(Integer nbreLig) {
		this.nbreLig = nbreLig;
	}

	public int getNumConsig() {
		return this.numConsig;
	}

	public void setNumConsig(int numConsig) {
		this.numConsig = numConsig;
	}

	public Integer getNumMagasin() {
		return this.numMagasin;
	}

	public void setNumMagasin(Integer numMagasin) {
		this.numMagasin = numMagasin;
	}

	public String getNumTransp() {
		return this.numTransp;
	}

	public void setNumTransp(String numTransp) {
		this.numTransp = numTransp;
	}

	public BigDecimal getPoidsbT() {
		return this.poidsbT;
	}

	public void setPoidsbT(BigDecimal poidsbT) {
		this.poidsbT = poidsbT;
	}

	public BigDecimal getPoidsmT() {
		return this.poidsmT;
	}

	public void setPoidsmT(BigDecimal poidsmT) {
		this.poidsmT = poidsmT;
	}

	public String getTransport() {
		return this.transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getTypeManif() {
		return this.typeManif;
	}

	public void setTypeManif(String typeManif) {
		this.typeManif = typeManif;
	}
}