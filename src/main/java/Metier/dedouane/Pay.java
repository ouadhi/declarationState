package Metier.dedouane;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="pays")

public class Pay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="abv_pays")
	private String abvPays;

	@Id
	@Column(name="code_pays")
	private Integer codePays;

	private String continent;

	private String monnaie;

	@Column(name="nom_pays")
	private String nomPays;

	public Pay() {
	}

	public String getAbvPays() {
		return this.abvPays;
	}

	public void setAbvPays(String abvPays) {
		this.abvPays = abvPays;
	}

	public Integer getCodePays() {
		return this.codePays;
	}

	public void setCodePays(Integer codePays) {
		this.codePays = codePays;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getMonnaie() {
		return this.monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}

	public String getNomPays() {
		return this.nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

}