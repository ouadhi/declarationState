package Metier.dedouane;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import Metier.Model.AgentDao;
import Metier.Model.ModelParametre;

@Entity
@Table(name = "declaration")
public class Declaration implements Serializable {

	@EmbeddedId
	private DeclarationPK id;
	@Column(name = "adr_frs")
	private String adrFrs;
	@Column(name = "adr_rangee")
	private String adrRangee;
	@Column(name = "agence_dom")
	private String agenceDom;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_agrt")
	private Date anAgrt;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_manif")
	private Date anManif;
	@Temporal(TemporalType.DATE)
	@Column(name = "an_oper")
	private Date anOper;
	private Integer articles;
	@Column(name = "at_et")
	private Integer atEt;
	@Column(name = "bnq_dom")
	private String bnqDom;
	@Column(name = "bur_arrive")
	private Integer burArrive;
	@Column(name = "bur_code_bur")
	private Integer burCodeBur;
	@Column(name = "bur_depart")
	private Integer burDepart;
	@Column(name = "bur2_code_bur")
	private Integer bur2CodeBur;
	private String circuit;
	@Column(name = "code_bur_manif")
	private Integer codeBurManif;
	@Column(name = "code_eng")
	private String codeEng;
	@Column(name = "code_oper")
	private Integer codeOper;
	@Column(name = "code_reg")
	private Integer codeReg;
	@Column(name = "coeff_ajust")
	private Float coeffAjust;
	@Column(name = "colis_decl")
	private Integer colisDecl;
	@Column(name = "cpt_tint")
	private Integer cptTint;
	@Temporal(TemporalType.DATE)
	@Column(name = "dat_date_heur")
	private Date datDateHeur;
	@Column(name = "date_bae")
	private Timestamp dateBae;
	@Column(name = "date_cotation")
	private Timestamp dateCotation;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_heur")
	private Date dateHeur;
	@Column(name = "date_inspect")
	private Timestamp dateInspect;
	@Column(name = "date_primo")
	private Timestamp datePrimo;
	@Column(name = "date_verif")
	private Timestamp dateVerif;
	@Column(name = "dec_an_decl")
	private Timestamp decAnDecl;
	@Column(name = "dec_code_bur")
	private Integer decCodeBur;
	@Column(name = "dec_num_decl")
	private Integer decNumDecl;
	@Column(name = "dossier_dcl")
	private String dossierDcl;
	@Column(name = "duree_at")
	private Integer dureeAt;
	@Column(name = "etat_dcl")
	private String etatDcl;
	@Column(name = "etat_rcv")
	private String etatRcv;
	@Column(name = "ident_tint")
	private String identTint;
	@Column(name = "kg_douane")
	private Float kgDouane;
	private Float lavaleur;
	@Column(name = "lc_ass")
	private Float lcAss;
	@Column(name = "lc_frais")
	private Float lcFrais;
	@Column(name = "lc_fret")
	private Float lcFret;
	@Column(name = "lc_ptfn")
	private Float lcPtfn;
	@Column(name = "lieu_at")
	private String lieuAt;
	@Column(name = "mat_agt")
	private Integer matAgt;
	@Column(name = "mod_tint")
	private String modTint;
	@Column(name = "mode_finance")
	private String modeFinance;
	@Column(name = "mode_paiement")
	private String modePaiement;
	@Column(name = "mon_dcl")
	private Float monDcl;
	@Column(name = "monnaie_ass")
	private String monnaieAss;
	@Column(name = "monnaie_frais")
	private String monnaieFrais;
	@Column(name = "monnaie_fret")
	private String monnaieFret;
	@Column(name = "monnaie_ptfn")
	private String monnaiePtfn;
	@Column(name = "mt_ass")
	private Float mtAss;
	@Column(name = "mt_ass2")
	private Float mtAss2;
	@Column(name = "mt_caution")
	private Float mtCaution;
	@Column(name = "mt_coef")
	private Float mtCoef;
	@Column(name = "mt_frais")
	private Float mtFrais;
	@Column(name = "mt_frais2")
	private Float mtFrais2;
	@Column(name = "mt_fret")
	private Float mtFret;
	@Column(name = "mt_fret2")
	private Float mtFret2;
	@Column(name = "mt_ptfn")
	private Float mtPtfn;
	@Column(name = "mt_ptfn2")
	private Float mtPtfn2;
	@Column(name = "nat_contrat")
	private String natContrat;
	@Column(name = "nbr_art")
	private Integer nbrArt;
	@Column(name = "nom_frs")
	private String nomFrs;
	@Column(name = "num_agrt")
	private Integer numAgrt;
	@Column(name = "num_cred")
	private Integer numCred;
	@Column(name = "num_dom")
	private String numDom;
	@Column(name = "num_group")
	private Integer numGroup;
	@Column(name = "num_ligne")
	private Integer numLigne;
	@Column(name = "num_manif")
	private Integer numManif;
	@Column(name = "num_rep")
	private Integer numRep;
	private Integer passage;
	@Column(name = "pay_prov")
	private String payProv;
	@Column(name = "pays_frs")
	private String paysFrs;
	@Column(name = "plus_value")
	private Float plusValue;
	@Column(name = "poids_decl")
	private Float poidsDecl;
	@Column(name = "poidsn_dcl")
	private Float poidsnDcl;
	@Column(name = "rec_dcl")
	private String recDcl;
	@Column(name = "rec_verif")
	private String recVerif;
	@Column(name = "rec_visit")
	private String recVisit;
	@Column(name = "rel_av")
	private String relAv;
	@Column(name = "res_verif")
	private String resVerif;
	@Column(name = "res_visit")
	private String resVisit;
	private Integer revue;
	@Column(name = "tx_susp")
	private Float txSusp;
	@Column(name = "type_dcl")
	private String typeDcl;
	@Column(name = "type_ded")
	private String typeDed;
	@Column(name = "type_manif")
	private String typeManif;
	@Column(name = "type_operat")
	private String typeOperat;
	@Column(name = "val_douane")
	private Float valDouane;
	private int valider;

