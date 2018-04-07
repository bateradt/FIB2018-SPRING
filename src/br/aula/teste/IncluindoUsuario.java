package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.DB.HibernateFactory;
import br.aula.model.Review;

public class IncluindoUsuario {

	public static void main(String[] args) {		
//		Configuration configuration = new Configuration();
//	    configuration.configure("hibernate.cfg.xml");
//	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//      Session s = sessionFactory.openSession();
	
		Session s = HibernateFactory.configureSessionFactory().openSession();

		Review review = new Review();
		review.setAvalidacao(9);
		review.setComentario("Teste teste");
				
		Transaction t = s.beginTransaction();
		s.save(review);
		t.commit();
	}
}