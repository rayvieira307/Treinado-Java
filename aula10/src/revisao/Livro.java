package revisao;

public class Livro {

	private String titulo;
	private String autor;
	private double preco;

	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro: " + titulo + ", Autor" + autor + ", preco" + preco + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

}
