package exerc18;

public class Robo {
	
	private String Plano[][];
	private boolean Moeda = false;
	private int ContAndou = 0;
	private int ContNaoAndou = 0;
	//private String VerificarAndar;
	private int ContNorte = 0;
	private int ContSul = 0;
	private int ContLeste = 0;
	private int ContOeste = 0;
	private int ContNordeste = 0;
	private int ContSudeste = 0;
	private int ContSudoeste = 0;
	private int ContNoroeste = 0;
	
	public Robo(int x, int y) {
		Plano = new String[x][y];
		Plano[(x/2)][(y/2)] = "R";
	}
	
	public void andarNorte() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
		
//		Verificar se ele andou na mesma direção antes
//		if(VerificarAndar != "N") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R" && i >= 1) {
						Plano[i][j] = "@";
						
						if(Plano[i-1][j] == "$") {
							Moeda = true;
						}
						
						Plano[i-1][j] = "R";
						ContNorte++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "N";
	}
	
	public void andarSul() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
	
//		Verificar se ele andou na mesma direção antes		
//		if(VerificarAndar != "S") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R" && i < QuantLinhas-1) {
						Plano[i][j] = "@";
						
						if(Plano[i+1][j] == "$") {
							Moeda = true;
						}
						
						Plano[i+1][j] = "R";
						i++;
						ContSul++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "S";
	}
	
	public void andarLeste() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;

//		Verificar se ele andou na mesma direção antes
//		if(VerificarAndar != "L") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R" && j < QuantColunas-1) {
						Plano[i][j] = "@";
						
						if(Plano[i][j+1] == "$") {
							Moeda = true;
						}
						
						Plano[i][j+1] = "R";
						j++;
						ContLeste++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "L";
	}
	
	public void andarOeste() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
	
//		Verificar se ele andou na mesma direção antes		
//		if(VerificarAndar != "O") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R" && j >= 1) {
						Plano[i][j] = "@";
						
						if(Plano[i][j-1] == "$") {
							Moeda = true;
						}
						
						Plano[i][j-1] = "R";
						ContOeste++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "O";
	}
	
	public void andarNordeste() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
	
//		Verificar se ele andou na mesma direção antes		
//		if(VerificarAndar != "NE") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R" && i >= 1 && j < QuantColunas-1) {
						Plano[i][j] = "@";
						
						if(Plano[i-1][j+1] == "$") {
							Moeda = true;
						}
						
						Plano[i-1][j+1] = "R";
						ContNordeste++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "NE";
	}
	
	public void andarSudeste() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
	
//		Verificar se ele andou na mesma direção antes		
//		if(VerificarAndar != "SE") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R" && i < QuantLinhas-1 && j < QuantColunas-1) {
						Plano[i][j] = "@";
						
						if(Plano[i+1][j+1] == "$") {
							Moeda = true;
						}
						
						Plano[i+1][j+1] = "R";
						i++;
						j++;
						ContSudeste++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "SE";
	}
	
	public void andarSudoeste() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;

//		Verificar se ele andou na mesma direção antes		
//		if(VerificarAndar != "SO") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R" && i < QuantLinhas-1 && j >= 1) {
						Plano[i][j] = "@";
						
						if(Plano[i+1][j-1] == "$") {
							Moeda = true;
						}
						
						Plano[i+1][j-1] = "R";
						i++;
						ContSudoeste++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "SO";
	}
	
	public void andarNoroeste() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
//		Verificar se ele andou na mesma direção antes		
//		if(VerificarAndar != "NO") {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "Robo" && i >= 1 && j >= 1) {
						Plano[i][j] = "@";
						
						if(Plano[i-1][j-1] == "$") {
							Moeda = true;
						}
						
						Plano[i-1][j-1] = "R";
						ContNoroeste++;
					}
					
				}
			}
