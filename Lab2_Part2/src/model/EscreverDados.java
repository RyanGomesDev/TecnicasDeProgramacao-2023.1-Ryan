package model;

import java.io.FileWriter;

public class EscreverDados {
	
	public void escreverDados(String mensagem) {

		try {

			FileWriter arquivo = new FileWriter("dados/Alunos.txt");
			arquivo.write(mensagem);
			arquivo.close();

		} catch (Exception e) {
			
		}
	}
}
