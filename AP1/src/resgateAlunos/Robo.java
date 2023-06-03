package resgateAlunos;

public abstract class Robo {
	
	private int Id;
	private String Nome;
	protected String Tipo;
	protected Plano Plano;
	protected int Pontuacao;
	
	// Construtor para inicializar a super classe Robo
	public Robo(int id, String nome, Plano plano) {
		this.Id = id;
		this.Nome = nome;
		this.Plano = plano;
		Pontuacao = 0;
	}
	
	public void avancar(int Direcao) {
		
	}
	
	public void retroceder(int Direcao) {
		
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public int getPontuacao() {
		return Pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		Pontuacao = pontuacao;
	}
}
