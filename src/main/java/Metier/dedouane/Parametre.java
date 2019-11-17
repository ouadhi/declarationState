package Metier.dedouane;


import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "parametre")

public class Parametre implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	
	private ParametrePK id;
	private String libelle;

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public ParametrePK getId() {
		return this.id;
	}

	public void setId(ParametrePK id) {
		this.id = id;
	}
}