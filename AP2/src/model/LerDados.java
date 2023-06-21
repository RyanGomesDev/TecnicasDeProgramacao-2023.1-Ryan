package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import backEnd.Jogador;

public class LerDados {
	
	private ArrayList<Jogador> ListaJogadores;
	 
	public LerDados() {
		ListaJogadores = new ArrayList<Jogador>();
	}

	public void lerDados(String diretorio) {
		try {
			
			FileReader Arquivo = new FileReader("dados/Players.txt");
			BufferedReader Leitura = new BufferedReader(Arquivo);

			while (Leitura.ready()) {
				ListaJogadores.add(separarDadosDoCliente(Leitura.readLine()));
			}
			
			Leitura.close();
		} catch (Exception e) {
			
		}
	}

	private Jogador separarDadosDoCliente(String linha) {
		
		String Dados[] = linha.split(";");
		
		int Rodadas = Integer.parseInt(Dados[1]);
		int Vazias = Integer.parseInt(Dados[2]);
		int Pontos = Integer.parseInt(Dados[3]);
		int Alunos = Integer.parseInt(Dados[4]);
		int Bugs = Integer.parseInt(Dados[5]);
		int Andador = Integer.parseInt(Dados[6]);
		int Cavalo = Integer.parseInt(Dados[7]);
		int Rei = Integer.parseInt(Dados[8]);
		
		Jogador JogadorAux = new Jogador(Dados[0], Rodadas, Vazias, Pontos, Alunos, Bugs, Andador, Cavalo, Rei);
		
		return JogadorAux;
	}
	
	public ArrayList<Jogador> getLista(){
		return ListaJogadores;
	}
	
}
