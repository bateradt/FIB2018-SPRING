package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.DB.HibernateFactory;
import br.aula.model.Autor;
import br.aula.model.Livro;

public class IncluindoLivro {

	public static void main(String[] args) {		
//		Configuration configuration = new Configuration();
//	    configuration.configure("hibernate.cfg.xml");
//	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//      Session s = sessionFactory.openSession();
	
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		/*Autor autor = (Autor) s.get(Autor.class, 4l);

		Livro livro = new Livro();
		livro.setFoto("livro1.jpg");
		livro.setQuantidade(3);
		livro.setTitulo("Sistemas Distribuidos");
		livro.setAutor(autor);

		Transaction t = s.beginTransaction();
		s.save(livro);
		t.commit();*/
		
		Autor autor = new Autor();
		autor.setNome("JRR Tolkien");
		
		Livro livro = new Livro();
		livro.setFoto("livro1.jpg");
		livro.setQuantidade(3);
		livro.setTitulo("Senhor dos Aneis");
		livro.setAutor(autor);
		
		Transaction t = s.beginTransaction();
		s.save(livro);
		t.commit();
		
	}
}