	public DeclarationPK getId() {
		return id;
	}

	public void setId(DeclarationPK id) {
		this.id = id;
	}

	public String getAdrFrs() {
		return adrFrs;
	}

	public void setAdrFrs(String adrFrs) {
		this.adrFrs = adrFrs;
	}

	public String getAdrRangee() {
		return adrRangee;
	}

	public void setAdrRangee(String adrRangee) {
		this.adrRangee = adrRangee;
	}

	public String getAgenceDom() {
		return agenceDom;
	}

	public void setAgenceDom(String agenceDom) {
		this.agenceDom = agenceDom;
	}

	public Date getAnAgrt() {
		return anAgrt;
	}

	public void setAnAgrt(Date anAgrt) {
		this.anAgrt = anAgrt;
	}

	public Date getAnManif() {
		return anManif;
	}

	public void setAnManif(Date anManif) {
		this.anManif = anManif;
	}

	public Date getAnOper() {
		return anOper;
	}

	public void setAnOper(Date anOper) {
		this.anOper = anOper;
	}

	public Integer getArticles() {
		return articles;
	}

	public void setArticles(Integer articles) {
		this.articles = articles;
	}

	public Integer getAtEt() {
		return atEt;
	}

	public void setAtEt(Integer atEt) {
		this.atEt = atEt;
	}

	public String getBnqDom() {
		return bnqDom;
	}

	public void setBnqDom(String bnqDom) {
		this.bnqDom = bnqDom;
	}

	public Integer getBurArrive() {
		return burArrive;
	}

	public void setBurArrive(Integer burArrive) {
		this.burArrive = burArrive;
	}

	public Integer getBurCodeBur() {
		return burCodeBur;
	}

	public void setBurCodeBur(Integer burCodeBur) {
		this.burCodeBur = burCodeBur;
	}

	public Integer getBurDepart() {
		return burDepart;
	}

	public void setBurDepart(Integer burDepart) {
		this.burDepart = burDepart;
	}

	public Integer getBur2CodeBur() {
		return bur2CodeBur;
	}

	public void setBur2CodeBur(Integer bur2CodeBur) {
		this.bur2CodeBur = bur2CodeBur;
	}

	public String getCircuit() {
		return circuit;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}

	public Integer getCodeBurManif() {
		return codeBurManif;
	}

