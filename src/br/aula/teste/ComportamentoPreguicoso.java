package br.aula.teste;

import java.util.List;

import org.hibernate.Session;

import br.aula.DB.HibernateFactory;
import br.aula.model.Autor;
import br.aula.model.Livro;

public class ComportamentoPreguicoso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Autor autor = (Autor) s.get(Autor.class, 4l);
		System.out.println(autor.getNome());
		
		List<Livro> livros = autor.getLivros();
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
		}

	}

}
