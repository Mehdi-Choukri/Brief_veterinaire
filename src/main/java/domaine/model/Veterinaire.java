package domaine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "veterinaire")
 

public class Veterinaire extends Utilisateur{
	@Column(name = "id")
	private long id;
	@Column(name = "telephone")
	private String telephone;
	
	public Veterinaire(String nom, String prenom, String mail, String password, String salt,int nivDroit, String telephone) {
		super(nom, prenom, mail, password,salt,nivDroit);
		setTelephone( telephone);
	}
	
	public Veterinaire()
	{}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	

}
