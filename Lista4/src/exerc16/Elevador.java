package exerc16;

public class Elevador {
	
	private int AndarAtual;
	private int TotalAndares;
	private int Capacidade;
	private int Pessoas;
	
	public Elevador(int totalAndares, int capacidade) {
		TotalAndares = totalAndares;
		Capacidade = capacidade;
	}
	
	public void Entrar() {
		if(Capacidade > Pessoas) {
			Pessoas++;
		} else {
			System.out.println("AVISO: Capacidade Máxima de pessoas atingida!");
		}
	}
	
	public void Sair() {
		if(Pessoas > 0) {
			Pessoas--;
		} else {
			System.out.println("MENSAGEM: Não tem ninguém no elevador.");
		}
	}
	
	public void Subir() {
		if(TotalAndares > AndarAtual) {
			AndarAtual++;
		} else {
			System.out.println("MENSAGEM: O elevador está no último andar.");
		}
	}
	
	public void Descer() {
		if(AndarAtual > 0) {
			AndarAtual--;
		} else {
			System.out.println("MENSAGEM: O elevador está no primeiro andar.");
		}
	}

	public int getAndarAtual() {
		return AndarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		AndarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return TotalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		TotalAndares = totalAndares;
	}

	public int getCapacidade() {
		return Capacidade;
	}

	public void setCapacidade(int capacidade) {
		Capacidade = capacidade;
	}

	public int getPessoas() {
		return Pessoas;
	}

	public void setPessoas(int pessoas) {
		Pessoas = pessoas;
	}
}
