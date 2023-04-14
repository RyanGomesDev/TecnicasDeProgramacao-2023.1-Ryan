import java.util.ArrayList;
import java.util.Arrays;

public class Exerc13_14 {
	
	public static ArrayList<Integer> unirVetores(int[] Vetor1, int[] Vetor2) {
		
		ArrayList<Integer> JuntarVetores = new ArrayList<Integer>();
		
		for (int i = 0; i < Vetor1.length; i++) {
			JuntarVetores.add(Vetor1[i]);
		}
		
		for (int i = 0; i < Vetor2.length; i++) {
			JuntarVetores.add(Vetor2[i]);
		}
		
		return JuntarVetores;
	}
	
	public static ArrayList<Integer> removerElemento(int[] Vetor, int Elemento) {
		
		int Aux = 0;
		ArrayList<Integer> VetorNovo = new ArrayList<Integer>();
		
		for (int i = 0; i < Vetor.length; i++) {
			
			if(Vetor[i] == Elemento) {
				
			} else {
				Aux = Vetor[i];
				VetorNovo.add(Aux);
			}
			
		}
		
		return (VetorNovo);
	}
	
	public static void main(String[] args) {
		
		int Vetor1[] = {1,2,3,4,5,6};
		int Vetor2[] = {7,8,9,10,11,12};
		int Elemento = 2;
		ArrayList<Integer> VetorTotal = new ArrayList<Integer>();
		ArrayList<Integer> VetorSemElem = new ArrayList<Integer>();
		
		System.out.println("<Junção de Dois Vetores e Remoção de Um Elemento do Vetor>\n");
		System.out.println("--> Junção de Dois Vetores <--\n");
		
		System.out.print(Arrays.toString(Vetor1) + " + " + Arrays.toString(Vetor2) + " = [");
		VetorTotal = unirVetores(Vetor1, Vetor2);
		
		for (int i = 0; i < (Vetor1.length + Vetor2.length); i++) {
			
			if((i + 1) == (Vetor1.length + Vetor2.length)) {
				System.out.print(VetorTotal.get(i));
			} else {
				System.out.print(VetorTotal.get(i) + ", ");
			}
			
		}
		
		System.out.println("]\n\n--> Remoçõa de Um Elemento <--\n");
		VetorSemElem = removerElemento(Vetor1, Elemento);
		System.out.print("O vetor " + Arrays.toString(Vetor1) + " sem o número " + Elemento + " fica:\n\nNovo Vetor = [");
		
		for (int i = 0; i < VetorSemElem.size(); i++) {
			
			if((i + 1) == (VetorSemElem.size())) {
				System.out.print(VetorSemElem.get(i));
			} else {
				System.out.print(VetorSemElem.get(i) + ", ");
			}
			
		}
		System.out.print("]");
	}

}
