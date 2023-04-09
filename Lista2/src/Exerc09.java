
public class Exerc09 {

	public static void main(String[] args) {
		
		String Conjunto = "FABO";
		String ConjuntoAux = Conjunto;
		int Tamanho = Conjunto.length();
		int QuantPermutacoes = 1;
		
		System.out.println("<Permutações de um Conjunto>\n");
		
		for(int i = Tamanho; i>0; i--) {
			QuantPermutacoes *= i;
		}
		
		char Caracteres[] = new char[Tamanho];
		
		for(int i=0;i<Tamanho;i++) {
			Caracteres[i] = Conjunto.charAt(i);
		}
	
		String Permutacoes[] = new String[QuantPermutacoes];
		
		int Posicao = 0;
		
		for(int h = 0; h < Tamanho; h++) {
		
			for(int i = 0; i < Tamanho; i++) {
				
				char Aux;
				
				for(int j = i+1; j < Tamanho; j++) {
					
					Aux = Caracteres[i];
					Caracteres[i] = Caracteres[j];
					Caracteres[j] = Aux;
					Permutacoes[Posicao++] = new String(Caracteres);
					Caracteres[j] = Caracteres[i];
					Caracteres[i] = Aux;
					
				}
			}
			
			if(h == Tamanho-1 || Posicao == QuantPermutacoes) {
				break;
			}
				
			if(h == Tamanho-2) {
				
				int cont = 0;
				
				for(int i = Tamanho-1; i >= 0; i--) {
					Caracteres[cont++] = ConjuntoAux.charAt(i);
				}
				
			}else {
				
				Conjunto = Conjunto.charAt(h+1) + Conjunto.substring(0,h+1) + Conjunto.substring(h+2); 
				for(int i = 0; i < Tamanho; i++) {
					Caracteres[i] = Conjunto.charAt(i);
				}
			}
		
		}
		
		
		for(String Permutacao : Permutacoes) {
			System.out.println(Permutacao);
		}
			
	}

}
