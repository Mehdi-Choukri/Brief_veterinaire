package domaine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "animal")

public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "espece")
	private String espece;
	@Column(name = "race")
	private String race;
	@Column(name = "dateNaissance")
	private Date dateNaissance;
	@Column(name = "sexe")
	private String sexe;
	@Column(name = "idProprietaire")
	private int idProprietaire;
	
	
	
	public Animal( String espece, String race, Date dateNaissance, String sexe ,int idProprietaire) {
	 
		this.espece = espece;
		this.race = race;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.idProprietaire =  idProprietaire;
	}
	public Animal ()
	{
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getIdProprietaire() {
		return idProprietaire;
	}
	public void setIdProprietaire(int idProprietaire) {
		this.idProprietaire = idProprietaire;
	}
	
	

}
