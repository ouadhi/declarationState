package Metier.dedouane;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class OeaPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "num_agrt")
	private int numAgrt;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_agrt")
	private Date anAgrt;

	public int getNumAgrt() {
		return this.numAgrt;
	}

	public void setNumAgrt(int numAgrt) {
		this.numAgrt = numAgrt;
	}

	public Date getAnAgrt() {
		return this.anAgrt;
	}

	public void setAnAgrt(Date anAgrt) {
		this.anAgrt = anAgrt;
	}

	public int hashCode() {
		boolean prime = true;
		byte result = 1;
		int result1 = 31 * result + (this.anAgrt == null ? 0 : this.anAgrt.hashCode());
		result1 = 31 * result1 + this.numAgrt;
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
			OeaPK other = (OeaPK) obj;
			if (this.anAgrt == null) {
				if (other.anAgrt != null) {
					return false;
				}
			} else if (!this.anAgrt.equals(other.anAgrt)) {
				return false;
			}

			return this.numAgrt == other.numAgrt;
		}
	}
}