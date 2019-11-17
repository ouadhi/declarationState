package Metier.dedouane;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the douanier database table.
 * 
 */
@Entity
@Table(name = "Douanier")
@NamedQuery(name="Douanier.findAll", query="SELECT d FROM Douanier d")
public class Douanier implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Column(name="code_agt")
	private short codeAgt;

	@Column(name="code_bur")
	private short codeBur;

	@Column(name="etat_agt")
	private String etatAgt;

	@Column(name="grade_agt")
	private String gradeAgt;

	@Id
	@Column(name="mat_agt")
	private int matAgt;

	@Column(name="nom_agt")
	private String nomAgt;

	@Column(name="prenom_agt")
	private String prenomAgt;

	public Douanier() {
	}

	public short getCodeAgt() {
		return this.codeAgt;
	}

	public void setCodeAgt(short codeAgt) {
		this.codeAgt = codeAgt;
	}

	public short getCodeBur() {
		return this.codeBur;
	}

	public void setCodeBur(short codeBur) {
		this.codeBur = codeBur;
	}

	public String getEtatAgt() {
		return this.etatAgt;
	}

	public void setEtatAgt(String etatAgt) {
		this.etatAgt = etatAgt;
	}

	public String getGradeAgt() {
		return this.gradeAgt;
	}

	public void setGradeAgt(String gradeAgt) {
		this.gradeAgt = gradeAgt;
	}

	public int getMatAgt() {
		return this.matAgt;
	}

	public void setMatAgt(int matAgt) {
		this.matAgt = matAgt;
	}

	public String getNomAgt() {
		return this.nomAgt;
	}

	public void setNomAgt(String nomAgt) {
		this.nomAgt = nomAgt;
	}

	public String getPrenomAgt() {
		return this.prenomAgt;
	}

	public void setPrenomAgt(String prenomAgt) {
		this.prenomAgt = prenomAgt;
	}

}