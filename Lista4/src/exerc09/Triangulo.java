package exerc09;

public class Triangulo extends Forma {
	
	public void CalcularArea(double base, double altura) {
		System.out.println("A área do Triângulo é " + ((base * altura) / 2) + "u!");
	}
	
	public void imprimirNome() {
		System.out.println("O nome dessa forma é Triângulo!");
	}
	
}
