package domaine.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domaine.model.Client;

import domaine.util.HibernateUtil;

public class ClientDao {
	

	public void saveClient(Client client)
	{
		 Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(client);
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
	public void updateClient(Client client)
	{
		 Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.saveOrUpdate(client);
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
	public Client getClientById(long id)
	{
		 Transaction transaction = null;
		 Client client = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			client = session.get(Client.class, id);
			
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
		return client;
	}
	
	@SuppressWarnings("unchecked")
	public List<Client> getAllClients()
	{
		 Transaction transaction = null;
		 List<Client> clients = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			 clients = session.createQuery("from Client").list();
			
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
		return clients;
	}
	
	public void deleteClient(long id)
	{
		 Transaction transaction = null;
		 Client client = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			 client = session.get(Client.class, id);
			 
			 session.delete(client);
			
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
