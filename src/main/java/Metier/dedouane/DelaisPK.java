package Metier.dedouane;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class DelaisPK implements Serializable{

	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_decl")
	private Date anDecl;

	@Column(name = "num_decl")
	private int numDecl;

	@Column(name = "code_bur")
	private int codeBur;

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

	@Override
	public String toString() {
		return "DelaisPK [anDecl=" + anDecl + ", numDecl=" + numDecl + ", codeBur=" + codeBur + "]";
	}
	
	

}