	public void setCodeBurManif(Integer codeBurManif) {
		this.codeBurManif = codeBurManif;
	}

	public String getCodeEng() {
		return codeEng;
	}

	public void setCodeEng(String codeEng) {
		this.codeEng = codeEng;
	}

	public Integer getCodeOper() {
		return codeOper;
	}

	public void setCodeOper(Integer codeOper) {
		this.codeOper = codeOper;
	}

	public Integer getCodeReg() {
		return codeReg;
	}

	public void setCodeReg(Integer codeReg) {
		this.codeReg = codeReg;
	}

	public Float getCoeffAjust() {
		return coeffAjust;
	}

	public void setCoeffAjust(Float coeffAjust) {
		this.coeffAjust = coeffAjust;
	}

	public Integer getColisDecl() {
		return colisDecl;
	}

	public void setColisDecl(Integer colisDecl) {
		this.colisDecl = colisDecl;
	}

	public Integer getCptTint() {
		return cptTint;
	}

	public void setCptTint(Integer cptTint) {
		this.cptTint = cptTint;
	}

	public Date getDatDateHeur() {
		return datDateHeur;
	}

	public void setDatDateHeur(Date datDateHeur) {
		this.datDateHeur = datDateHeur;
	}

	public Timestamp getDateBae() {
		return dateBae;
	}

	public void setDateBae(Timestamp dateBae) {
		this.dateBae = dateBae;
	}

	public Timestamp getDateCotation() {
		return dateCotation;
	}

	public void setDateCotation(Timestamp dateCotation) {
		this.dateCotation = dateCotation;
	}

	public Date getDateHeur() {
		return dateHeur;
	}

	public void setDateHeur(Date dateHeur) {
		this.dateHeur = dateHeur;
	}

	public Timestamp getDateInspect() {
		return dateInspect;
	}

	public void setDateInspect(Timestamp dateInspect) {
		this.dateInspect = dateInspect;
	}

	public Timestamp getDatePrimo() {
		return datePrimo;
	}

	public void setDatePrimo(Timestamp datePrimo) {
		this.datePrimo = datePrimo;
	}

	public Timestamp getDateVerif() {
		return dateVerif;
	}

	public void setDateVerif(Timestamp dateVerif) {
		this.dateVerif = dateVerif;
	}

	public Timestamp getDecAnDecl() {
		return decAnDecl;
	}

	public void setDecAnDecl(Timestamp decAnDecl) {
		this.decAnDecl = decAnDecl;
	}

	public Integer getDecCodeBur() {
		return decCodeBur;
	}

	public void setDecCodeBur(Integer decCodeBur) {
		this.decCodeBur = decCodeBur;
	}

	public Integer getDecNumDecl() {
		return decNumDecl;
	}

	public void setDecNumDecl(Integer decNumDecl) {
		this.decNumDecl = decNumDecl;
	}

	public String getDossierDcl() {
		return dossierDcl;
	}

	public void setDossierDcl(String dossierDcl) {
		this.dossierDcl = dossierDcl;
	}

	public Integer getDureeAt() {
		return dureeAt;
	}

	public void setDureeAt(Integer dureeAt) {
		this.dureeAt = dureeAt;
	}

	public String getEtatDcl() {
		return etatDcl;
	}

	public void setEtatDcl(String etatDcl) {
		this.etatDcl = etatDcl;
	}

	public String getEtatRcv() {
		return etatRcv;
	}

	public void setEtatRcv(String etatRcv) {
		this.etatRcv = etatRcv;
	}

	public String getIdentTint() {
		return identTint;
	}

	public void setIdentTint(String identTint) {
		this.identTint = identTint;
	}

	public Float getKgDouane() {
		return kgDouane;
	}

	public void setKgDouane(Float kgDouane) {
		this.kgDouane = kgDouane;
	}

	public Float getLavaleur() {
		return lavaleur;
	}

	public void setLavaleur(Float lavaleur) {
		this.lavaleur = lavaleur;
	}

	public Float getLcAss() {
		return lcAss;
	}

	public void setLcAss(Float lcAss) {
		this.lcAss = lcAss;
	}

	public Float getLcFrais() {
		return lcFrais;
	}

	public void setLcFrais(Float lcFrais) {
		this.lcFrais = lcFrais;
	}

