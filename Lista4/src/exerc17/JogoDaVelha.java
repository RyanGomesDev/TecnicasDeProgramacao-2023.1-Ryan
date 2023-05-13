package exerc17;

public class JogoDaVelha {
	
	private int Grade[][] = new int[3][3];
	
	public int verificarVitoria() {
		
		int Cont = 0;
		
		// VERIFICANDO SE ALGUÉM GANHOU PELAS LINHAS
		for (int i = 0; i < 3; i++) {
	        if (Grade[i][0] == 1 && Grade[i][0] == Grade[i][1] && Grade[i][1] == Grade[i][2]) {
	            return 1;
	        }
	        if (Grade[i][0] == 2 && Grade[i][0] == Grade[i][1] && Grade[i][1] == Grade[i][2]) {
	            return 2;
	        }
	    }
		
		// VERIFICANDO SE ALGUÉM GANHOU PELAS COLUNAS
		for (int i = 0; i < 3; i++) {
	        if (Grade[0][i] == 1 && Grade[0][i] == Grade[1][i] && Grade[1][i] == Grade[2][i]) {
	            return 1;
	        }
	        if (Grade[0][i] == 2 && Grade[0][i] == Grade[1][i] && Grade[1][i] == Grade[2][i]) {
	            return 2;
	        }
	    }
		
		// VERIFICANDO SE ALGUÉM GANHOU PELAS DIAGONAIS
		if (Grade[0][0] == 1 && Grade[0][0] == Grade[1][1] && Grade[1][1] == Grade[2][2]) {
	        return 1;
	    }
		if (Grade[0][0] == 2 && Grade[0][0] == Grade[1][1] && Grade[1][1] == Grade[2][2]) {
	        return 2;
	    }
		
	    if (Grade[0][2] == 1 && Grade[0][2] == Grade[1][1] && Grade[1][1] == Grade[2][0]) {
	        return 1;
	    }
	    if (Grade[0][2] == 2 && Grade[0][2] == Grade[1][1] && Grade[1][1] == Grade[2][0]) {
	        return 2;
	    }
	    
	    // VERIFICANDO SE NINGUÉM GANHOU
	    for (int i = 0; i < Grade.length; i++) {
			for (int j = 0; j < Grade[0].length; j++) {
				
				if(Grade[i][j] == 0) {
					Cont++;
				}
				
			}
		}
	    if(Cont == 0) {
	    	return 3;
	    }
	    
	    return 0;
	}
	
	public boolean Jogador1(int x, int y) {
		
		if(Grade[x-1][y-1] == 0) {
			Grade[x-1][y-1] = 1;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean Jogador2(int x, int y) {
		
		if(Grade[x-1][y-1] == 0) {
			Grade[x-1][y-1] = 2;
			return true;
		} else {
			return false;
		}
		
	}
	
	public void exibirGrade() {
		int Cont = 1;
		
		System.out.println("\n    1 2 3\n");
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print(Cont + "   ");
			
			for (int j = 0; j < 3; j++) {
				
				if(Grade[i][j] == 1) {
					System.out.print("X");
				}else if(Grade[i][j] == 2) {
					System.out.print("O");
				} else {
					System.out.print(" ");
				}
				
				if(j < 2) {
					System.out.print("|");
				}
			}
			
			if(i < 2) {
				System.out.println("\n    –––––");
			}
			Cont++;
		}
		System.out.println("\n");
	}
	
}
