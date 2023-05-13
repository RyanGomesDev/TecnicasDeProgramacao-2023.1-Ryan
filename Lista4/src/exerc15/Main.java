package exerc15;

public class Main {

	public static void main(String[] args) {
		
		Produto Pimenta = new Produto("Pimenta Verde", 1.5, 2.5, 0.5);
		
		Pimenta.CalcularMargem();
		
		System.out.println("O produto " + Pimenta.getNome() + " possui uma margem de " + Pimenta.getMargemLucro() + "%!");
	}

}
