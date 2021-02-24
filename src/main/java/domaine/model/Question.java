package domaine.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "question")

public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "question")
	private String question;
	@Column(name = "idPoseur")
	private int idPoseur;
	@Column(name = "date")
	private Date date;
	
	
	public Question(long id, String question, int idPoseur, Date date) {
	 
		this.id = id;
		this.question = question;
		this.idPoseur = idPoseur;
		this.date = date;
	}
	public Question()
	{
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getIdPoseur() {
		return idPoseur;
	}
	public void setIdPoseur(int idPoseur) {
		this.idPoseur = idPoseur;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
