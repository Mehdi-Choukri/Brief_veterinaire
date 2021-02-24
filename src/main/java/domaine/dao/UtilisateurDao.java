package domaine.dao;

 

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domaine.model.Utilisateur;
import domaine.util.HibernateUtil;

public class UtilisateurDao {
	
	
	public void saveUtilisateur(Utilisateur utilisateur)
	{
		 Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(utilisateur);
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
	}
	public void updateUtilisateur(Utilisateur utilisateur)
	{
		 Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.saveOrUpdate(utilisateur);
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
	}
	public Utilisateur getUtilisateurById(long id)
	{
		 Transaction transaction = null;
		 Utilisateur utilisateur = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			 utilisateur = session.get(Utilisateur.class, id);
			
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
		return utilisateur;
	}
	
	@SuppressWarnings("unchecked")
	public List<Utilisateur> getAllUtilisateurs()
	{
		 Transaction transaction = null;
		 List<Utilisateur> utilisateurs = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			 utilisateurs = session.createQuery("from Utilisateur").list();
			
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
		return utilisateurs;
	}
	
	public void deleteUtilisateur(long id)
	{
		 Transaction transaction = null;
		 Utilisateur utilisateur = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			 utilisateur = session.get(Utilisateur.class, id);
			 
			 session.delete(utilisateur);
			
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
		 
	}

}
