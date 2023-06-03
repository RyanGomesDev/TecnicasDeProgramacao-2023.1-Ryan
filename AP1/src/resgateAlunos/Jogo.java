package resgateAlunos;

import java.util.Scanner;

public class Jogo {
	
	public Jogo() {
		
		Scanner sc = new Scanner(System.in);
		String Nome = "";
		int QuantAlunos = 0;
		int QuantBugs = 0;
		int Vezes;
		int OpcaoInt;
		String OpcaoStr;
		char CaracterAux;
		int TamX = 0;
		int TamY = 0;
		int Cont = 1;
		
		System.out.println("┌──────────────────────┐");
		System.out.println("│ O Resgate dos Alunos │");
		System.out.println("└──────────────────────┘");
		
		System.out.print("\n-> Nome do Jogador(a): ");
		Nome = sc.nextLine();
		
		System.out.print("\n-> Digite o Quantidade de linhas (x) e colunas (y) do Plano:\nX - ");
		TamX = sc.nextInt();
		
		System.out.print("Y - ");
		TamY = sc.nextInt();
		
		System.out.print("\n-> Qual a quantidades de alunos a serem resgatados: ");
		QuantAlunos = sc.nextInt();
		
		System.out.print("-> Qual a quantidades de bugs a serem evitados: ");
		QuantBugs = sc.nextInt();
		
		Plano plano = new Plano(TamX, TamY);
		Andador andador = new Andador(1, "Andador", plano);
		Peao peao = new Peao(2, "Peão", plano);
		Torre torre = new Torre(3, "Torre", plano);
		Bispo bispo = new Bispo(4, "Bispo", plano);
		Cavalo cavalo = new Cavalo(5, "Cavalo", plano);
		Rei rei = new Rei(6, "Rei", plano);
		Rainha rainha = new Rainha(7, "Rainha", plano);
		
		plano.ListaCelulas.get((TamX*TamY)/2).colocarRobos(andador, peao, torre, bispo, cavalo, rei, rainha);
		plano.colocarAlunos(QuantAlunos);
		plano.colocarBugs(QuantBugs);
		legenda();
		
		do {
			System.out.println("\n┌──────────┐");
			System.out.printf("│ Rodada %d │\n", Cont);
			System.out.println("└──────────┘");
			
			System.out.printf("\n-> Você quer começar a rodada %d (S/s) ou sair do jogo (N/n)? ", Cont);
			OpcaoStr = sc.next();
			
			while (OpcaoStr.length() > 1 || OpcaoStr.length() == 0) {
				System.out.println("\nVALOR INVÁLIDO! DIGITE S/s ou N/n!\n\nOpção: ");
				OpcaoStr = sc.next();
				
	        }
			
	        CaracterAux = OpcaoStr.charAt(0);
	        
	        if(CaracterAux == 'N' || CaracterAux == 'n' || QuantAlunos == verificarVitoria(plano)) {
				
			} else {
				
				mostrarPlano(plano);
				posicaoRobos(plano);
				
				System.out.println("\n-> Turno do Robô Andador <-");
				System.out.println("OBS: Movimenta-se pra cima ou pra baixo em qualquer número (X) de células desejada.");
				System.out.print("\nDigite quantas casas ele vai andar: ");
				Vezes = sc.nextInt();
				System.out.print("Digite '1' para ele ir pra cima ou '2' para ir pra baixo: ");
				OpcaoInt = sc.nextInt();
				
				if(OpcaoInt == 1) {
					plano.avancarRobo(andador, Vezes);
				}
				if(OpcaoInt == 2) {
					plano.retrocederRobo(andador, Vezes);
				}
				
				System.out.println("\n-> Turno do Robô Peão <-");
				System.out.println("OBS: Movimenta-se apenas uma (1) célula para esquerda ou direita.");
				System.out.print("\nDigite '1' para ele ir pra esquerda ou '2' para ir pra direita: ");
				OpcaoInt = sc.nextInt();
				
				if(OpcaoInt == 2) {
					plano.avancarRobo(peao, 1);
				}
				if(OpcaoInt == 1) {
					plano.retrocederRobo(peao, 1);
				}
				
				System.out.println("\n-> Turno do Robô Torre <-");
				System.out.println("OBS: Movimenta-se até duas (2) células para cima ou para baixo em cada jogada.");
				System.out.print("\nDigite quantas casas ele vai andar: ");
				Vezes = sc.nextInt();
				System.out.print("Digite '1' para ele ir pra cima ou '2' para ir pra baixo: ");
				OpcaoInt = sc.nextInt();
				
				if(OpcaoInt == 1) {
					plano.avancarRobo(torre, Vezes);
				}
				if(OpcaoInt == 2) {
					plano.retrocederRobo(torre, Vezes);
				}
				
				System.out.println("\n-> Turno do Robô Bispo <-");
				System.out.println("OBS: Movimenta-se pela diagonal no sentido sudeste para noroeste em até duas (2) células em cada jogada.");
				System.out.print("\nDigite quantas casas ele vai andar: ");
				Vezes = sc.nextInt();
				System.out.print("Digite '1' para ele ir no sentido sudeste para noroeste ou '2' para ir no sentido noroeste para sudeste: ");
				OpcaoInt = sc.nextInt();
				
				if(OpcaoInt == 1) {
					plano.avancarRobo(bispo, Vezes);
				}
				if(OpcaoInt == 2) {
					plano.retrocederRobo(bispo, Vezes);
				}
				
				System.out.println("\n-> Turno do Robô Cavalo <-");
				System.out.println("OBS: Movimenta-se pela diagonal no sentido sudoeste para nordeste em até duas (2) células em cada jogada.");
				System.out.print("\nDigite quantas casas ele vai andar: ");
				Vezes = sc.nextInt();
				System.out.print("Digite '1' para ele ir no sentido sudoeste para nordeste ou '2' para ir no sentido nordeste para sudoeste: ");
				OpcaoInt = sc.nextInt();
				
				if(OpcaoInt == 1) {
					plano.avancarRobo(cavalo, Vezes);
				}
				if(OpcaoInt == 2) {
					plano.retrocederRobo(cavalo, Vezes);
				}
				
				System.out.println("\n-> Turno do Robô Rei <-");
				System.out.println("OBS: Movimenta-se pela diagonal no sentido sudoeste para nordeste em até quatro (4) células em cada jogada.");
				System.out.print("\nDigite quantas casas ele vai andar: ");
				Vezes = sc.nextInt();
				System.out.print("Digite '1' para ele ir no sentido sudoeste para nordeste ou '2' para ir no sentido nordeste para sudoeste: ");
				OpcaoInt = sc.nextInt();
				
				if(OpcaoInt == 1) {
					plano.avancarRobo(rei, Vezes);
				}
				if(OpcaoInt == 2) {
					plano.retrocederRobo(rei, Vezes);
				}
				
				System.out.println("\n-> Turno do Robô Rainha <-");
				System.out.println("OBS: Movimenta-se pela diagonal no sentido sudeste para noroeste em até quatro (4) células em cada jogada.");
				System.out.print("\nDigite quantas casas ele vai andar: ");
				Vezes = sc.nextInt();
				System.out.print("Digite '1' para ele ir no sentido sudeste para noroeste ou '2' para ir no sentido noroeste para sudeste: ");
				OpcaoInt = sc.nextInt();
				
				if(OpcaoInt == 1) {
					plano.avancarRobo(rainha, Vezes);
				}
				if(OpcaoInt == 2) {
					plano.retrocederRobo(rainha, Vezes);
				}
				
				posicaoAlunos(plano);
				posicaoBugs(plano);
				
			}
			
	        if(CaracterAux == 'S' && QuantAlunos == verificarVitoria(plano)) {
	        	CaracterAux = 'N';
	        } else if(CaracterAux == 's' && QuantAlunos == verificarVitoria(plano)) {
	        	CaracterAux = 'N';
	        }
	        
			Cont++;
		} while(CaracterAux == 'S' || CaracterAux == 's');
		
		System.out.printf("\n--> FIM DE JOGO %s <--\n", Nome);
		placar(plano);
		sc.close();
	}
	
