package biblioteca;

public abstract class Publicacao {

	protected String titulo;
	protected int ano;
	protected String autor;
	protected int quantidadeDisponivel;
	protected String tipo;
	protected int id;
	
	public Publicacao(String titulo, int ano, String autor, int quantidadeDisponivel, int id) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.id = id;
	}
	
	
	
}
