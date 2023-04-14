import java.util.Arrays;

public class Exerc07_08 {
	
	public static boolean verificarOrdem(int[] Vetor) {
		
		int Aux[] = new int[Vetor.length];
		int Validar = Vetor.length;
		
		for (int i = 0; i < Vetor.length; i++) {
			Aux[i] = Vetor[i];
		}
		
		Arrays.sort(Aux);
		
		for (int i = 0; i < Vetor.length; i++) {
			
			if(Aux[i] == Vetor[i]) {
				Validar--;
			}
			
		}
		
		if(Validar == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static int maiorKValor(int[] Vetor, int K) {
		
		int Copia[] = new int[Vetor.length];
		
		for (int i = 0; i < Vetor.length; i++) {
			Copia[i] = Vetor[i];
		}
		
		return Copia[Copia.length - K];
	}
	
	public static void main(String[] args) {
		
		int Vetor[] = {1,2,3,4,5,6};
		int K = 1;
		
		System.out.println("<Verificação de Ordenação e Maior K-ésimo Valor>\n");
		System.out.println("--> Verificar de Ordenação <--\n");
		
		if(verificarOrdem(Vetor)) {
			System.out.println("O vetor é ordenado!\n");
		}else {
			System.out.println("O vetor não é ordenado!\n");
		}
		
		System.out.println("--> Maior K-ésimo Valor <--\n");
		System.out.println("O " + K + "-ésimo maior valor do vetor é " + maiorKValor(Vetor, K) + "!");
		
	}

}
