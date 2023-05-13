package exerc09;

public class Main {

	public static void main(String[] args) {
		
		Circulo C = new Circulo();
		Retangulo R = new Retangulo();
		Quadrado Q = new Quadrado();
		Triangulo T = new Triangulo();
		
		C.imprimirNome();
		C.CalcularArea(50);
		System.out.println("--------------------------------");
		R.imprimirNome();
		R.CalcularArea(15, 31);
		System.out.println("--------------------------------");
		Q.imprimirNome();
		Q.CalcularArea(20);
		System.out.println("--------------------------------");
		T.imprimirNome();
		T.CalcularArea(3, 4);
	}

}
