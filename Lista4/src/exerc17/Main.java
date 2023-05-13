package exerc17;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		JogoDaVelha Jogo = new JogoDaVelha();
		int EixoX = 0;
		int EixoY = 0;
		
		
		System.out.println("+–––––––––––––––+");
		System.out.println("| JOGO DA VELHA |");
		System.out.println("+–––––––––––––––+");
		
		do {
			
			Jogo.exibirGrade();
			
			System.out.println("+––––––––––––––––––+");
			System.out.println("| VEZ DO JOGADOR 1 |");
			System.out.println("+––––––––––––––––––+\n");
			
			System.out.println("A onde você deseja colocar o X?\n");
			System.out.print("Linha (eixo x): ");
			EixoX = sc.nextInt();
			EixoX = verificarEixo(EixoX);
			
			System.out.print("Coluna (eixo y): ");
			EixoY = sc.nextInt();
			EixoY = verificarEixo(EixoY);
			
			verificarEspaco1(Jogo, EixoX, EixoY);
			Jogo.Jogador1(EixoX, EixoY);
			Jogo.exibirGrade();
			
			if(Jogo.verificarVitoria() == 1) {
				
				System.out.println("+––––––––––––––––––––––––––––––+");
				System.out.println("| PARABÉNS! O JOGADOR 1 VENCEU!|");
				System.out.println("+––––––––––––––––––––––––––––––+");
				
			} else if(Jogo.verificarVitoria() == 3) {
				
				System.out.println("+––––––––––––––––––––––––+");
				System.out.println("| VELHA! NINGUÉM VENCEU! |");
				System.out.println("+––––––––––––––––––––––––+");
				
			}else {
				
				System.out.println("+––––––––––––––––––+");
				System.out.println("| VEZ DO JOGADOR 2 |");
				System.out.println("+––––––––––––––––––+\n");
				
				System.out.println("A onde você deseja colocar o O?\n");
				System.out.print("Linha (eixo x): ");
				EixoX = sc.nextInt();
				EixoX = verificarEixo(EixoX);
				
				System.out.print("Coluna (eixo y): ");
				EixoY = sc.nextInt();
				EixoY = verificarEixo(EixoY);
				
				verificarEspaco2(Jogo, EixoX, EixoY);
				Jogo.Jogador2(EixoX, EixoY);
				Jogo.exibirGrade();
				
				if(Jogo.verificarVitoria() == 2) {
					
					System.out.println("+––––––––––––––––––––––––––––––+");
					System.out.println("| PARABÉNS! O JOGADOR 2 VENCEU!|");
					System.out.println("+––––––––––––––––––––––––––––––+");
					
				}
				
			}
			
		} while(Jogo.verificarVitoria() == 0);
		
		sc.close();
	}
	
	public static int verificarEixo(int valor) {
		while(valor> 3 || valor < 1) {
			System.out.print("\nCOORDENADA INVÁLIDA! DIGITE UM VALOR CORRETO!\n\nNovo valor: ");
			valor = sc.nextInt();
			System.out.println();
		}
		return valor;
	}
	
	public static void verificarEspaco1(JogoDaVelha jogo, int x, int y) {
		
		while(jogo.Jogador1(x, y) == false) {
			System.out.println("\nJÁ TEM UM X/O NAQUELE ESPAÇO! ESCOLHA UM LOCAL QUE ESTEJA VAZIO!");
			System.out.print("Linha (eixo x): ");
			x = sc.nextInt();
			x = verificarEixo(x);
			
			System.out.print("Coluna (eixo y): ");
			y = sc.nextInt();
			y = verificarEixo(y);
		}
	}
	
	public static void verificarEspaco2(JogoDaVelha jogo, int x, int y) {
		
		while(jogo.Jogador2(x, y) == false) {
			System.out.println("\nJÁ TEM UM X/O NAQUELE ESPAÇO! ESCOLHA UM LOCAL QUE ESTEJA VAZIO!");
			System.out.print("Linha (eixo x): ");
			x = sc.nextInt();
			x = verificarEixo(x);
			
			System.out.print("Coluna (eixo y): ");
			y = sc.nextInt();
			y = verificarEixo(y);
		}
	}
}
