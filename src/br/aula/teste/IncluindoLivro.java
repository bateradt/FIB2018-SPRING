package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.DB.HibernateFactory;
import br.aula.model.Livro;

public class IncluindoLivro {

	public static void main(String[] args) {		
//		Configuration configuration = new Configuration();
//	    configuration.configure("hibernate.cfg.xml");
//	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//      Session s = sessionFactory.openSession();
	
		Session s = HibernateFactory.configureSessionFactory().openSession();

		Livro livro = new Livro();
		livro.setFoto("livro1.jpg");
		livro.setQuantidade(10);
		livro.setTitulo("Java - Como Programar - 10ª Ed. 2016");

		Transaction t = s.beginTransaction();
		s.save(livro);
		t.commit();
	}
}