package Metier.dedouane;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class ParametrePK implements Serializable {
	private static final long serialVersionUID = 1L;
	private String caracter;
	private String code;

	public String getCaracter() {
		return this.caracter;
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int hashCode() {
		boolean prime = true;
		byte result = 1;
		int result1 = 31 * result + (this.caracter == null ? 0 : this.caracter.hashCode());
		result1 = 31 * result1 + (this.code == null ? 0 : this.code.hashCode());
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
			ParametrePK other = (ParametrePK) obj;
			if (this.caracter == null) {
				if (other.caracter != null) {
					return false;
				}
			} else if (!this.caracter.equals(other.caracter)) {
				return false;
			}

			if (this.code == null) {
				if (other.code != null) {
					return false;
				}
			} else if (!this.code.equals(other.code)) {
				return false;
			}

			return true;
		}
	}
}