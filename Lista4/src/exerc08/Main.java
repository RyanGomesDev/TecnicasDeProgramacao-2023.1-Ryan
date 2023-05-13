package exerc08;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente Antonio = new ContaCorrente(500);
		ContaEspecial Mirelly = new ContaEspecial(1000, 200);
		
		System.out.println(Antonio.sacar(500));
		System.out.println(Mirelly.sacar(1150.50));
	}

}
