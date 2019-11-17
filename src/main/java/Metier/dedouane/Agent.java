package Metier.dedouane;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="agent")
public class Agent   implements  Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name =  "mat_agt")
	private  Integer  matAgent  ; 
	
	@Column(name="nom_agt")
	private String nomAgent  ; 
	
	@Column(name = "grade_agt")
	private String gradeAgent  ; 
	
	@Column(name = "code_agt")
	private Integer codeAgent; 
	
	@Column(name = "code_bur")
	private  Integer codeBureau ; 
	
	@Column(name = "etat_agt")
	private String  etatAgent  ;

	public Agent() {
		super();
	}

	public Integer getMatAgent() {
		return matAgent;
	}

	public void setMatAgent(Integer matAgent) {
		this.matAgent = matAgent;
	}

	public String getNomAgent() {
		return nomAgent;
	}

	public void setNomAgent(String nomAgent) {
		this.nomAgent = nomAgent;
	}

	public String getGradeAgent() {
		return gradeAgent;
	}

	public void setGradeAgent(String gradeAgent) {
		this.gradeAgent = gradeAgent;
	}

	public Integer getCodeAgent() {
		return codeAgent;
	}

	public void setCodeAgent(Integer codeAgent) {
		this.codeAgent = codeAgent;
	}

	public Integer getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(Integer codeBureau) {
		this.codeBureau = codeBureau;
	}

	public String getEtatAgent() {
		return etatAgent;
	}

	public void setEtatAgent(String etatAgent) {
		this.etatAgent = etatAgent;
	}

	@Override
	public String toString() {
		return "Agent [matAgent=" + matAgent + ", nomAgent=" + nomAgent + ", gradeAgent=" + gradeAgent + ", codeAgent="
				+ codeAgent + ", codeBureau=" + codeBureau + ", etatAgent=" + etatAgent + "]";
	} 
		
	
}
