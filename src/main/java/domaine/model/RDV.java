package domaine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "RDV")

public class RDV {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "idClient")
	private long idClient;
	@Column(name = "dateRDV")
	private Date dateRDV;
	@Column(name = "etat")
	private Boolean etat;
	@Column(name = "validation")
	private Boolean validation;
	
	
	


	public RDV( long idClient, Date dateRDV, Boolean etat, Boolean validation) {
	  
		this.idClient = idClient;
		this.dateRDV = dateRDV;
		this.etat = etat;
		this.validation = validation;
	}
	
	public RDV()
	{
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public Date getDateRDV() {
		return dateRDV;
	}
	public void setDateRDV(Date dateRDV) {
		this.dateRDV = dateRDV;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Boolean getValidation() {
		return validation;
	}

	public void setValidation(Boolean validation) {
		this.validation = validation;
	}
	
	
	

}