	public Float getLcFret() {
		return lcFret;
	}

	public void setLcFret(Float lcFret) {
		this.lcFret = lcFret;
	}

	public Float getLcPtfn() {
		return lcPtfn;
	}

	public void setLcPtfn(Float lcPtfn) {
		this.lcPtfn = lcPtfn;
	}

	public String getLieuAt() {
		return lieuAt;
	}

	public void setLieuAt(String lieuAt) {
		this.lieuAt = lieuAt;
	}

	public Integer getMatAgt() {
		return matAgt;
	}

	public void setMatAgt(Integer matAgt) {
		this.matAgt = matAgt;
	}

	public String getModTint() {
		return modTint;
	}

	public void setModTint(String modTint) {
		this.modTint = modTint;
	}

	public String getModeFinance() {
		return modeFinance;
	}

	public void setModeFinance(String modeFinance) {
		this.modeFinance = modeFinance;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}

	public Float getMonDcl() {
		return monDcl;
	}

	public void setMonDcl(Float monDcl) {
		this.monDcl = monDcl;
	}

	public String getMonnaieAss() {
		return monnaieAss;
	}

	public void setMonnaieAss(String monnaieAss) {
		this.monnaieAss = monnaieAss;
	}

	public String getMonnaieFrais() {
		return monnaieFrais;
	}

	public void setMonnaieFrais(String monnaieFrais) {
		this.monnaieFrais = monnaieFrais;
	}

	public String getMonnaieFret() {
		return monnaieFret;
	}

	public void setMonnaieFret(String monnaieFret) {
		this.monnaieFret = monnaieFret;
	}

	public String getMonnaiePtfn() {
		return monnaiePtfn;
	}

	public void setMonnaiePtfn(String monnaiePtfn) {
		this.monnaiePtfn = monnaiePtfn;
	}

	public Float getMtAss() {
		return mtAss;
	}

	public void setMtAss(Float mtAss) {
		this.mtAss = mtAss;
	}

	public Float getMtAss2() {
		return mtAss2;
	}

	public void setMtAss2(Float mtAss2) {
		this.mtAss2 = mtAss2;
	}

	public Float getMtCaution() {
		return mtCaution;
	}

	public void setMtCaution(Float mtCaution) {
		this.mtCaution = mtCaution;
	}

	public Float getMtCoef() {
		return mtCoef;
	}

	public void setMtCoef(Float mtCoef) {
		this.mtCoef = mtCoef;
	}

	public Float getMtFrais() {
		return mtFrais;
	}

	public void setMtFrais(Float mtFrais) {
		this.mtFrais = mtFrais;
	}

	public Float getMtFrais2() {
		return mtFrais2;
	}

	public void setMtFrais2(Float mtFrais2) {
		this.mtFrais2 = mtFrais2;
	}

	public Float getMtFret() {
		return mtFret;
	}

	public void setMtFret(Float mtFret) {
		this.mtFret = mtFret;
	}

	public Float getMtFret2() {
		return mtFret2;
	}

	public void setMtFret2(Float mtFret2) {
		this.mtFret2 = mtFret2;
	}

	public Float getMtPtfn() {
		return mtPtfn;
	}

	public void setMtPtfn(Float mtPtfn) {
		this.mtPtfn = mtPtfn;
	}

	public Float getMtPtfn2() {
		return mtPtfn2;
	}

	public void setMtPtfn2(Float mtPtfn2) {
		this.mtPtfn2 = mtPtfn2;
	}

	public String getNatContrat() {
		return natContrat;
	}

	public void setNatContrat(String natContrat) {
		this.natContrat = natContrat;
	}

	public Integer getNbrArt() {
		return nbrArt;
	}

	public void setNbrArt(Integer nbrArt) {
		this.nbrArt = nbrArt;
	}

	public String getNomFrs() {
		return nomFrs;
	}

	public void setNomFrs(String nomFrs) {
		this.nomFrs = nomFrs;
	}

	public Integer getNumAgrt() {
		return numAgrt;
	}

	public void setNumAgrt(Integer numAgrt) {
		this.numAgrt = numAgrt;
	}

	public Integer getNumCred() {
		return numCred;
	}

