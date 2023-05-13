package exerc06;

public class IngressoVIP extends Ingresso{
	
	private double ValorNormal;
	private double ValorAdicional;
	
	public IngressoVIP(double valor, double valorAdicional) {
		super(valor);
		ValorNormal = valor;
		ValorAdicional = valorAdicional;
	}

	public String toString() {
		return "O valor do Ingresso VIP é R$" + (ValorNormal + ValorAdicional);
	}

	
	public double getValorNormal() {
		return ValorNormal;
	}
	

	public void setValorNormal(double valorNormal) {
		ValorNormal = valorNormal;
	}
	

	public double getValorAdicional() {
		return ValorAdicional;
	}
	

	public void setValorAdicional(double valorAdicional) {
		ValorAdicional = valorAdicional;
	}
	
	public double getValorTotal() {
		return (ValorNormal + ValorAdicional);
	}
}
