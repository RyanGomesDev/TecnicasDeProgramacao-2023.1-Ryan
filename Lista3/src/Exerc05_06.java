import java.util.Arrays;

public class Exerc05_06 {
	
	public static int[] copia(int[] Vetor) {
		
		int Copia[] = new int[Vetor.length];
		
		for (int i = 0; i < Copia.length; i++) {
			Copia[i] = Vetor[i];
		}
		
		return(Copia);
	}
	
	public static int[] ordenarVetor(int Vetor[]) {
		Arrays.sort(Vetor);
		return(Vetor);
	}
	
	public static void main(String[] args) {
		
		int PriVetor[] = new int[10]; // Vetor = 1,2,3,4,5,6,7,8,9,10
		int SegVetor[] = new int[10];
		int VetorDesordenado[] = {5, 2, 9, 1, 7};
		
		
		System.out.println("<Cópia de Vetor e Ordenação Crescente>\n");
		System.out.print("--> Cópia do Vetor <--\n\nVetor = ");
		
		for (int i = 0; i < PriVetor.length; i++) {
			PriVetor[i] = i+1;
			System.out.print(PriVetor[i] + " ");
		}
		
		SegVetor = copia(PriVetor);
		System.out.print("\nCópia = ");
		
		for (int i = 0; i < SegVetor.length; i++) {
			System.out.print(SegVetor[i] + " ");
		}
		
		System.out.println("\n\n--> Ordenação Crescente <--\n");
		System.out.println("Vetor Desordenado[] = " + Arrays.toString(VetorDesordenado));
		int VetorOrdenado[] = ordenarVetor(VetorDesordenado);
		System.out.println("Vetor Ordenado[] = " + Arrays.toString(VetorOrdenado));
	}

}
