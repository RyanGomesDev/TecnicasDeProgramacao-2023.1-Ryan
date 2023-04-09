import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		System.out.println("<Maior Número Primo>\n");
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int Número = sc.nextInt();
		
        int MaiorPrimo = 0;
        int Candidato = Número - 1;
        
        while (Candidato > 1) {
            boolean EhPrimo = true;
            
            for (int i = 2; i <= Math.sqrt(Candidato); i++) {
            	
                if (Candidato % i == 0) {
                    EhPrimo = false;
                    break;
                }
                
            }
            
            if (EhPrimo) {
                MaiorPrimo = Candidato;
                break;
            }
            
            Candidato--;
        }
        
        if (MaiorPrimo > 0) {
            System.out.println("\nO maior número primo menor do que " + Número + " é " + MaiorPrimo + "!");
        } else {
            System.out.println("\nNão existe nenhum número primo menor do que " + Número + "!");
        }
        
	}

}
