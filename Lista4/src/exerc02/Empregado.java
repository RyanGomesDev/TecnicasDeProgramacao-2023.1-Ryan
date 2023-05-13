package exerc02;

public class Empregado {
	
	public String Nome;
	public String Sobrenome;
	public double Salario;
	
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		if(salario < 0) {
			Salario = 0.0;
		} else {
			Salario = salario;
		}
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
}
