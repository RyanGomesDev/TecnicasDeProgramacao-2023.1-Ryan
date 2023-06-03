package resgateAlunos;

import java.util.ArrayList;
import java.util.Random;

public class Plano {
	
	public ArrayList<Celula> ListaCelulas;
	public int TamanhoX;
	public int TamanhoY;
	
	public Plano(int tamanhoX, int tamanhoY) {
		
		TamanhoX = tamanhoX;
		TamanhoY = tamanhoY;
		ListaCelulas = new ArrayList<Celula>();
		
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula CelulaAux = new Celula(i, j);
				ListaCelulas.add(CelulaAux);
			}
		}
	}
	
	public void adicionarRobo(Robo robo, int posicaoX, int posicaoY) {
		
		Celula Aux;
		
		for (int i = 0; i < ListaCelulas.size(); i++) {
			Aux = ListaCelulas.get(i);
			
			if(Aux.getPosicaoX() == posicaoX && Aux.getPosicaoY() == posicaoY) {
				ListaCelulas.get(i).setRobosCelulas(robo);
			}
		}
	}
	
	public void avancarRobo(Robo robo, int vezes) {
		
		for (int i = 0; i < ListaCelulas.size(); i++) {
			for (int j = 0; j < ListaCelulas.get(i).getTamanhoRobosCelulas(); j++) {
				
				if(ListaCelulas.get(i).getRobo(j).Tipo == robo.Tipo) {
					ListaCelulas.get(i).getRobo(j).avancar(vezes);
				}
				
			}
		}
		
	}
	
	public void retrocederRobo(Robo robo, int vezes) {
		
		int Aux = 0;
		
		for (int i = 0; i < ListaCelulas.size(); i++) {
			for (int j = 0; j < ListaCelulas.get(i).getTamanhoRobosCelulas(); j++) {
				
				if(ListaCelulas.get(i).getRobo(j).Tipo == robo.Tipo && Aux == 0) {
					ListaCelulas.get(i).getRobo(j).retroceder(vezes);
					Aux++;
				}
			}
		}
		
	}
	
	public void colocarAlunos(int quant) {
		
		Random random = new Random();
		int NumSorteado;
		boolean AuxAluno = false;
		boolean AuxBug = false;
		
		if(quant > (ListaCelulas.size()/2)) {
			quant = ListaCelulas.size()/2;
		} else if(quant < 1) {
			quant = 1;
		}
		
		while(quant > 0) {
			
			NumSorteado = random.nextInt(ListaCelulas.size()-1);
			AuxAluno = ListaCelulas.get(NumSorteado).getAluno();
			AuxBug = ListaCelulas.get(NumSorteado).getBug();
				
			while(NumSorteado == ((TamanhoX*TamanhoY)/2) || AuxAluno == true || AuxBug == true) {
				NumSorteado = random.nextInt(ListaCelulas.size()-1);
				AuxAluno = ListaCelulas.get(NumSorteado).getAluno();
				AuxBug = ListaCelulas.get(NumSorteado).getBug();
			}
			
			ListaCelulas.get(NumSorteado).setAluno(true);
			quant--;
		}
	}
	
	public void colocarBugs(int quant) {
		
		Random random = new Random();
		int NumSorteado;
		boolean AuxAluno = false;
		boolean AuxBug = false;
		
		if(quant > (ListaCelulas.size()/2)) {
			quant = ListaCelulas.size()/2;
		} else if(quant < 1) {
			quant = 1;
		}
		
		while(quant > 0) {
			
			NumSorteado = random.nextInt(ListaCelulas.size()-1);
			AuxAluno = ListaCelulas.get(NumSorteado).getAluno();
			AuxBug = ListaCelulas.get(NumSorteado).getBug();
			
			while(NumSorteado == ((TamanhoX*TamanhoY)/2) || AuxAluno == true || AuxBug == true) {
				NumSorteado = random.nextInt(ListaCelulas.size()-1);
				AuxAluno = ListaCelulas.get(NumSorteado).getAluno();
				AuxBug = ListaCelulas.get(NumSorteado).getBug();
			}
			
			ListaCelulas.get(NumSorteado).setBug(true);
			quant--;
		}
	}
	
}
