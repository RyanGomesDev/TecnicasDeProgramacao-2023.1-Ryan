import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		int Matriz [][] = new int [3][3];
		int Cont = 1;
		int Validar = 0;
		
		System.out.println("<Matriz Simétrica>\n");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite o " + Cont + "° valor: ");
				Scanner sc = new Scanner(System.in);
				Matriz[i][j] = sc.nextInt();
				
				Cont++;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if(Matriz[i][j] != Matriz[j][i]) {
					
				} else {
					Validar++;
				}
				
			}
		}
		
		if(Validar == 9) {
			System.out.println("\nA matriz é simétrica!!\n");
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					
					System.out.print(Matriz[i][j] + " ");
					
				}
				System.out.print("\n");
			}
			
		} else {
			System.out.println("\nA matriz não é simétrica!!");
		}
		
	}

}
