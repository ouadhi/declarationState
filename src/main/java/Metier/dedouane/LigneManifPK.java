package Metier.dedouane;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class LigneManifPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_manif")
	private Date anManif;
	@Column(name = "code_bur")
	private int codeBur;
	@Column(name = "num_manif")
	private int numManif;
	@Column(name = "num_ligne")
	private short numLigne;
	@Column(name = "num_group")
	private short numGroup;

	public Date getAnManif() {
		return this.anManif;
	}

	public void setAnManif(Date anManif) {
		this.anManif = anManif;
	}

	public int getCodeBur() {
		return this.codeBur;
	}

	public void setCodeBur(int codeBur) {
		this.codeBur = codeBur;
	}

	public int getNumManif() {
		return this.numManif;
	}

	public void setNumManif(int numManif) {
		this.numManif = numManif;
	}

	public short getNumLigne() {
		return this.numLigne;
	}

	public void setNumLigne(short numLigne) {
		this.numLigne = numLigne;
	}

	public short getNumGroup() {
		return this.numGroup;
	}

	public void setNumGroup(short numGroup) {
		this.numGroup = numGroup;
	}

	public int hashCode() {
		boolean prime = true;
		byte result = 1;
		int result1 = 31 * result + (this.anManif == null ? 0 : this.anManif.hashCode());
		result1 = 31 * result1 + this.codeBur;
		result1 = 31 * result1 + this.numGroup;
		result1 = 31 * result1 + this.numLigne;
		result1 = 31 * result1 + this.numManif;
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
			LigneManifPK other = (LigneManifPK) obj;
			if (this.anManif == null) {
				if (other.anManif != null) {
					return false;
				}
			} else if (!this.anManif.equals(other.anManif)) {
				return false;
			}

			return this.codeBur != other.codeBur
					? false
					: (this.numGroup != other.numGroup
							? false
							: (this.numLigne != other.numLigne ? false : this.numManif == other.numManif));
		}
	}
}