	public void setNumCred(Integer numCred) {
		this.numCred = numCred;
	}

	public String getNumDom() {
		return numDom;
	}

	public void setNumDom(String numDom) {
		this.numDom = numDom;
	}

	public Integer getNumGroup() {
		return numGroup;
	}

	public void setNumGroup(Integer numGroup) {
		this.numGroup = numGroup;
	}

	public Integer getNumLigne() {
		return numLigne;
	}

	public void setNumLigne(Integer numLigne) {
		this.numLigne = numLigne;
	}

	public Integer getNumManif() {
		return numManif;
	}

	public void setNumManif(Integer numManif) {
		this.numManif = numManif;
	}

	public Integer getNumRep() {
		return numRep;
	}

	public void setNumRep(Integer numRep) {
		this.numRep = numRep;
	}

	public Integer getPassage() {
		return passage;
	}

	public void setPassage(Integer passage) {
		this.passage = passage;
	}

	public String getPayProv() {
		return payProv;
	}

	public void setPayProv(String payProv) {
		this.payProv = payProv;
	}

	public String getPaysFrs() {
		return paysFrs;
	}

	public void setPaysFrs(String paysFrs) {
		this.paysFrs = paysFrs;
	}

	public Float getPlusValue() {
		return plusValue;
	}

	public void setPlusValue(Float plusValue) {
		this.plusValue = plusValue;
	}

	public Float getPoidsDecl() {
		return poidsDecl;
	}

	public void setPoidsDecl(Float poidsDecl) {
		this.poidsDecl = poidsDecl;
	}

	public Float getPoidsnDcl() {
		return poidsnDcl;
	}

	public void setPoidsnDcl(Float poidsnDcl) {
		this.poidsnDcl = poidsnDcl;
	}

	public String getRecDcl() {
		return recDcl;
	}

	public void setRecDcl(String recDcl) {
		this.recDcl = recDcl;
	}

	public String getRecVerif() {
		return recVerif;
	}

	public void setRecVerif(String recVerif) {
		this.recVerif = recVerif;
	}

	public String getRecVisit() {
		return recVisit;
	}

	public void setRecVisit(String recVisit) {
		this.recVisit = recVisit;
	}

	public String getRelAv() {
		return relAv;
	}

	public void setRelAv(String relAv) {
		this.relAv = relAv;
	}

	public String getResVerif() {
		return resVerif;
	}

	public void setResVerif(String resVerif) {
		this.resVerif = resVerif;
	}

	public String getResVisit() {
		return resVisit;
	}

	public void setResVisit(String resVisit) {
		this.resVisit = resVisit;
	}

	public Integer getRevue() {
		return revue;
	}

	public void setRevue(Integer revue) {
		this.revue = revue;
	}

	public Float getTxSusp() {
		return txSusp;
	}

	public void setTxSusp(Float txSusp) {
		this.txSusp = txSusp;
	}

	public String getTypeDcl() {
		return typeDcl;
	}

	public void setTypeDcl(String typeDcl) {
		this.typeDcl = typeDcl;
	}

	public String getTypeDed() {
		return typeDed;
	}

	public void setTypeDed(String typeDed) {
		this.typeDed = typeDed;
	}

	public String getTypeManif() {
		return typeManif;
	}

	public void setTypeManif(String typeManif) {
		this.typeManif = typeManif;
	}

	public String getTypeOperat() {
		return typeOperat;
	}

	public void setTypeOperat(String typeOperat) {
		this.typeOperat = typeOperat;
	}

	public Float getValDouane() {
		return valDouane;
	}

	public void setValDouane(Float valDouane) {
		this.valDouane = valDouane;
	}

	public int getValider() {
		return valider;
	}

	public void setValider(int valider) {
		this.valider = valider;
	}

	public String getDeclarationstate ()  {
		String state  = ""   ; 
		try {
		 ModelParametre  modelParametre  = new ModelParametre() ; 
		 state = modelParametre.findDeclarationParametreCode(this.etatDcl).getLibelle() ;  
		 return state ; 
			
		} catch (Exception e) {
			System.err.println(e);
			return state  ;
		}
	}
	
	public Agent DetailsAgent () {
		return  new AgentDao().findById(this.matAgt); 
	}


}