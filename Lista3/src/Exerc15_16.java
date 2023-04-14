
public class Exerc15_16 {
	
	public static boolean verificarPalindromo(String Palavra) {
		
		int Validar = 0;
		int Tam = Palavra.length();
		char Maior;
		char Menor;
		
		for (int i = 0; i < Tam; i++) {

			Maior = Palavra.charAt((Tam-1) - i);
			Menor = Palavra.charAt(i);

			if(Maior == Menor) {

			} else {
				Validar++;
			}
		}
		
		if(Validar == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean verificarPrimo(int Numero) {

		int Validar = Numero;

		for (int i = 2; i < 10; i++) {

			if(i == Numero) {

			} else if((Numero % i) == 0) {
				Validar++;
			}

		}

		if(Validar == Numero) {
			return true;
		} else {
			return false;
		}

	}
	
	public static void main(String[] args) {
		
		String Expressao = "AnA";
		int Numero = 7;
		
		System.out.println("<Verificação de Palíndromo e Verificação de Número Primo>\n");
		System.out.println("--> Palíndromo <--\n");
		
		if(verificarPalindromo(Expressao)) {
			System.out.println("A expressão '" + Expressao + "' é um palíndromo, ou seja, pode ser lida da mesma forma de trás para frente!\n");
		} else {
			System.out.println("A expressão '" + Expressao + "' não é um palíndromo!\n");
		}
		
		System.out.println("--> Número Primo <--\n");
		
		if(verificarPrimo(Numero)) {
			System.out.println("O número " + Numero + " é primo!");
		} else {
			System.out.println("O número " + Numero + " não é primo!");
		}
	}

}
