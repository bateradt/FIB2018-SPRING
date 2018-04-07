package br.aula.teste;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.aula.DB.HibernateFactory;
import br.aula.model.Livro;

public class ListandoOsLivros {
	
	public static void main(String[] args) {
		
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Query q = s.createQuery("from Livro l where l.autor.idAutor = :id ");
		q.setLong("id", 4l);
		List<Livro> livros = q.list();
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " : " + livro.getAutor().getNome());
		}
		
	}

}