	public void mostrarPlano(Plano plano) {
		
		int TamX = plano.TamanhoX;
		int TamY = plano.TamanhoY;
		int Cont = 0;
		
		System.out.print("\n┌");
		for (int i = 0; i < (TamY*2) - 1; i++) {
			System.out.print("─");
		}
		System.out.println("┐");
		
		for (int i = 0; i < TamX; i++) {
			System.out.print("│");
			for (int j = 0; j < TamY; j++) {
				
				System.out.print(umaCelula(plano, Cont));
				Cont++;
			}
			System.out.println();
			
			if(i != TamX-1) {
				System.out.print("├");
				for (int aux = 0; aux < (TamY*2) - 1; aux++) {
					System.out.print("─");
				}
				System.out.println("┤");
			}
			
		}
		
		System.out.print("└");
		for (int i = 0; i < (TamY*2) - 1; i++) {
			System.out.print("─");
		}
		System.out.println("┘\n");
		
	}
	
	public String umaCelula(Plano plano, int i) {
		
		String Celulas = "";
		String AuxTipo = "";
		
		try {
			AuxTipo = plano.ListaCelulas.get(i).RobosCelula.get(0).getTipo();
		} catch (Exception e) {
			
		}
		
		if(plano.ListaCelulas.get(i).getTamanhoRobosCelulas() >= 2) {
			Celulas += "R│";
		}else if(AuxTipo == "Andador") {
			Celulas += "A│";
		}else if(AuxTipo == "Peao") {
			Celulas += "P│";
		} else if(AuxTipo == "Torre") {
			Celulas += "T│";
		}else if(AuxTipo == "Bispo") {
			Celulas += "B│";
		}else if(AuxTipo == "Cavalo") {
			Celulas += "C│";
		}else if(AuxTipo == "Rei") {
			Celulas += "⌂│";
		}else if(AuxTipo == "Rainha") {
			Celulas += "º│";
		}else if(plano.ListaCelulas.get(i).getAlunoResgatado()) {
			Celulas += "♦│";
		}else if(plano.ListaCelulas.get(i).getBugAchado()) {
			Celulas += "¥│";
		}else if(plano.ListaCelulas.get(i).getAndou()) { 
			Celulas += "☼│";
		}else {
			Celulas += " │";
		}
		
		return Celulas;
	}
	
