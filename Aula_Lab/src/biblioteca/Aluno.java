package biblioteca;

public class Aluno extends Cliente {

	public Aluno(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Aluno";
		this.quantidade = 5;
	}

	public int verificarDias() {
		return 10;
	}
	

}
