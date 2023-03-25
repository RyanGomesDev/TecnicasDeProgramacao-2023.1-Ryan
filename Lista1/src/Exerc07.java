
public class Exerc07 {

	public static void main(String[] args) {
		// Exercício 07 - Lista 01 - Disciplina Técnicas de Programação - 2023.1
		// Estudante: Ryan Gomes Magalhães Lima
		// Matrícula: 538554
		
		int A = 12;
		int B = 12;
		int Validar = 0;
		
		if(A > 10) {
			Validar = Validar+2;
		}
		
		if(A+B == 20) {
			Validar++;
		}
		
		switch(Validar) {
			case 1:
				System.out.println("Número não válido!");
				break;
			case 2:
				break;
			case 3:
				System.out.println("Números válidos!");
				break;
		}
		
	}

}
