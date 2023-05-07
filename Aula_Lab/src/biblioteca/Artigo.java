package biblioteca;

public class Artigo extends Publicacao {

	public Artigo(String titulo, int ano, String autor, int quantidadeDisponivel, int id) {
		super(titulo, ano, autor, quantidadeDisponivel, id);
		this.tipo="Artigo";
		
	}
	
	
}
