package exerc07;

public class Main {

	public static void main(String[] args) {
		
		Gerente Claudio = new Gerente("Claudio Henrique", 2500, "Vendas");
		Vendedor Ana = new Vendedor("Ana Margarida", 1500, 9);
		
		System.out.println(Claudio.toString());
		System.out.println("----------------------------------------");
		System.out.println(Ana.toString());
	}

}
