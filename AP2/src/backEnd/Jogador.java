package backEnd;

public class Jogador {
	
	private String Nome;
	private int Rodadas;
	private int CasasVazias;
	private int PontosTotal;
	private int Alunos;
	private int Bugs;
	private int PontosAndador;
	private int PontosCavalo;
	private int PontosRei;
	
	public Jogador(String nome) {
		Nome = nome;
		Rodadas = 1;
		CasasVazias = 0;
		PontosTotal = 0;
		Alunos = 0;
		Bugs = 0;
		PontosAndador = 0;
		PontosCavalo = 0;
		PontosRei = 0;
	}

	public Jogador(String nome, int rodadas, int casasVazias, int pontosTotal, int alunos, int bugs, int pontosAndador,
			int pontosCavalo, int pontosRei) {
		Nome = nome;
		Rodadas = rodadas;
		CasasVazias = casasVazias;
		PontosTotal = pontosTotal;
		Alunos = alunos;
		Bugs = bugs;
		PontosAndador = pontosAndador;
		PontosCavalo = pontosCavalo;
		PontosRei = pontosRei;
	}
	
	public String formatarDados() {
		
		String Saida = "";
		
		Saida += getNome() + ";" + getRodadas() + ";" + getCasasVazias() + ";" + getPontosTotal() + 
				";" + getAlunos() + ";" + getBugs() + ";" + getPontosAndador() + ";" + getPontosCavalo() + 
				";" + getPontosRei() + "\n" ;
		
		return Saida;
	}
	
	public String getNome() {
		return Nome;
	}

	public int getRodadas() {
		return Rodadas;
	}

	public void aumentarRodadas() {
		Rodadas++;
	}

	public int getCasasVazias() {
		return CasasVazias;
	}

	public void setCasasVazias() {
		CasasVazias++;
	}
	
	public void atualizarPontos() {
		PontosTotal = PontosAndador + PontosCavalo + PontosRei;
	}
	
	public int getPontosTotal() {
		return PontosTotal;
	}

	public void setPontosTotal(int pontosTotal) {
		PontosTotal = pontosTotal;
	}

	public int getAlunos() {
		return Alunos;
	}

	public void setAlunos() {
		Alunos++;
	}

	public int getBugs() {
		return Bugs;
	}

	public void setBugs() {
		Bugs++;
	}
	
	public void acertouRobo(int Robo) {
		
		if(Robo == 1) {
			PontosAndador += 10;
		} else if(Robo == 2) {
			PontosCavalo += 10;
		} else if(Robo == 3) {
			PontosRei += 10;
		}
	}
	
	public void errouRobo(int Robo) {
		
		if(Robo == 1) {
			PontosAndador -= 15;
		} else if(Robo == 2) {
			PontosCavalo -= 15;
		} else if(Robo == 3) {
			PontosRei -= 15;
		}
	}
	
	public int getPontosAndador() {
		return PontosAndador;
	}

	public void setPontosAndador(int pontosAndador) {
		PontosAndador += pontosAndador;
	}

	public int getPontosCavalo() {
		return PontosCavalo;
	}

	public void setPontosCavalo(int pontosCavalo) {
		PontosCavalo += pontosCavalo;
	}

	public int getPontosRei() {
		return PontosRei;
	}

	public void setPontosRei(int pontosRei) {
		PontosRei = pontosRei;
	}
}
