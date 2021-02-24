package domaine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
 
import javax.persistence.Table;

@Entity
@Table (name = "QR")

public class QR {
	 
	@Column(name = "idQuestion")
	
	private long idQuestion;
	@Column(name = "idReponse")
	private long idReponse;
	
	
	public QR(long idQuestion, long idReponse) {
		 
		this.idQuestion = idQuestion;
		this.idReponse = idReponse;
	}
	
	
	public QR() {
		 
	}


	public long getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(long idQuestion) {
		this.idQuestion = idQuestion;
	}
	public long getIdReponse() {
		return idReponse;
	}
	public void setIdReponse(long idReponse) {
		this.idReponse = idReponse;
	}
	

}
