package biblioteca;

public class Revista extends Publicacao {

	public Revista(String titulo, int ano, String autor, int quantidadeDisponivel, int id) {
		super(titulo, ano, autor, quantidadeDisponivel, id);
		this.tipo="Revista";
	}

}
