import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		int Limite = 0;
		
		System.out.println("<Pares de Limites>\n");
		System.out.print("Digite o valor do limite superior: ");
		Scanner sc = new Scanner(System.in);
		Limite = sc.nextInt();
		System.out.print("\n");
		
		for (int i = 0; i <= Limite; i++) {
			for (int j = 0; j <= Limite; j++) {
				
				System.out.println(i + " - " + j);
				
			}
		}
		
	}

}
