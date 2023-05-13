package exerc08;

public class ContaCorrente {
	protected double Saldo;

	public ContaCorrente(double saldo) {
		Saldo = saldo;
	}
	
	public String sacar(double saque) {
		
		if(Saldo >= saque) {
			double Aux = Saldo;
			Saldo = Saldo - saque;
			return "O saldo final depois do saque de R$ " + saque + " é de R$ " + (Aux - saque);
		} else {
			return "IMPOSSÍVEL DE REALIZAR O SAQUE DE R$ " + saque + "! O SALDO É DE R$ " + Saldo + "!";
		}
		
	}

	
	public double getSaldo() {
		return Saldo;
	}
	

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
}
