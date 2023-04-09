import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		int ValorCerto = 81;
		int Número = 0;
		int Cont = 0;
		
		System.out.println("<Advinhe o número que está entre 1 e 100>\n");
		
		while(Número != ValorCerto) {
			System.out.print("Tentativa número " + (Cont+1) + ": ");
			Scanner entrada= new Scanner(System.in);
			Número = entrada.nextInt();
			
			if(Número < 1 || Número > 100) {
				System.out.print("\n--> Número inválido, digite um número entre 1 e 100!! <--");
			}
			if(Número > ValorCerto) {
				System.out.println("\n--> O número digitado é MAIOR do que o a ser advinhado. Tente de novo!!<--\n");
			}
			if(Número < ValorCerto) {
				System.out.println("\n--> O número digitado é MENOR do que o a ser advinhado. Tente de novo!!<--\n");
			}
			
			Cont++;
		}
		
		System.out.println("\nNúmero Correto!! Parabéns!!");
		
	}

}
