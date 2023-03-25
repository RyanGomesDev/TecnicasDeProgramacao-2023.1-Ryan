
public class Exerc12 {

	public static void main(String[] args) {
		// Exercício 12 - Lista 01 - Disciplina Técnicas de Programação - 2023.1
		// Estudante: Ryan Gomes Magalhães Lima
		// Matrícula: 538554
		
		int A = 11;
		int B = 9;
		int Validar = 0;
		
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação!!\n");
		
		if(A > 10) {
			System.out.println("A > 10!\n");
			Validar++;
		}
		
		if(A+B == 20) {
			System.out.print("A + B = 20!");
			Validar++;
		}
		
		if(Validar == 0) {
			System.out.println("Números não válidos!");
		}
		
	}

}
