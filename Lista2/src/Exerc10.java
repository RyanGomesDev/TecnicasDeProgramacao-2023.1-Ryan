import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		System.out.println("<Formas/Padrôes>\n");
		System.out.print("Digite o número de linhas e colunas: ");
		Scanner sc = new Scanner(System.in);
		int Tamanho = sc.nextInt();
		
		System.out.println("\nPadrão A:\n");
		for (int i = 0; i < Tamanho; i++) {
			
            for (int j = 0; j <= i; j++) {
            	
                System.out.print(j + " ");
                
            }
            System.out.println();
        }
		
		System.out.println("\nPadrão B:\n");
		for (int i = 2; i < Tamanho+2; i++) {
			
			if(i%2 == 0) {
				for (int j = 2; j < Tamanho+2; j++) {
           			
           			if(j%2 == 0) {
           				System.out.print("@ ");
           			} else {
           				System.out.print("* ");
           			}
           		}
			} else {
				for (int j = 2; j < Tamanho+2; j++) {
           			
           			if(j%2 == 0) {
           				System.out.print("* ");
           			} else {
           				System.out.print("@ ");
           			}
           			
           		}
			}
            System.out.println();
        }
		
		System.out.println("\nPadrão C:\n");
		for(int i = 0; i < Tamanho; i++) {
			
			int Inicio = 0;
			int Limite = Tamanho-1;
			
			for(int j = 0; j < Tamanho; j++) {
				
				if(i == (Tamanho-1)/2 || i == Tamanho/2 || j == (Tamanho-1)/2 || j == Tamanho/2) {
					System.out.print("@ ");
				} else if(i%2 == 0) {
					System.out.print(Limite + " ");
				} else {
					System.out.print(Inicio + " ");
				}
					
				if(i%2==0) {
					Limite--;
				} else {
					Inicio++;
				}
			}
			
			System.out.println();
		}
		
	}

}
