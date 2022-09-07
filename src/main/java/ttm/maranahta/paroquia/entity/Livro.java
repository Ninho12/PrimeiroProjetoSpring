package ttm.maranahta.paroquia.entity;



public class Livro {

	private Long isbn;

	private String titulo;

	private Integer edicao;

	private String autor;


	public Livro(Long isbn, String titulo, Integer edicao, String autor) {
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.autor = autor;
		
	}
	
	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
}
