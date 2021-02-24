package domaine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
 
import javax.persistence.Table;

@Entity
@Table (name = "client")

public class Client extends Utilisateur {
	
	 
	@Column(name = "id")
	private long id;
	@Column(name = "dateInscription")
	private Date dateInscription;
	
	
	public Client(String nom, String prenom, String mail, String password,String salt, int nivDroit ,Date dateInscription) {
		super(nom, prenom, mail, password,salt,nivDroit);
		setDateInscription(dateInscription);
 
	}
	
	public Client( ) {
	 
	}
	public Client(int id ,Date dateInscription) {
		setId(id);
		setDateInscription(dateInscription);
		 
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

 
	
	

}
