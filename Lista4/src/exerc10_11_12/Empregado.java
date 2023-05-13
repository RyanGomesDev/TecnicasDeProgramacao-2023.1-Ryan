package exerc10_11_12;

public class Empregado extends Pessoa{
	
	private int CodigoSetor;
	private double SalarioBase;
	private double Imposto;
	
	public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, telefone);
		CodigoSetor = codigoSetor;
		SalarioBase = salarioBase;
		Imposto = imposto;
	}

	public double calcularSalario() {
		return (SalarioBase - Imposto);
	}
	
	public int getCodigoSetor() {
		return CodigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		CodigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return SalarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}
	
	public double getImposto() {
		return Imposto;
	}
	
	public void setImposto(double imposto) {
		Imposto = imposto;
	}
}
