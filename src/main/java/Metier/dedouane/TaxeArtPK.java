package Metier.dedouane;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TaxeArtPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_decl")
	private Date anDecl;
	@Column(name = "num_decl")
	private int numDecl;
	@Column(name = "code_bur")
	private int codeBur;
	@Column(name = "num_art")
	private short numArt;
	private String taxabrev;

	public short getNumArt() {
		return this.numArt;
	}

	public void setNumArt(short numArt) {
		this.numArt = numArt;
	}

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

	public String getTaxabrev() {
		return this.taxabrev;
	}

	public void setTaxabrev(String taxabrev) {
		this.taxabrev = taxabrev;
	}

	public int hashCode() {
		boolean prime = true;
		byte result = 1;
		int result1 = 31 * result + (this.anDecl == null ? 0 : this.anDecl.hashCode());
		result1 = 31 * result1 + this.codeBur;
		result1 = 31 * result1 + this.numArt;
		result1 = 31 * result1 + this.numDecl;
		result1 = 31 * result1 + (this.taxabrev == null ? 0 : this.taxabrev.hashCode());
		return result1;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			TaxeArtPK other = (TaxeArtPK) obj;
			if (this.anDecl == null) {
				if (other.anDecl != null) {
					return false;
				}
			} else if (!this.anDecl.equals(other.anDecl)) {
				return false;
			}

			if (this.codeBur != other.codeBur) {
				return false;
			} else if (this.numArt != other.numArt) {
				return false;
			} else if (this.numDecl != other.numDecl) {
				return false;
			} else {
				if (this.taxabrev == null) {
					if (other.taxabrev != null) {
						return false;
					}
				} else if (!this.taxabrev.equals(other.taxabrev)) {
					return false;
				}

				return true;
			}
		}
	}
}