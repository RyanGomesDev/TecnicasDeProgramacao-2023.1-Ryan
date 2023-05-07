package biblioteca;

public class Livro extends Publicacao {

	public Livro(String titulo, int ano, String autor, int quantidadeDisponivel, int id) {
		super(titulo, ano, autor, quantidadeDisponivel, id);
		this.tipo="Livro";
	}

}
