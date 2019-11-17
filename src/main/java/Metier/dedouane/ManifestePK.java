package Metier.dedouane;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ManifestePK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_manif")
	private Date anManif;
	@Column(name = "code_bur")
	private int codeBur;
	@Column(name = "num_manif")
	private int numManif;

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

	public int hashCode() {
		boolean prime = true;
		byte result = 1;
		int result1 = 31 * result + (this.anManif == null ? 0 : this.anManif.hashCode());
		result1 = 31 * result1 + this.codeBur;
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
			ManifestePK other = (ManifestePK) obj;
			if (this.anManif == null) {
				if (other.anManif != null) {
					return false;
				}
			} else if (!this.anManif.equals(other.anManif)) {
				return false;
			}

			return this.codeBur != other.codeBur ? false : this.numManif == other.numManif;
		}
	}
}