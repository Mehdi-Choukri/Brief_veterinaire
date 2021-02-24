package domaine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "consultation")

public class Consultation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "idClient")
	private long idClient;
	@Column(name = "idAnimal")
	private long idAnimal;
	@Column(name = "idVeterinaire")
	private long idVeterinaire;
	@Column(name = "dateConsultation")
	private Date dateConsultation;
	@Column(name = "tarif")
	private Double tarif;
	
	
	public Consultation(long id, long idClient, long idAnimal, long idVeterinaire, Date dateConsultation,
			Double tarif) {
	 
		this.id = id;
		this.idClient = idClient;
		this.idAnimal = idAnimal;
		this.idVeterinaire = idVeterinaire;
		this.dateConsultation = dateConsultation;
		this.tarif = tarif;
	}
	
	public Consultation() {
	 
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
	public long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public long getIdVeterinaire() {
		return idVeterinaire;
	}
	public void setIdVeterinaire(long idVeterinaire) {
		this.idVeterinaire = idVeterinaire;
	}
	public Date getDateConsultation() {
		return dateConsultation;
	}
	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}
	public Double getTarif() {
		return tarif;
	}
	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}

	

}
