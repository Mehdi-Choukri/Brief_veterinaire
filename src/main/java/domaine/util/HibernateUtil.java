package domaine.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import domaine.model.Animal;
import domaine.model.Client;
import domaine.model.RDV;
import domaine.model.Secretaire;
import domaine.model.Utilisateur;
import domaine.model.Veterinaire;

 

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null)
		{
			try {
				Configuration configuration = new Configuration();
				Properties settings = new Properties();	
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5555/DB_brief_veterinaire");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				 settings.put(Environment.HBM2DDL_AUTO, "update");
				 configuration.setProperties(settings);
				 configuration.addAnnotatedClass(Utilisateur.class);
				// configuration.addAnnotatedClass(Client.class);
				 //configuration.addAnnotatedClass(Secretaire.class);
				// configuration.addAnnotatedClass(Veterinaire.class);
				 configuration.addAnnotatedClass(RDV.class);
			 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}catch(Exception e)
			{
				e.printStackTrace();
				
			}
			
			
			
		}
		return sessionFactory;
	}
	
	
	

}
