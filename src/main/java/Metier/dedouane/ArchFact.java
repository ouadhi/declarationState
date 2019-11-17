package Metier.dedouane;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="arch_fact")
@NamedQuery(name="ArchFact.findAll", query="SELECT a FROM ArchFact a")

public class ArchFact implements Serializable {

	@EmbeddedId
	private ArchFactPK id;
		
	@Temporal(TemporalType.DATE)
	@Column(name="an_agrt")
	private Date anAgrt;
	
	@Temporal(TemporalType.DATE)
	@Column(name="datef_con")
	private Date datefCon;

	@Column(name="num_agrt")
	private Integer numAgrt;
	
    @Column(name ="type")
	private String type;
    
    @Column(name="unite")
	private Integer unite;

	public ArchFact() {
	}

	public ArchFactPK getId() {
		return id;
	}

	public void setId(ArchFactPK id) {
		this.id = id;
	}

	public Date getAnAgrt() {
		return anAgrt;
	}

	public void setAnAgrt(Date anAgrt) {
		this.anAgrt = anAgrt;
	}

	
	public Date getDatefCon() {
		return datefCon;
	}

	public void setDatefCon(Date datefCon) {
		this.datefCon = datefCon;
	}

	public int getNumAgrt() {
		return numAgrt;
	}

	public void setNumAgrt(Integer numAgrt) {
		this.numAgrt = numAgrt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getUnite() {
		return unite;
	}

	public void setUnite(Integer unite) {
		this.unite = unite;
	}

	@Override
	public String toString() {
		return "ArchFact [id=" + id + ", anAgrt=" + anAgrt + ", datefCon=" + datefCon + ", numAgrt=" + numAgrt
				+ ", type=" + type + ", unite=" + unite + "]";
	}
	
	



}