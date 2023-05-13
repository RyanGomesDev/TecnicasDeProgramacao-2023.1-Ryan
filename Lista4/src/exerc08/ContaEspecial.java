package exerc08;

public class ContaEspecial extends ContaCorrente {
	
	private double Limite;

	public ContaEspecial(double saldo, double limite) {
		super(saldo);
		Limite = (-1)*limite;
	}
	
	public String sacar(double saque) {
		
		if((Saldo - saque) >= Limite) {
			Saldo = Saldo - saque;
			return "O saldo final depois do saque de R$ " + saque + " é de R$ " + Saldo;
		} else {
			return "IMPOSSÍVEL DE REALIZAR O SAQUE DE R$ " + saque + "! O SALDO JUNTO COM O LIMITE É DE R$ "
					+ (Saldo - Limite) + "!";
		}
		
	}
}
