package resgateAlunos;

import java.util.ArrayList;

public class Celula {
	
	private int id;
	private int PosicaoX;
	private int PosicaoY;
	public ArrayList<Robo> RobosCelula;
	private boolean Aluno;
	private boolean AlunoResgatado;
	private boolean Bug;
	private boolean BugAchado;
	private boolean Andou;
	
	public Celula(int x , int y) {
		PosicaoX = x;
		PosicaoY = y;
		RobosCelula = new ArrayList<Robo>();
		Aluno = false;
		AlunoResgatado = false;
		Bug = false;
		BugAchado = false;
		Andou = false;
	}
	
	public void colocarRobos(Robo andador, Robo peao, Robo torre, Robo bispo, Robo cavalo, Robo rei, Robo rainha) {
		RobosCelula.add(andador);
		RobosCelula.add(peao);
		RobosCelula.add(torre);
		RobosCelula.add(bispo);
		RobosCelula.add(cavalo);
		RobosCelula.add(rei);
		RobosCelula.add(rainha);
	}
	
	public void removerRobo(int indice) {
		RobosCelula.remove(indice);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosicaoX() {
		return PosicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		PosicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return PosicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		PosicaoY = posicaoY;
	}
	
	public ArrayList<Robo> getListaRobosCelulas(){
		return RobosCelula;
	}
	
	public Robo getRobo(int indice){
		return RobosCelula.get(indice);
	}
	
	public int getTamanhoRobosCelulas(){
		return RobosCelula.size();
	}
	
	public void setRobosCelulas(Robo robo) {
		RobosCelula.add(robo);
	}

	public boolean getAluno() {
		return Aluno;
	}

	public void setAluno(boolean alunoCelula) {
		Aluno = alunoCelula;
	}

	public boolean getBug() {
		return Bug;
	}

	public void setBug(boolean bugCelula) {
		Bug = bugCelula;
	}

	public boolean getAndou() {
		return Andou;
	}

	public void setAndou(boolean andou) {
		Andou = andou;
	}

	public boolean getAlunoResgatado() {
		return AlunoResgatado;
	}

	public void setAlunoResgatado(boolean alunoResgatado) {
		AlunoResgatado = alunoResgatado;
	}

	public boolean getBugAchado() {
		return BugAchado;
	}

	public void setBugAchado(boolean bugAchado) {
		BugAchado = bugAchado;
	}
}
