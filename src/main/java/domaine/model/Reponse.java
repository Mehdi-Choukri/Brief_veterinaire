package domaine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "reponse")

public class Reponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	
	private long id;
	@Column(name = "reponse")
	private String reponse;
	@Column(name = "idRepondeur")
	private int idRepondeur;
	@Column(name = "date")
	private Date date;
	
	public Reponse( String reponse, int idRepondeur, Date date) {
 
		this.reponse = reponse;
		this.idRepondeur = idRepondeur;
		this.date = date;
	}
	public Reponse()
	{
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public int getIdRepondeur() {
		return idRepondeur;
	}
	public void setIdRepondeur(int idRepondeur) {
		this.idRepondeur = idRepondeur;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
