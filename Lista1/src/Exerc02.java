
public class Exerc02 {

	public static void main(String[] args) {
		// Exercício 02 - Lista 01 - Disciplina Técnicas de Programação - 2023.1
		// Estudante: Ryan Gomes Magalhães Lima
		// Matrícula: 538554

		int A = 11;
		int B = 12;
		int Validar = 0;
		
		if(A < 10) {
			System.out.println("A < 10!\n");
		}else {
			Validar++;
		}
			
		if((A+B) == 20) {
			System.out.println("A + B = 20!");
		} else {
			Validar++;
		}
		
		if(Validar == 2) {
			System.out.println("Número não válido!");
		}
		
	}

}
