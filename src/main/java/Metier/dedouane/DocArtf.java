package Metier.dedouane;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "doc_artf")

public class DocArtf implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private DocArtfPK id;
	private String autorite;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_etab")
	private Date dateEtab;
	@Column(name = "lieu_etab")
	private String lieuEtab;
	@Column(name = "num_stat")
	private String numStat;
	private String numdoc;

	public String getAutorite() {
		return this.autorite;
	}

	public void setAutorite(String autorite) {
		this.autorite = autorite;
	}

	public Date getDateEtab() {
		return this.dateEtab;
	}

	public void setDateEtab(Date dateEtab) {
		this.dateEtab = dateEtab;
	}

	public String getLieuEtab() {
		return this.lieuEtab;
	}

	public void setLieuEtab(String lieuEtab) {
		this.lieuEtab = lieuEtab;
	}

	public String getNumStat() {
		return this.numStat;
	}

	public void setNumStat(String numStat) {
		this.numStat = numStat;
	}

	public String getNumdoc() {
		return this.numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public DocArtfPK getId() {
		return this.id;
	}

	public void setId(DocArtfPK id) {
		this.id = id;
	}
}