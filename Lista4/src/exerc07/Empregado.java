package exerc07;

public class Empregado {
	
	protected String Nome;
	protected float Salario;
	
	public Empregado(String nome, float salario) {
        this.Nome = nome;
        this.Salario = salario;
    }
	
	public String toString() {
		return "O(A) empregado(a) " + Nome + " tem o salário de R$ " + Salario + "!";
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getSalario() {
		return Salario;
	}
	
	public void setSalario(float salario) {
		Salario = salario;
	}
}
