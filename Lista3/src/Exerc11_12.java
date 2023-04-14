
public class Exerc11_12 {
	
	public static int potenciar(int Base, int Expoente) {
		
		int Potencia = 1;
		
		for (int i = 0; i < Expoente; i++) {
			Potencia = Potencia * Base;
		}
		
		return Potencia;
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
		
		int Base = 2;
		int Expoente = 6;
		int Primo = 14;
		
		System.out.println("<Potenciação e Número Primo>\n");
		System.out.println("--> Potenciação <--\n");
		System.out.println(Base + "^" + Expoente + " = " + potenciar(Base, Expoente) + "!\n");
		
		System.out.println("--> Número Primo <--\n");
		
		if(verificarPrimo(Primo)) {
			System.out.println("O número " + Primo + " é primo!");
		} else {
			System.out.println("O número " + Primo + " não é primo!");
		}
		
	}

}
