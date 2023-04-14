
public class Exerc09_10 {
	
	public static int menorKValor(int[] Vetor, int K) {
		
		int Copia[] = new int[Vetor.length];
		
		for (int i = 0; i < Vetor.length; i++) {
			Copia[i] = Vetor[i];
		}
		
		return Copia[-1 + K];
	}
	
	public static boolean verificarIgualdade(int[] Vetor1, int[] Vetor2) {
		
		int Validar = Vetor1.length;
		
		for (int i = 0; i < Vetor1.length; i++) {
			if(Vetor1[i] == Vetor2[i]) {
				Validar--;
			}
		}
		
		if(Validar == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int Vetor1[] = {1,2,3,4,5,6};
		int Vetor2[] = {1,2,3,4,7,6};
		int K = 3;
		
		System.out.println("<Menor K-ésimo Valor e Verificação de Igualdade>\n");
		System.out.println("--> Menor K-ésimo Valor <--\n");
		System.out.println("O " + K + "-ésimo menor valor do vetor é " + menorKValor(Vetor1, K) + "!\n");
		
		System.out.println("--> Verificação de Igualdade <--\n");
		
		if(verificarIgualdade(Vetor1, Vetor2)) {
			System.out.println("O vetor 1 é igual ao vetor 2!");
		} else {
			System.out.println("O vetor 1 não é igual ao vetor 2!");
		}
		
	}

}
