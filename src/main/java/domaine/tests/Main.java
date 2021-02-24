package domaine.tests;

import java.text.ParseException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.BasicConfigurator;

import domaine.service.SUtilisateur;

public class Main {

	public static void main(String[] args) throws ParseException {

		BasicConfigurator.configure();

		/*
		SUtilisateur SU = new SUtilisateur();
		System.out.println( SU.checkEmailUtilisateur("med@gmail.com"));
		*/
		/*
		UtilisateurDao UD = new UtilisateurDao();
		Utilisateur u = new Utilisateur("Choukri", "med elmehdi", "med@gmail.com", "testtest", "12232323", 0);
		
		UD.saveUtilisateur(u);
 
	
		*/
		 
		
		 
		
		//ystem.out.println(SU.login("med@gmaiL.com", "123456").toString());
		String host="smtp.googlemail.com";  
		  final String user="Brief.Veterinaire@gmail.com";//change accordingly  
		  final String password="thisbriefisgood108";//change accordingly  
		    
		  String to="xxmehdixx95@live.fr";//change accordingly  
		  
		   //Get the session object  
		   Properties props = new Properties();  
		   
		   props.put("mail.smtp.host",host);  
		   props.put("mail.smtp.auth", "true");  
		     
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject("Votre RDV chez le veterinaire !");  
		     message.setText("Voici un nouveau RDV a valider pour un client ");  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully...");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}  
		 }  
		

	

	public static void mailSender()
	{
		 
		String host="mail.javatpoint.com";  
		  final String user="Brief.Veterinaire@gmail.com";//change accordingly  
		  final String password="thisbriefisgood108";//change accordingly  
		    
		  String to="xxmehdixx95@live.fr";//change accordingly  
		  
		   //Get the session object  
		   Properties props = new Properties();  
		   
		   props.put("mail.smtp.host",host);  
		   props.put("mail.smtp.auth", "true");  
		     
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject("Votre RDV chez le veterinaire !");  
		     message.setText("Voici un nouveau RDV a valider pour un client ");  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully...");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}  
		 }  
	

}
