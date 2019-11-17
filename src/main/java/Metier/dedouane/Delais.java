package Metier.dedouane;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name = "delais")

public class Delais {
	
	@EmbeddedId
	private DelaisPK id  ; 
	
	@Column
	private boolean adistance ; 
	
	@Column 
	private  Integer  niveaub ; 
	
	@Column 
	private String  circuit ;
	
	@Column 
	private String valider  ; 
	
	@Column
	private String declarant ; 
	
	@Column  
	private String ipoc ; 
	
	@Column 
	private String ipoc1 ;
	
	@Column 
	private String inspect ; 
	
	@Column 
	private String caisse ; 
	
	@Column  
	private String archive  ; 
	
	@Column
	private Date dat_valid ; 
	
	@Column  
	private Date dat_depot ; 
	
	@Column
	private Date  dat_receptipoc ; 
	
	@Column 
	private Date dat_receptis  ; 
	
	@Column 
	private Date dat_receptipoc1 ; 
	
	@Column  
	private Date dat_etabquit; 
	
	@Column 
	private Date dat_receptcaisse ; 
	
	@Column 
	private Date dat_receptarch  ;  
	
	@Column
	private boolean etat ;

	public DelaisPK getId() {
		return id;
	}

	public void setId(DelaisPK id) {
		this.id = id;
	}

	public boolean isAdistance() {
		return adistance;
	}

	public void setAdistance(boolean adistance) {
		this.adistance = adistance;
	}

	public Integer getNiveaub() {
		return niveaub;
	}

	public void setNiveaub(Integer niveaub) {
		this.niveaub = niveaub;
	}

	public String getCircuit() {
		return circuit;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}

	public String getValider() {
		return valider;
	}

	public void setValider(String valider) {
		this.valider = valider;
	}

	public String getDeclarant() {
		return declarant;
	}

	public void setDeclarant(String declarant) {
		this.declarant = declarant;
	}

	public String getIpoc() {
		return ipoc;
	}

	public void setIpoc(String ipoc) {
		this.ipoc = ipoc;
	}

	public String getIpoc1() {
		return ipoc1;
	}

	public void setIpoc1(String ipoc1) {
		this.ipoc1 = ipoc1;
	}

	public String getInspect() {
		return inspect;
	}

	public void setInspect(String inspect) {
		this.inspect = inspect;
	}

	public String getCaisse() {
		return caisse;
	}

	public void setCaisse(String caisse) {
		this.caisse = caisse;
	}

	public String getArchive() {
		return archive;
	}

	public void setArchive(String archive) {
		this.archive = archive;
	}

	public Date getDat_valid() {
		return dat_valid;
	}

	public void setDat_valid(Date dat_valid) {
		this.dat_valid = dat_valid;
	}

	public Date getDat_depot() {
		return dat_depot;
	}

	public void setDat_depot(Date dat_depot) {
		this.dat_depot = dat_depot;
	}

	public Date getDat_receptipoc() {
		return dat_receptipoc;
	}

	public void setDat_receptipocc(Date dat_receptipocc) {
		this.dat_receptipoc = dat_receptipocc;
	}

	public Date getDat_receptis() {
		return dat_receptis;
	}

	public void setDat_receptis(Date dat_receptis) {
		this.dat_receptis = dat_receptis;
	}

	public Date getDat_receptipoc1() {
		return dat_receptipoc1;
	}

	public void setDat_receptipoc1(Date dat_receptipoc1) {
		this.dat_receptipoc1 = dat_receptipoc1;
	}

	public Date getDat_etabquit() {
		return dat_etabquit;
	}

	public void setDat_etabquit(Date dat_etabquit) {
		this.dat_etabquit = dat_etabquit;
	}

	public Date getDat_receptcaisse() {
		return dat_receptcaisse;
	}

	public void setDat_receptcaisse(Date dat_receptcaisse) {
		this.dat_receptcaisse = dat_receptcaisse;
	}

	public Date getDat_receptarch() {
		return dat_receptarch;
	}
	
	public void setDat_receptarch(Date dat_receptarch) {
		this.dat_receptarch = dat_receptarch;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Delais [id=" + id.toString() + ", adistance=" + adistance + ", niveaub=" + niveaub + ", circuit=" + circuit
				+ ", valider=" + valider + ", declarant=" + declarant + ", ipoc=" + ipoc + ", ipoc1=" + ipoc1
				+ ", inspect=" + inspect + ", caisse=" + caisse + ", archive=" + archive + ", dat_valid=" + dat_valid
				+ ", dat_depot=" + dat_depot + ", dat_receptipoc=" + dat_receptipoc + ", dat_receptis=" + dat_receptis
				+ ", dat_receptipoc1=" + dat_receptipoc1 + ", dat_etabquit=" + dat_etabquit + ", dat_receptcaisse="
				+ dat_receptcaisse + ", dat_receptarch=" + dat_receptarch + ", etat=" + etat + "]";
	}  
	
	
	
      
}
