package resgateAlunos;

public class Rei extends Robo {
	
	// Construtor para inicializar a classe Bispo
	public Rei(int id, String nome, Plano plano) {
		super(id, nome, plano);
		Tipo = "Rei";
	}

	// Movimento Diagonal no sentido sudoeste para nordeste
	public void avancar(int vezes) {
		
		int TamY = Plano.TamanhoY;
		int PosX = 0;
		int PosY = 0;
		int NovaPosX = 0;
		int NovaPosY = 0;
		
		if(vezes > 4) {
			vezes = 4;
		} else if(vezes < 1) {
			vezes = 1;
		}
		
		while(vezes > 0) {
			
			for (int i = 0; i < Plano.ListaCelulas.size(); i++) {
				for (int j = 0; j < Plano.ListaCelulas.get(i).getTamanhoRobosCelulas(); j++) {
					
					PosX = Plano.ListaCelulas.get(i).getPosicaoX();
					PosY = Plano.ListaCelulas.get(i).getPosicaoY();
					
					if(Plano.ListaCelulas.get(i).getRobo(j).Tipo == "Rei" && PosX >= 2 && PosY < TamY) {
						NovaPosX = PosX-1;
						NovaPosY = PosY+1;
						Plano.ListaCelulas.get(i).removerRobo(j);
						Plano.ListaCelulas.get(i).setAndou(true);
					}
				}
			}
			
			for (int i = 0; i < Plano.ListaCelulas.size(); i++) {
				
				if(Plano.ListaCelulas.get(i).getPosicaoX() == NovaPosX && Plano.ListaCelulas.get(i).getPosicaoY() == NovaPosY) {
					
					if(Plano.ListaCelulas.get(i).getAluno()) {
						Pontuacao += 10;
						Plano.ListaCelulas.get(i).setRobosCelulas(this);
						Plano.ListaCelulas.get(i).setAluno(false);
						Plano.ListaCelulas.get(i).setAlunoResgatado(true);
					} else if(Plano.ListaCelulas.get(i).getBug()) {
						Pontuacao -= 15;
						Plano.ListaCelulas.get(i).setRobosCelulas(this);
						Plano.ListaCelulas.get(i).setBugAchado(true);
					} else {
						Plano.ListaCelulas.get(i).setRobosCelulas(this);
					}
					NovaPosX = 0;
					NovaPosY = 0;
				}
			}
			vezes--;
		}
		
	}
	
	// Movimento Diagonal no sentido nordeste para sudoeste
	public void retroceder(int vezes) {
		
		int TamX = Plano.TamanhoX;
		int PosX = 0;
		int PosY = 0;
		int NovaPosX = 0;
		int NovaPosY = 0;
		
		if(vezes > 4) {
			vezes = 4;
		} else if(vezes < 1) {
			vezes = 1;
		}
		
		while(vezes > 0) {
			
			for (int i = 0; i < Plano.ListaCelulas.size(); i++) {
				for (int j = 0; j < Plano.ListaCelulas.get(i).getTamanhoRobosCelulas(); j++) {
					
					PosX = Plano.ListaCelulas.get(i).getPosicaoX();
					PosY = Plano.ListaCelulas.get(i).getPosicaoY();
					
					if(Plano.ListaCelulas.get(i).getRobo(j).Tipo == "Rei" && PosX < TamX && PosY > 1) {
						NovaPosX = PosX+1;
						NovaPosY = PosY-1;
						Plano.ListaCelulas.get(i).removerRobo(j);
						Plano.ListaCelulas.get(i).setAndou(true);
					}
				}
			}
			
			for (int i = 0; i < Plano.ListaCelulas.size(); i++) {
				
				if(Plano.ListaCelulas.get(i).getPosicaoX() == NovaPosX && Plano.ListaCelulas.get(i).getPosicaoY() == NovaPosY) {
					
					if(Plano.ListaCelulas.get(i).getAluno()) {
						Pontuacao += 10;
						Plano.ListaCelulas.get(i).setRobosCelulas(this);
						Plano.ListaCelulas.get(i).setAluno(false);
						Plano.ListaCelulas.get(i).setAlunoResgatado(true);
					} else if(Plano.ListaCelulas.get(i).getBug()) {
						Pontuacao -= 15;
						Plano.ListaCelulas.get(i).setRobosCelulas(this);
						Plano.ListaCelulas.get(i).setBugAchado(true);
					} else {
						Plano.ListaCelulas.get(i).setRobosCelulas(this);
					}
					NovaPosX = 0;
					NovaPosY = 0;
				}
			}
			vezes--;
		}
		
	}
	
}
