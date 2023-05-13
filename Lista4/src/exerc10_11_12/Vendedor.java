package exerc10_11_12;

public class Vendedor extends Empregado{
	
	private double ValorVendas;
    private double Comissao;
    
	public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao) {
		super(nome, telefone, codigoSetor, salarioBase, imposto);
		ValorVendas = valorVendas;
		Comissao = comissao;
	}
	
	public double calcularSalario() {
		double Salario = super.calcularSalario();
        Salario = Salario + (ValorVendas * (Comissao / 100));
        return Salario;
	}

	public double getValorVendas() {
		return ValorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		ValorVendas = valorVendas;
	}
	
	public double getComissao() {
		return Comissao;
	}
	
	public void setComissao(double comissao) {
		Comissao = comissao;
	}
}
