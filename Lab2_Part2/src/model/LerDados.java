package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import backEnd.Aluno;

public class LerDados {
	
	private ArrayList<Aluno> ListaAlunos;
	 
	public LerDados() {
		ListaAlunos = new ArrayList<Aluno>();
	}

	public void lerDados(String diretorio) {
		try {
			
			FileReader Arquivo = new FileReader("dados/Alunos.txt");
			BufferedReader Leitura = new BufferedReader(Arquivo);

			while (Leitura.ready()) {
				ListaAlunos.add(separarDadosDoCliente(Leitura.readLine()));
			}
			
			Leitura.close();
		} catch (Exception e) {
			
		}
	}

	private Aluno separarDadosDoCliente(String linha) {
		
		String Dados[] = linha.split(";");
		
		Aluno AlunoAux = new Aluno(Dados[0], Dados[1], Dados[2], Dados[3]);
		
		return AlunoAux;
	}
	
	public ArrayList<Aluno> getLista(){
		return ListaAlunos;
	}
	
}
