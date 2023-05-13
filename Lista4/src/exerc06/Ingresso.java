package exerc06;

public class Ingresso {
	
	private double Valor;
	public boolean Comprado = false;
	
	public Ingresso(double valor) {
		Valor = valor;
	}

	public String toString() {
		return "O valor do Ingresso Normal é R$" + Valor;
	}

	
	public double getValor() {
		return Valor;
	}
	

	public void setValor(double valor) {
		Valor = valor;
	}
}
