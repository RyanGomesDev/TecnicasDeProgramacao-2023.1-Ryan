package biblioteca;

public abstract class Cliente implements ValidacaoEmprestimo{

	protected  int matricula;
	protected String nome;
	protected float tps;
	protected String tipo;
	protected int quantidade;
	
	public Cliente(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.tps=0;
	}
	
	
}
