package br.aula.teste;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.DB.HibernateFactory;
import br.aula.model.Emprestimo;
import br.aula.util.*;

public class IncluindoEmprestimo {

	public static void main(String[] args) {		
//		Configuration configuration = new Configuration();
//	    configuration.configure("hibernate.cfg.xml");
//	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//      Session s = sessionFactory.openSession();
	
		Session s = HibernateFactory.configureSessionFactory().openSession();

		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmprestimo(new Date());
		Util util = new Util();
		emprestimo.setDataDevolucao(util.somaData("07/04/2018", 10)); //new Date().);
		
		Transaction t = s.beginTransaction();
		s.save(emprestimo);
		t.commit();
	}
}