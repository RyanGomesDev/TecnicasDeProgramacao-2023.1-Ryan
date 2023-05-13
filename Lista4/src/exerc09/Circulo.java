package exerc09;

public class Circulo extends Forma {
	
	public void CalcularArea(double raio) {
		System.out.println("A área do Círculo é " + (3.14 * (raio*raio)) + "u!");
	}
	
	public void imprimirNome() {
		System.out.println("O nome dessa forma é Círculo!");
	}
	
}
