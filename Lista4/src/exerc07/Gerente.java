package exerc07;

public class Gerente extends Empregado {
	
	private String Departamento;
	
	public Gerente(String nome, float salario, String departamento) {
		super(nome, salario);
		Departamento = departamento;
	}
	
	public String toString() {
		return "O(A) gerente " + Nome + " do departamento " + Departamento + " tem o salário de R$ " + Salario + "!";
	}
	
	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
}
