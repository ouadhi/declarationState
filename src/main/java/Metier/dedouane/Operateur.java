package Metier.dedouane;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "operateur")
public class Operateur {

       @Id
       @Column(name = "code_oper")
       private  Integer  codeOperateur ; 
       
       @Column(name = "letype")
       private Integer  letype ; 
       
       @Column
       private Integer an_oper ; 
       
       @Column 
       private String norder  ; 
       
       @Column 
       private  String code_fiscal ; 
       
       @Column
       private  String nom_oper ; 
       
       @Column
       private  String adr_oper  ; 
       
       @Column
       private  String code_postale  ; 
       
       @Column  
       private String act_oper ; 
       
       @Column 
       private  String num_conv  ;  
       
       @Column 
       private  String solv_oper  ; 
       
       @Column
       private  String nrc ;

	public Integer getCodeOperateur() {
		return codeOperateur;
	}

	public void setCodeOperateur(Integer codeOperateur) {
		this.codeOperateur = codeOperateur;
	}

	public Integer getLetype() {
		return letype;
	}

	public void setLetype(Integer letype) {
		this.letype = letype;
	}

	public Integer getAn_oper() {
		return an_oper;
	}

	public void setAn_oper(Integer an_oper) {
		this.an_oper = an_oper;
	}

	public String getNorder() {
		return norder;
	}

	public void setNorder(String norder) {
		this.norder = norder;
	}

	public String getCode_fiscal() {
		return code_fiscal;
	}

	public void setCode_fiscal(String code_fiscal) {
		this.code_fiscal = code_fiscal;
	}

	public String getNom_oper() {
		return nom_oper;
	}

	public void setNom_oper(String nom_oper) {
		this.nom_oper = nom_oper;
	}

	public String getAdr_oper() {
		return adr_oper;
	}

	public void setAdr_oper(String adr_oper) {
		this.adr_oper = adr_oper;
	}

	public String getCode_postale() {
		return code_postale;
	}

	public void setCode_postale(String code_postale) {
		this.code_postale = code_postale;
	}

	public String getAct_oper() {
		return act_oper;
	}

	public void setAct_oper(String act_oper) {
		this.act_oper = act_oper;
	}

	public String getNum_conv() {
		return num_conv;
	}

	public void setNum_conv(String num_conv) {
		this.num_conv = num_conv;
	}

	public String getSolv_oper() {
		return solv_oper;
	}

	public void setSolv_oper(String solv_oper) {
		this.solv_oper = solv_oper;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	} 
       
       
       
       
}
