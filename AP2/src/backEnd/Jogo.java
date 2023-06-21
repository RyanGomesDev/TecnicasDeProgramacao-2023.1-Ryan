package backEnd;

import java.util.ArrayList;

import model.EscreverDados;
import model.LerDados;

public class Jogo {
	
	private ArrayList<Jogador> BancoJogadores;
	private EscreverDados Escrever;
	private LerDados Ler;
	private Plano Plano;
	
	public Jogo() {
		BancoJogadores = new ArrayList<Jogador>();
		Escrever = new EscreverDados();
		Ler = new LerDados();
		Plano = new Plano();
		
		Ler.lerDados("dados/Players.txt");
		BancoJogadores = Ler.getLista();
	}
	
	public void criarJogador(String nome) {
		BancoJogadores.add(new Jogador(nome));
	}
	
	public void acertouRobo(int Robo) {
		int Aux = BancoJogadores.size();
		BancoJogadores.get(Aux-1).acertouRobo(Robo);
	}
	
	public void errouRobo(int Robo) {
		int Aux = BancoJogadores.size();
		BancoJogadores.get(Aux-1).errouRobo(Robo);
	}
	
	public void atualizarPontos() {
		int Aux = BancoJogadores.size();
		BancoJogadores.get(Aux-1).atualizarPontos();
	}
	
	public int getQuantJogadores() {
		return BancoJogadores.size();
	}
	
	public void adicionarAlunos() {
		Plano.adicionarAlunos();
	}
	
	public void adicionarBugs() {
		Plano.adicionarBugs();
	}
	
	public void aumentarRodadas() {
		int Aux = BancoJogadores.size();
		BancoJogadores.get(Aux-1).aumentarRodadas();
	}
	
	public void escreverDados() {
		Escrever.escreverDados(formatarDados());
	}
	
	public String formatarDados() {
		
		String Saida = "";
		
		for (int i = 0; i < BancoJogadores.size(); i++) {
			Saida += BancoJogadores.get(i).formatarDados();
		}
		
		return Saida;
	}
	
	public int getPontosTotal(int indice) {
		return BancoJogadores.get(indice).getPontosTotal();
	}
	
	public String getNome(int indice) {
		return BancoJogadores.get(indice).getNome();
	}
	
	public int getAlunos(int indice) {
		return BancoJogadores.get(indice).getAlunos();
	}
	
	public int getBugs(int indice) {
		return BancoJogadores.get(indice).getBugs();
	}
	
	public int getPontosAndador(int indice) {
		return BancoJogadores.get(indice).getPontosAndador();
	}
	
	public int getPontosCavalo(int indice) {
		return BancoJogadores.get(indice).getPontosCavalo();
	}
	
	public int getPontosRei(int indice) {
		return BancoJogadores.get(indice).getPontosRei();
	}
	
	public boolean getAlunoCasa(int indice) {
		return Plano.getAluno(indice);
	}
	
	public void setCasaVisitada(int indice) {
		Plano.setVisitado(indice);
	}
	
	public boolean getCasaVisitada(int indice) {
		return Plano.getVisitado(indice);
	}
	
	public void setAlunos() {
		int Aux = BancoJogadores.size();
		BancoJogadores.get(Aux-1).setAlunos();
	}
	
	public void setBugs() {
		int Aux = BancoJogadores.size();
		BancoJogadores.get(Aux-1).setBugs();
	}
	
	public void setCasasVazias() {
		int Aux = BancoJogadores.size();
		BancoJogadores.get(Aux-1).setCasasVazias();
	}
	
	public boolean getBugCasa(int indice) {
		return Plano.getBug(indice);
	}
	
	public int getRodadas(int indice) {
		return BancoJogadores.get(indice).getRodadas();
	}
	
	public int getCasasVazias(int indice) {
		return BancoJogadores.get(indice).getCasasVazias();
	}
	
}
