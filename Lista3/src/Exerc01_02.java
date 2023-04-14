
public class Exerc01_02 {
	
	public static int somatorio(int Vetor[]) {
		
		int Somatorio = 0;
		
		for (int i = 2; i < (Vetor.length-2); i++) {
			Somatorio = Somatorio + Vetor[i];
		}
		
		return(Somatorio);
	}
	
	public static float media(int Vetor1[], int Vetor2[]) {
		
		float Media = 0;
		float Soma = 0;
		
		for (int i = 0; i < Vetor1.length; i++) {
			Soma = Soma + (Vetor1[i] + Vetor2[i]);
		}
		
		Media = Soma/(Vetor1.length+Vetor2.length);
		
		return(Media);
	}
	
	public static void main(String[] args) {
		
		int Vetor1[] = new int[10]; // Vetor 1 = 1,2,3,4,5,6,7,8,9,10
		int Vetor2[] = new int[10]; // Vetor 2 = 11,12,13,14,15,16,17,18,19,10
		
		System.out.println("<Somatório e Média>\n");
		
		for (int i = 0; i < 10; i++) {
			Vetor1[i] = i+1;
			Vetor2[i] = i+11;
		}
		
		System.out.println("-> O Resultado do somatório do valores (*ignorando os 2 primeiros e os 2 últimos) do vetor é " + somatorio(Vetor1) + "!");
		System.out.println("-> O Resultado da média dos valores dos vetores é " + media(Vetor1, Vetor2) + "!");
	}

}
