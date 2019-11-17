package Metier.dedouane;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "doc_joints")
public class DocJoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DocJointPK id;

	private Integer assemble;

	@Column(name = "chx_decl")
	private Integer chxDecl;

	@Column(name = "chx_douane")
	private Integer chxDouane;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_depot")
	private Date dateDepot;

	private Integer depot;

	@Column(name = "num_art")
	private Integer numArt;

	@Column(name = "regl_regime")
	private Integer reglRegime;

	public DocJoint() {
	}

	public Integer getAssemble() {
		return this.assemble;
	}

	public void setAssemble(Integer assemble) {
		this.assemble = assemble;
	}

	public Integer getChxDecl() {
		return this.chxDecl;
	}

	public void setChxDecl(Integer chxDecl) {
		this.chxDecl = chxDecl;
	}

	public Integer getChxDouane() {
		return this.chxDouane;
	}

	public void setChxDouane(Integer chxDouane) {
		this.chxDouane = chxDouane;
	}

	public Date getDateDepot() {
		return this.dateDepot;
	}

	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}

	public Integer getDepot() {
		return this.depot;
	}

	public void setDepot(Integer depot) {
		this.depot = depot;
	}

	public Integer getNumArt() {
		return this.numArt;
	}

	public void setNumArt(Integer numArt) {
		this.numArt = numArt;
	}

	public Integer getReglRegime() {
		return this.reglRegime;
	}

	public void setReglRegime(Integer reglRegime) {
		this.reglRegime = reglRegime;
	}

	public DocJointPK getId() {
		return id;
	}

	public void setId(DocJointPK id) {
		this.id = id;
	}

}