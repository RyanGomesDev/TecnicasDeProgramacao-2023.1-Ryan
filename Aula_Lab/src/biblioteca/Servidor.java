package biblioteca;

public class Servidor extends Cliente {

	public Servidor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Servidor";
		this.quantidade = 7;
	}

	public int verificarDias() {
		return 15;
	}

}
