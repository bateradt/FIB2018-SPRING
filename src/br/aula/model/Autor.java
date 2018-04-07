package br.aula.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTOR")
public class Autor {
	
	@Id
	@GeneratedValue
	@Column(name = "AUT_ID")
	private Long idAutor;
	
	@Column(name = "AUT_NOME", nullable = false, length = 45)
	private String Nome;
	
	@OneToMany(mappedBy = "autor")
	private List<Livro> livros = new ArrayList<>();
	
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public Long getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

}
