package Metier.dedouane;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="moyen_trans")

public class MoyenTran implements Serializable {
	private static final long serialVersionUID = 1L;

	private String compagnie;

	@Column(name="jauge_brut")
	private BigDecimal jaugeBrut;

	@Column(name="jauge_net")
	private BigDecimal jaugeNet;

	private String mode;

	private Integer nationalite;

	private String numero;

	private Integer pavillon;

	private BigDecimal tare;

	@Id
	private String transport;

	public MoyenTran() {
	}

	public String getCompagnie() {
		return this.compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public BigDecimal getJaugeBrut() {
		return this.jaugeBrut;
	}

	public void setJaugeBrut(BigDecimal jaugeBrut) {
		this.jaugeBrut = jaugeBrut;
	}

	public BigDecimal getJaugeNet() {
		return this.jaugeNet;
	}

	public void setJaugeNet(BigDecimal jaugeNet) {
		this.jaugeNet = jaugeNet;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Integer getNationalite() {
		return this.nationalite;
	}

	public void setNationalite(Integer nationalite) {
		this.nationalite = nationalite;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getPavillon() {
		return this.pavillon;
	}

	public void setPavillon(Integer pavillon) {
		this.pavillon = pavillon;
	}

	public BigDecimal getTare() {
		return this.tare;
	}

	public void setTare(BigDecimal tare) {
		this.tare = tare;
	}

	public String getTransport() {
		return this.transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

}