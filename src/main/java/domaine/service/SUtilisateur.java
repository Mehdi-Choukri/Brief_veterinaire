package domaine.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domaine.model.Utilisateur;
import domaine.security.AES;
import domaine.util.HibernateUtil;

public class SUtilisateur {
	
	
	private Boolean userLoggenIn;
	
	public Utilisateur utilisateurLogged;
	
	public Boolean checkEmailUtilisateur(String email)
	{
		 Transaction transaction = null;
		 List<Utilisateur> utilisateurs = null;
		Boolean   res = false;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			utilisateurs = session.createQuery("from Utilisateur").list();
			System.out.println(utilisateurs);
			for (Utilisateur utilisateur : utilisateurs) {
				if(utilisateur.getMail().equals(email))
				{
					res = true;
					break;
				}
				
			}
			 
			 
			 
			
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
				e.printStackTrace();
			}
			
		}
		return res;
		 
	}
 
	public Utilisateur login(String email,String password)
	{
		 
		String hashedPassword = AES.encrypt(password, getSalt(email)) ;
		 Transaction transaction = null;
		 List<Utilisateur> utilisateurs = null;
		 Utilisateur utilisateurToReturn =null;
		 
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			utilisateurs = session.createQuery("from Utilisateur").list();
			for (Utilisateur utilisateur : utilisateurs) {
				if(utilisateur.getMail().equals(email) && utilisateur.getPassword().equals(hashedPassword))
				{
					utilisateurToReturn = utilisateur;
					setUserLoggenIn(true);
					utilisateurLogged = utilisateur;
					
				}
				
			}
			 
			 
			 
			
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
				e.printStackTrace();
			}
			
		}
		return utilisateurToReturn;
	
	}
		
		
 
	 
	public String getSalt(String email)
	{
		 Transaction transaction = null;
		 List<Utilisateur> utilisateurs = null;
		String   salt = "";
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			utilisateurs = session.createQuery("from Utilisateur").list();
			for (Utilisateur utilisateur : utilisateurs) {
				if(utilisateur.getMail().equals(email))
				{
					salt = utilisateur.getSalt();
				}
				
			}
			 
			 
			 
			
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
				e.printStackTrace();
			}
			
		}
		return salt;
	
	}

	public Boolean getUserLoggenIn() {
		return userLoggenIn;
	}

	public void setUserLoggenIn(Boolean userLoggenIn) {
		this.userLoggenIn = userLoggenIn;
	}

}
