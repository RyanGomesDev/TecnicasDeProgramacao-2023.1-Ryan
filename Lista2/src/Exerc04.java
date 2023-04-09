import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		int Valor = 0;
		int Cont = 0;
		
		System.out.println("<Tabela de Multiplicação>\n");
		System.out.print("Digite qual o número da tabela: ");
		Scanner entrada = new Scanner(System.in);
		Valor = entrada.nextInt();
		System.out.print("\n");
		
		while(Cont <= 10) {
			System.out.format("%d * %02d = %02d\n", Valor, Cont, (Valor*Cont));
			
			Cont++;
		}
		
	}

}
