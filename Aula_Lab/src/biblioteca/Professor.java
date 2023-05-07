package biblioteca;

public class Professor extends Cliente {

	public Professor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Professor";
		this.quantidade = 10;
	}

	public int verificarDias() {
		return 20;
	}

}