	public void posicaoRobos(Plano plano) {
		
		int PosX = 0;
		int PosY = 0;
		
		System.out.println("┌────────────────────┐");
		System.out.println("│ Posição dos Robôs: │");
		System.out.println("└────────────────────┘\n");
		
		for (int i = 0; i < plano.ListaCelulas.size(); i++) {
			for (int j = 0; j < plano.ListaCelulas.get(i).getTamanhoRobosCelulas(); j++) {
				PosX = plano.ListaCelulas.get(i).getPosicaoX();
				PosY = plano.ListaCelulas.get(i).getPosicaoY();
				System.out.println(plano.ListaCelulas.get(i).getRobo(j).getTipo() + " (" + PosX + ", " + PosY + ")");
			}
		}
		
	}
	
	public void posicaoAlunos(Plano plano) {
		
		int PosX = 0;
		int PosY = 0;
		int NaoResg = 0;
		int Cont = 1;
		
		System.out.println("\n-> Todos os alunos encontrados:");
		
		for (int i = 0; i < plano.ListaCelulas.size(); i++) {
			PosX = plano.ListaCelulas.get(i).getPosicaoX();
			PosY = plano.ListaCelulas.get(i).getPosicaoY();
			
			if(plano.ListaCelulas.get(i).getAlunoResgatado()) {
				System.out.printf("%d° - (%d, %d)\n", Cont, PosX, PosY);
				Cont++;
			}
			
			if(plano.ListaCelulas.get(i).getAluno() && plano.ListaCelulas.get(i).getAlunoResgatado() == false) {
				NaoResg++;
			}
			
		}
		
		if(NaoResg >= 1) {
			System.out.println("\nFalta " + NaoResg + " alunos para serem resgatados!");
		}
		
	}
	
	public void posicaoBugs(Plano plano) {
		int PosX = 0;
		int PosY = 0;
		int NaoAchado = 0;
		int Cont = 1;
		
		System.out.println("\n-> Localização dos Bugs encontrados:");
		
		for (int i = 0; i < plano.ListaCelulas.size(); i++) {
			PosX = plano.ListaCelulas.get(i).getPosicaoX();
			PosY = plano.ListaCelulas.get(i).getPosicaoY();
			
			if(plano.ListaCelulas.get(i).getBugAchado()) {
				System.out.printf("%d° - (%d, %d)\n", Cont, PosX, PosY);
				Cont++;
			}
			
			if(plano.ListaCelulas.get(i).getBug() && plano.ListaCelulas.get(i).getBugAchado() == false) {
				NaoAchado++;
			}
			
		}
		
		if(NaoAchado >= 1) {
			System.out.println("\n" + NaoAchado + " bugs ainda estão escondidos! Tenha cuidado!");
		}
	}
	
