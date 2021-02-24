package domaine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table (name = "secretaire")

public class Secretaire extends Utilisateur{
	 
	@Column(name = "id")
	private long id;
	@Column(name = "dateEmbauche")
	private Date dateEmbauche;
	
	public Secretaire(String nom, String prenom, String mail, String password, String salt, int nivDroit, Date dateEmbauche) {
		super(nom, prenom, mail, password,salt,nivDroit);
		setDateEmbauche(dateEmbauche);
	}
	
	public Secretaire() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

}
