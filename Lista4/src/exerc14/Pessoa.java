package exerc14;

public class Pessoa {
	
	private String Nome;
	private int Idade;
	private int Dia;
	private int Mes;
	private int Ano;
	
	public Pessoa(String nome, int dia, int mes, int ano) {
		Nome = nome;
		Dia = dia;
		Mes = mes;
		Ano = ano;
	}

	public void CalcularIdade(int DiaHoje, int MesHoje, int AnoHoje) {
		int Idade = AnoHoje - Ano;
		if (MesHoje < Mes || (MesHoje == Mes && DiaHoje < Dia)) {
            Idade--;
        }
		this.Idade = Idade;
	}
	
	public int InformarIdade() {
		return Idade;
	}
	
	public String InformarNome() {
		return Nome;
	}
	
	public void MudarNascimento(int Dia, int Mes, int Ano) {
		this.Dia = Dia;
		this.Mes = Mes;
		this.Ano = Ano;
	}
}
