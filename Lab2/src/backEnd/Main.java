package backEnd;

import frontEnd.Janela;

public class Main {

	public static void main(String[] args) {
		
		BancoAlunos Banco = new BancoAlunos();
		Janela Interface = new Janela(Banco);
		Interface.tirarAviso();
		
	}

}
