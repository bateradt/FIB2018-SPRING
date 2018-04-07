package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.DB.HibernateFactory;
import br.aula.model.Autor;
import br.aula.model.Livro;

public class ListandoLivros {

	public static void main(String[] args) {		
//		Configuration configuration = new Configuration();
//	    configuration.configure("hibernate.cfg.xml");
//	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//      Session s = sessionFactory.openSession();
	
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Livro livro = (Livro) s.get(Livro.class, 1l);
		
		System.out.println(livro.getTitulo());
		System.out.println(livro.getAutor().getNome());

		Transaction t = s.beginTransaction();
		s.save(livro);
		t.commit();
	}
}