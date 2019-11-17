package Metier.dedouane;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class TaxeDclPK
    implements Serializable
{

    private static final long serialVersionUID = 1L;
  
    @Temporal(TemporalType.DATE)
	@Column(name = "an_decl")
    private Date anDecl;
    @Column(name = "num_decl")
	private int numDecl;
	@Column(name = "code_bur")
    private int codeBur;
	private String taxabrev;
	@Column(name = "quo_taxi")
	private BigDecimal quoTaxi;




    public TaxeDclPK()
    {
    }

  
    public Date getAnDecl()
    {
        return anDecl;
    }

    public void setAnDecl(Date anDecl)
    {
        this.anDecl = anDecl;
    }

    public int getNumDecl()
    {
        return numDecl;
    }

    public int getCodeBur()
    {
        return codeBur;
    }

    public void setCodeBur(int codeBur)
    {
        this.codeBur = codeBur;
    }

    public void setNumDecl(int numDecl)
    {
        this.numDecl = numDecl;
    }

    public String getTaxabrev()
    {
        return taxabrev;
    }

    public void setTaxabrev(String taxabrev)
    {
        this.taxabrev = taxabrev;
    }


	public BigDecimal getQuoTaxi() {
		return quoTaxi;
	}


	public void setQuoTaxi(BigDecimal quoTaxi) {
		this.quoTaxi = quoTaxi;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anDecl == null) ? 0 : anDecl.hashCode());
		result = prime * result + codeBur;
		result = prime * result + numDecl;
		result = prime * result + ((quoTaxi == null) ? 0 : quoTaxi.hashCode());
		result = prime * result + ((taxabrev == null) ? 0 : taxabrev.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxeDclPK other = (TaxeDclPK) obj;
		if (anDecl == null) {
			if (other.anDecl != null)
				return false;
		} else if (!anDecl.equals(other.anDecl))
			return false;
		if (codeBur != other.codeBur)
			return false;
		if (numDecl != other.numDecl)
			return false;
		if (quoTaxi == null) {
			if (other.quoTaxi != null)
				return false;
		} else if (!quoTaxi.equals(other.quoTaxi))
			return false;
		if (taxabrev == null) {
			if (other.taxabrev != null)
				return false;
		} else if (!taxabrev.equals(other.taxabrev))
			return false;
		return true;
	}



   
}
