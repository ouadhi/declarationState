package Metier.dedouane;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ArchFactPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_decl")
	private Date anDecl;
	@Column(name = "num_decl")
	private int numDecl;
	@Column(name = "code_bur")
	private int codeBur;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dated_con")
	private Date datedCon;

	public Date getAnDecl() {
		return this.anDecl;
	}

	public void setAnDecl(Date anDecl) {
		this.anDecl = anDecl;
	}

	public int getNumDecl() {
		return this.numDecl;
	}

	public int getCodeBur() {
		return this.codeBur;
	}

	public void setCodeBur(int codeBur) {
		this.codeBur = codeBur;
	}

	public void setNumDecl(int numDecl) {
		this.numDecl = numDecl;
	}
	
	public Date getDatedCon() {
		return datedCon;
	}

	public void setDatedCon(Date datedCon) {
		this.datedCon = datedCon;
	}

}