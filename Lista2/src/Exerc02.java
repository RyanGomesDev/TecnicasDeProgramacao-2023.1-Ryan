import java.util.ArrayList;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		int Auxiliar = 0;
		int Cont = 0;
		int Soma = 0;
		ArrayList<Integer> Valor = new ArrayList<Integer>();
		
		while(Auxiliar >= 0) {
			System.out.print("Digite o "+ (Cont+1) + "°  valor positivo à somar ou um valor negativo para sair: ");
			Scanner entrada= new Scanner(System.in);
			Auxiliar = entrada.nextInt();
			Valor.add(Auxiliar);
			
			Cont++;
		}
		
		for(int i=0; i < Cont-1; i++) {
			Soma = Soma + (Valor.get(i));
		}
		
		System.out.println("\nA soma dos valores positivos foi " + Soma + "!");
		
	}

}
