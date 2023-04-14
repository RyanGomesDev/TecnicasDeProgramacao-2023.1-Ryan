import java.util.ArrayList;
import java.util.Scanner;

public class Exerc03_04 {
	
	public static float mediaPonderada(ArrayList<Integer> Notas, ArrayList<Integer> Pesos, int Tam) {
		
		float MediaPond = 0;
		float Multi = 0;
		float SomaPesos = 0;
		
		for (int i = 0; i < Tam; i++) {
			Multi = Multi + (Notas.get(i) * Pesos.get(i));
			SomaPesos = SomaPesos + Pesos.get(i);
		}
		
		MediaPond = Multi/SomaPesos;
		
		return(MediaPond);
	}
	
	public static int contagem(ArrayList<Integer> PriVetor, ArrayList<Integer> SegVetor, int Elemento, int Tam) {
		
		int Contagem = 0;
		
		for (int i = 0; i < Tam; i++) {
			
			if(PriVetor.get(i) == Elemento) {
				Contagem++;
			}
			if(SegVetor.get(i) == Elemento) {
				Contagem++;
			}
			
		}
		
		return(Contagem);
	}
	
	public static void main(String[] args) {
		
		int i = -1;
		int j = -1;
		int Aux = 0;
		int Elemento = 0;
		ArrayList<Integer> Notas = new ArrayList<Integer>();
		ArrayList<Integer> Pesos = new ArrayList<Integer>();
		ArrayList<Integer> PriVetor = new ArrayList<Integer>();
		ArrayList<Integer> SegVetor = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<Média Ponderada e Contagem>\n");
		System.out.println("--> Média Ponderada <--\n");
		
		do {
			i++;
			
			System.out.print("Digite da " + (i+1) + "ª nota ou digite um valor menor que zero para parar: ");
			Aux = sc.nextInt();
			Notas.add(Aux);
			
			System.out.print("Digite o peso da " + (i+1) + "ª nota ou digite '0' para parar: ");
			Aux = sc.nextInt();
			Pesos.add(Aux);
			
			System.out.println();
		} while(Notas.get(i) >= 0 && Pesos.get(i) > 0);
		
		System.out.println("--> Contagem de Elementos <--\n");
		
		do {
			j++;
			
			System.out.print("Digite o Valor " + (j+1) + " do Primeiro Vetor ou digite '0' para parar: ");
			Aux = sc.nextInt();
			PriVetor.add(Aux);
			
			System.out.print("Digite o Valor " + (j+1) + " do Segundo Vetor ou digite '0' para parar: ");
			Aux = sc.nextInt();
			SegVetor.add(Aux);
			
			System.out.println();
		} while(PriVetor.get(j) != 0 && SegVetor.get(j) != 0);
		
		System.out.print("Digite o número que você deseja saber quantos tem no total dos valores: ");
		Elemento = sc.nextInt();
		
		System.out.format("\n-> A média ponderada das notas com seus, respectivos, pesos é %.2f!", mediaPonderada(Notas, Pesos, i));
		System.out.println("\n-> O número de vezes que o " + Elemento + " apareceu no total de valores foi " + contagem(PriVetor, SegVetor, Elemento, j) + "!");
		sc.close();
	}

}