//		} else {
//			System.out.print("┌─────────────────────────────────────────────┐\n");
//			System.out.print("| NÃO PODE ANDAR NA MESMA DIREÇÃO DUAS VEZES! |\n");
//			System.out.print("└─────────────────────────────────────────────┘\n");
//		}
//		VerificarAndar = "NO";
	}	
	
	public void printarPlano() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
		
		System.out.print("┌");
		for (int i = 0; i < (QuantColunas*2) - 1; i++) {
			System.out.print("─");
		}
		System.out.println("┐");
		
		for (int i = 0; i < QuantLinhas; i++) {
			
			for (int j = 0; j < QuantColunas; j++) {
				System.out.print("|");
				if(Plano[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(Plano[i][j]);
				}
			}
			
			System.out.println("|");
			
			if(i != QuantLinhas-1) {
				System.out.print("├");
				for (int aux = 0; aux < (QuantColunas*2) - 1; aux++) {
					System.out.print("─");
				}
				System.out.println("┤");
			}
			
		}
		
		System.out.print("└");
		for (int i = 0; i < (QuantColunas*2) - 1; i++) {
			System.out.print("─");
		}
		System.out.println("┘\n");
		
		if(Moeda) {
			System.out.print("┌────────────────────┐\n");
			System.out.print("| MOEDA ENCONTRADA!! |\n");
			System.out.print("└────────────────────┘\n");
		}
		
	}
	
	public void colocarMoeda(int x, int y) {
		Plano[x][y] = "$";
	}
	
	public String getPlano(int x, int y) {
		return Plano[x][y];
	}
	
	public void contagemCasas() {
		System.out.println("\nNorte: " + ContNorte + " casa(s)\n" + "Sul: " + ContSul + " casa(s)\n"
				+ "Leste: " + ContLeste + " casa(s)\n" + "Oeste: " + ContOeste + " casa(s)\n"
				+ "Nordeste: " + ContNordeste + " casa(s)\n" + "Sudeste: " + ContSudeste + " casa(s)\n"
				+ "Sudoeste: " + ContSudoeste + " casa(s)\n" + "Noroeste: " + ContNoroeste + " casa(s)\n");
	}
	
	public void contagemCasasAndadas() {
		
		for (int i = 0; i < Plano.length; i++) {
			for (int j = 0; j < Plano[0].length; j++) {
				
				if(Plano[i][j] == "@") {
					ContAndou++;
				}
				
			}
		}
		
		System.out.println("O robô já andou em " + ContAndou + " casa(s)!");
	}
	
	public void contagemCasasNaoAndadas() {
		
		for (int i = 0; i < Plano.length; i++) {
			for (int j = 0; j < Plano[0].length; j++) {
				
				if(Plano[i][j] == null) {
					ContNaoAndou++;
				}
				
			}
		}
		
		System.out.println("O robô não andou ainda em " + (ContNaoAndou+1) + " casa(s)!");
	}
	
	public void caminhadaA() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
		
		// TROCAR A POSIÇÃO DO ROBÔ PARA A POSIÇÃO (1,1)
		for (int i = 0; i < QuantLinhas; i++) {
			for (int j = 0; j < QuantColunas; j++) {
				if(Plano[i][j] == "R") {
					Plano[i][j] = null;
					Plano[0][0] = "R";
				}
			}
		}
		
		for (int i = 0; i < QuantLinhas/2; i++) {
			for (int j = 0; j < QuantColunas-1; j++) {
				andarLeste();
			}
			printarPlano();
			andarSul();
			for (int j = 0; j < QuantColunas-1; j++) {
				andarOeste();
			}
			printarPlano();
			andarSul();
		}
		
		if((QuantLinhas%2) != 0) {
			for (int j = 0; j < QuantColunas-1; j++) {
				andarLeste();
			}
		}
		printarPlano();
	}
	
	public void caminhadaB() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
		
		// TROCAR A POSIÇÃO DO ROBÔ PARA A POSIÇÃO (1,1)
		for (int i = 0; i < QuantLinhas; i++) {
			for (int j = 0; j < QuantColunas; j++) {
				if(Plano[i][j] == "R") {
					Plano[i][j] = null;
					Plano[0][0] = "R";
				}
			}
		}
		
		for (int i = 0; i < QuantColunas-1; i++) {
			andarSudeste();
		}
		printarPlano();
		for (int i = 0; i < QuantColunas-1; i++) {
			andarNorte();
		}
		printarPlano();
		for (int i = 0; i < QuantColunas-1; i++) {
			andarSudoeste();
		}
		printarPlano();
		for (int i = 0; i < QuantColunas-1; i++) {
			andarNorte();
		}
		printarPlano();
	}
	
	public void caminhadaC() {
		
		int QuantLinhas = Plano.length;
		int QuantColunas = Plano[0].length;
		int Cont1 = 1;
		int Cont2 = 1;
		int Cont3 = 2;
		int Cont4 = 2;
		
		// TROCAR A POSIÇÃO DO ROBÔ PARA O MEIO DO PLANO
		if((QuantLinhas % 2) == 0 && (QuantColunas % 2) == 0) {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R") {
						Plano[i][j] = null;
						Plano[(QuantLinhas/2)-1][(QuantColunas/2)-1] = "R";
					}
				}
			}
		} else {
			for (int i = 0; i < QuantLinhas; i++) {
				for (int j = 0; j < QuantColunas; j++) {
				
					if(Plano[i][j] == "R") {
						Plano[i][j] = null;
						Plano[(QuantLinhas/2)][(QuantColunas/2)] = "R";
					}
				}
			}
		}
		
		for (int i = 0; i < QuantColunas/2; i++) {
			
			for (int j = 0; j < Cont1; j++) {
				andarLeste();
			}
			for (int j = 0; j < Cont2; j++) {
				andarSul();
			}
			for (int j = 0; j < Cont3; j++) {
				andarOeste();
			}
			if(Plano[QuantLinhas-1][0] != "R") {
				for (int j = 0; j < Cont4; j++) {
					andarNorte();
				}
			}
			
			printarPlano();
			Cont1 += 2;
			Cont2 += 2;
			Cont3 += 2;
			Cont4 += 2;
		}
		
	}
}
