package exerc10_11_12;

public class Operario extends Empregado {
	
	private double ValorProducao;
	private double Comissao;
	
	public Operario(String nome, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, telefone, codigoSetor, salarioBase, imposto);
		ValorProducao = valorProducao;
		Comissao = comissao;
	}
	
	public double calcularSalario() {
		double Salario = super.calcularSalario();
        Salario = Salario + (ValorProducao * (Comissao / 100.0));
        return Salario;
	}

	public double getValorProducao() {
		return ValorProducao;
	}

	public void setValorProducao(double valorProducao) {
		ValorProducao = valorProducao;
	}

	public double getComissao() {
		return Comissao;
	}

	public void setComissao(double comissao) {
		Comissao = comissao;
	}
}
