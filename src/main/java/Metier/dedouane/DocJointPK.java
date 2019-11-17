package Metier.dedouane;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the doc_joints database table.
 * 
 */
@Embeddable
public class DocJointPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="an_decl")
	private Date anDecl;

	@Column(name="code_bur")
	private short codeBur;

	@Column(name="code_doc")
	private short codeDoc;

	@Column(name="num_decl")
	private int numDecl;

	public Date getAnDecl() {
		return anDecl;
	}

	public void setAnDecl(Date anDecl) {
		this.anDecl = anDecl;
	}

	public short getCodeBur() {
		return codeBur;
	}

	public void setCodeBur(short codeBur) {
		this.codeBur = codeBur;
	}

	public short getCodeDoc() {
		return codeDoc;
	}

	public void setCodeDoc(short codeDoc) {
		this.codeDoc = codeDoc;
	}

	public int getNumDecl() {
		return numDecl;
	}

	public void setNumDecl(int numDecl) {
		this.numDecl = numDecl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anDecl == null) ? 0 : anDecl.hashCode());
		result = prime * result + codeBur;
		result = prime * result + codeDoc;
		result = prime * result + numDecl;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocJointPK other = (DocJointPK) obj;
		if (anDecl == null) {
			if (other.anDecl != null)
				return false;
		} else if (!anDecl.equals(other.anDecl))
			return false;
		if (codeBur != other.codeBur)
			return false;
		if (codeDoc != other.codeDoc)
			return false;
		if (numDecl != other.numDecl)
			return false;
		return true;
	}

	
	
	}