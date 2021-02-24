package domaine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "utilisateur")

public class Utilisateur {
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", password="
				+ password + ", salt=" + salt + ", nivDroit=" + nivDroit + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "mail")
	private String mail;
	@Column(name = "password")
	private String password;
	@Column(name = "salt")
	private String salt;
	@Column(name = "nivDroit")
	private int nivDroit;
	
	
	
	public Utilisateur(String nom, String prenom, String mail, String password,String salt, int nivDroit) {
 
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
		this.salt = salt;
		this.nivDroit = nivDroit;
	}
	
	
	public Utilisateur() {
	 
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		 
		this.password = password;
	}
	public int getNivDroit() {
		return nivDroit;
	}
	public void setNivDroit(int nivDroit) {
		this.nivDroit = nivDroit;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	public String getSalt() {
		return salt;
	}


	public void setSalt(String salt) {
		this.salt = salt;
	}

}
