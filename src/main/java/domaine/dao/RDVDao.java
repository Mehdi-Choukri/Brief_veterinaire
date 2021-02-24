package domaine.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domaine.model.RDV;
import domaine.util.HibernateUtil;

public class RDVDao {
	
	public void saveRDV(RDV rdv)
	{
		 Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(rdv);
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
	public void updateRDV(RDV rdv)
	{
		 Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.saveOrUpdate(rdv);
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
	public RDV getRDVById(long id)
	{
		 Transaction transaction = null;
		 RDV rdv = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			rdv = session.get(RDV.class, id);
			
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
		return rdv;
	}
	
	@SuppressWarnings("unchecked")
	public List<RDV> getAllRDVS()
	{
		 Transaction transaction = null;
		 List<RDV> RDVS = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			 RDVS = session.createQuery("from RDV").list();
			
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
		return RDVS;
	}
	
	public void deleteRDV(long id)
	{
		 Transaction transaction = null;
		 RDV rdv = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			 rdv = session.get(RDV.class, id);
			 
			 session.delete(rdv);
			
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
