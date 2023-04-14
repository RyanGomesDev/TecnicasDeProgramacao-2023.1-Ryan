import java.util.Arrays;

public class Exerc19_20 {
	
	public static boolean numeroPerfeito(int Num) {
		
		int Soma = 1;
		
		for (int i = 2; i <= Num; i++) {
			if(Soma == Num) {
				return true;
			}
			
			if((Num % i) == 0) {
				Soma = Soma + (Num / i);
			}
		}
		
		return false;
	}
	
	public static int[] diminuirVetor(int Tamanho) {
		
		int Vetor[] = new int[Tamanho];
		
		for (int i = 0; i < Vetor.length; i++) {
			Vetor[i] = i+1;
		}
		
		while(Vetor.length > 1) {
			
			int VetorAux[] = new int[Vetor.length-1];
			
			for (int i = 0; i < VetorAux.length; i++) {
				VetorAux[i] = i+1;
			}
			
			Vetor = VetorAux;
		}
		
		return Vetor;
	}
	
	public static void main(String[] args) {
		
		int Numero = 496;
		int TamVetor = 10;
		
		System.out.println("<Verificação Número Perfeito e Diminuição do Vetor>\n");
		System.out.println("--> Número Perfeito <--\n");
		
		if(numeroPerfeito(Numero)) {
			System.out.println("O valor " + Numero + " é um número perfeito!\n");
		} else {
			System.out.println("O valor " + Numero + " não é um número perfeito!\n");
		}
		
		System.out.println("--> Diminuição de Vetor <--\n");
		System.out.println("Seu novo vetor de tamanho " + diminuirVetor(TamVetor).length + " é " + Arrays.toString(diminuirVetor(TamVetor)) + "!");
	}

}
