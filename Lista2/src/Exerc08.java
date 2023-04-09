import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		char Expressão[] = new char[50];
		int Abertura = 0;
		int Fechamento = 0;
		
		System.out.println("<Expressão matemática bem formada>\n");
		System.out.println("Digite a expressão matemática símbolo por símbolo ou digite '.' para parar: ");
		
		for (int i = 0; i < 50; i++) {
			Scanner sc = new Scanner(System.in);
			Expressão[i] = sc.next().charAt(0);
			
			if(Expressão[i] == '.') {
				break;
			}
			if(Expressão[i] == '{' || Expressão[i] == '[' || Expressão[i] == '(') {
				Abertura++;
			}
			if(Expressão[i] == '}' || Expressão[i] == ']' || Expressão[i] == ')') {
				Fechamento++;
			}
			
		}
		
		if(Abertura == Fechamento) {
			System.out.println("\nEssa expressão matemática é bem formada!");
		} else {
			System.out.println("\nEssa expressão matemática não é bem formada!");
		}
		
	}

}
