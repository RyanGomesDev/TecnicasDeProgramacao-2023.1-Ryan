package exerc07;

public class Vendedor extends Empregado {
	
	private float Comissao;
	
	public Vendedor(String nome, float salario, float comissao) {
		super(nome, salario);
		this.Comissao = comissao;
	}
	
	public String toString() {
		return "O(A) empregado(a) " + Nome + " possui o salário de R$ " + Salario + " sem a comissão, já com a comissão de " + Comissao
				+ "% o salário final fica: R$ " + calcularSalario() + "!";
	}
	
	public float calcularSalario() {
		return Salario * (1 + Comissao/100);
	}

	public float getComissao() {
		return Comissao;
	}

	public void setComissao(float comissao) {
		Comissao = comissao;
	}
}