	public void legenda() {
		
		System.out.println();
		System.out.println("┌──────────────────────────────────────────────────────────────┐");
		System.out.println("│                Legenda dos Símbolos no Plano                 │");
		System.out.println("├─────────────────────┬─────────────────┬──────────────────────┤");
		System.out.println("│ R - Mais de um Robô │ B - Robô Bispo  │ ♦ - Aluno Resgatado  │");
		System.out.println("│ A - Robô Andador    │ C - Robô Cavalo │ ¥ - Bug Encontrado   │");
		System.out.println("│ P - Robô Peão       │ ⌂ - Robô Rei    │ ☼ - Casa já visitada │");
		System.out.println("│ T - Robô Torre      │ º - Robô Rainha │                      │");
		System.out.println("└─────────────────────┴─────────────────┴──────────────────────┘");
		
	}
	
	public void placar(Plano plano) {
		
		String NomeOuro = "";
		String NomePrata = "";
		String NomeBronze = "";
		int Ouro = 0;
		int Prata = 0;
		int Bronze = 0;
		int Aux = 0;
		
		for (int i = 0; i < plano.ListaCelulas.size(); i++) {
			for (int j = 0; j < plano.ListaCelulas.get(i).getTamanhoRobosCelulas(); j++) {
				
				Aux = plano.ListaCelulas.get(i).getRobo(j).getPontuacao();
				
				if(Aux > Ouro) {
					Bronze = Prata;
					NomeBronze = NomePrata;
					Prata = Ouro;
					NomePrata = NomeOuro;
					Ouro = Aux;
					NomeOuro = plano.ListaCelulas.get(i).getRobo(j).getTipo();
				}
			}
		}
		
		System.out.println("\n┌────────────────────────┐");
		System.out.println("│   Placar dos Pontos    │");
		System.out.println("├────────────────────────┤");
		
		switch(NomeOuro) {
			case "Andador":
				System.out.printf("│ 1° Lugar: Andador - %2d │\n", Ouro);
			case "Peao":
				System.out.printf("│ 1° Lugar: Peão - %2d    │\n", Ouro);
			case "Torre":
				System.out.printf("│ 1° Lugar: Torre - %2d   │\n", Ouro);
			case "Bispo":
				System.out.printf("│ 1° Lugar: Bispo - %2d   │\n", Ouro);
			case "Cavalo":
				System.out.printf("│ 1° Lugar: Cavalo - %2d  │\n", Ouro);
			case "Rei":
				System.out.printf("│ 1° Lugar: Rei - %2d     │\n", Ouro);
			case "Rainha":
				System.out.printf("│ 1° Lugar: Rainha - %2d  │\n", Ouro);
		}
		
		switch(NomePrata) {
			case "Andador":
				System.out.printf("│ 2° Lugar: Andador - %2d │\n", Prata);
			case "Peao":
				System.out.printf("│ 2° Lugar: Peão - %2d    │\n", Prata);
			case "Torre":
				System.out.printf("│ 2° Lugar: Torre - %2d   │\n", Prata);
			case "Bispo":
				System.out.printf("│ 2° Lugar: Bispo - %2d   │\n", Prata);
			case "Cavalo":
				System.out.printf("│ 2° Lugar: Cavalo - %2d  │\n", Prata);
			case "Rei":
				System.out.printf("│ 2° Lugar: Rei - %2d     │\n", Prata);
			case "Rainha":
				System.out.printf("│ 2° Lugar: Rainha - %2d  │\n", Prata);
		}
		
		switch(NomeBronze) {
			case "Andador":
				System.out.printf("│ 3° Lugar: Andador - %2d │\n", Bronze);
			case "Peao":
				System.out.printf("│ 3° Lugar: Peão - %2d    │\n", Bronze);
			case "Torre":
				System.out.printf("│ 3° Lugar: Torre - %2d   │\n", Bronze);
			case "Bispo":
				System.out.printf("│ 3° Lugar: Bispo - %2d   │\n", Bronze);
			case "Cavalo":
				System.out.printf("│ 3° Lugar: Cavalo - %2d  │\n", Bronze);
			case "Rei":
				System.out.printf("│ 3° Lugar: Rei - %2d     │\n", Bronze);
			case "Rainha":
				System.out.printf("│ 3° Lugar: Rainha - %2d  │\n", Bronze);
		}
		
		System.out.println("└────────────────────────┘");
	}
	
	public int verificarVitoria(Plano plano) {
		
		int Alunos = 0;
		
		for (int i = 0; i < plano.ListaCelulas.size(); i++) {
			
			if(plano.ListaCelulas.get(i).getAlunoResgatado()) {
				Alunos++;
			}
		}
		
		return Alunos;
	}
	
	public void tirarAviso() {
		
	}
}
