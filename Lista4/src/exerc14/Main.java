package exerc14;

public class Main {

	public static void main(String[] args) {
		
		Pessoa Albert = new Pessoa("Albert Einstein", 14, 3, 1879);
		Pessoa Isaac = new Pessoa("Isaac Newton", 4, 1, 1643);
		
		Albert.CalcularIdade(6, 5, 2023);
		Isaac.CalcularIdade(6, 5, 2023);
		
		System.out.println(Albert.InformarNome());
		System.out.println(Albert.InformarIdade() + " anos!\n");
		System.out.println(Isaac.InformarNome());
		System.out.println(Isaac.InformarIdade() + " anos!");
	}

}
