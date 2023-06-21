package backEnd;

import java.util.ArrayList;
import java.util.Random;

public class Plano {
	
	private ArrayList<Casa> Casas;
	
	public Plano() {
		Casas = new ArrayList<Casa>();
		
		for (int i = 0; i < 64; i++) {
			Casas.add(new Casa());
		}
		
	}
	
	public void adicionarAlunos() {
		
		Random random = new Random();
		int NumSorteado;
		int Cont = 21;
		boolean AlunoAux = false;
		boolean BugAux = false;
		
		while(Cont > 0) {
			
			NumSorteado = random.nextInt(64);
			AlunoAux = Casas.get(NumSorteado).getAluno();
			BugAux = Casas.get(NumSorteado).getBug();
				
			while(AlunoAux == true || BugAux == true) {
				NumSorteado = random.nextInt(64);
				AlunoAux = Casas.get(NumSorteado).getAluno();
				BugAux = Casas.get(NumSorteado).getBug();
			}
			
			Casas.get(NumSorteado).setAluno(true);
			Cont--;
		}
	}
	
	public void adicionarBugs() {
		
		Random random = new Random();
		int NumSorteado;
		int Cont = 21;
		boolean AlunoAux = false;
		boolean BugAux = false;
		
		while(Cont > 0) {
			
			NumSorteado = random.nextInt(64);
			AlunoAux = Casas.get(NumSorteado).getAluno();
			BugAux = Casas.get(NumSorteado).getBug();
				
			while(AlunoAux == true || BugAux == true) {
				NumSorteado = random.nextInt(64);
				AlunoAux = Casas.get(NumSorteado).getAluno();
				BugAux = Casas.get(NumSorteado).getBug();
			}
			
			Casas.get(NumSorteado).setBug(true);
			Cont--;
		}
	}
	
	public boolean getAluno(int index) {
		return Casas.get(index).getAluno();
	}
	
	public boolean getBug(int index) {
		return Casas.get(index).getBug();
	}
	
	public void setVisitado(int Index) {
		Casas.get(Index).setVisitado(true);
	}
	
	public boolean getVisitado(int Index) {
		return Casas.get(Index).getVisitado();
	}
	
}
