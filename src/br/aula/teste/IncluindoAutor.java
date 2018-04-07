package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.DB.HibernateFactory;
import br.aula.model.Autor;

public class IncluindoAutor {

	public static void main(String[] args) {		
//		Configuration configuration = new Configuration();
//	    configuration.configure("hibernate.cfg.xml");
//	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//      Session s = sessionFactory.openSession();
	
		Session s = HibernateFactory.configureSessionFactory().openSession();

		Autor autor = new Autor();
		autor.setNome("Deitel Pearson");

		Transaction t = s.beginTransaction();
		s.save(autor);
		t.commit();
		
		Autor autorA = new Autor();
		autorA.setNome("Pressman");

		Transaction ta = s.beginTransaction();
		s.save(autorA);
		ta.commit();
		
		Autor autorB = new Autor();
		autorB.setNome("Paulo Coelho");

		Transaction tb = s.beginTransaction();
		s.save(autorB);
		tb.commit();
	}
}