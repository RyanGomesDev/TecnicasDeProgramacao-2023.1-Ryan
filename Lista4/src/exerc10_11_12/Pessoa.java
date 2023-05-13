package exerc10_11_12;

public class Pessoa {
	
	private String Nome;
	private String Telefone;
	
	public Pessoa(String nome, String numero) {
		Nome = nome;
		Telefone = numero;
	}

	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
}
