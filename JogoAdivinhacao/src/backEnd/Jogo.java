package backEnd;

import frontEnd.*;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
	
	private Jogador jogador;
	private Tela tela;
	private int numeroEscolhido;
	private boolean jogando;
	private Random random;

	public Jogo() {
		tela = new Tela();
		jogador = new Jogador();
		random = new Random();
		numeroEscolhido = random.nextInt(10);;
		jogando = true;
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual é o seu nome?", "JOGO DE ADIVINHAÇÃO"));
		
		if(jogador.getNome() == null) {
			System.exit(0);
		}
		
		tela.mesagem("Seja bem vindo: " + jogador.getNome() + "!", "BEM-VINDO");
		jogadas();
	}

	public int solicitarNumero() {
		
		int NumeroEscolhido = 0;
		int Verificador = 0;
		String numero = tela.entradaDados("Informe um numero:", "TENTATIVA "+ (jogador.getNumeroTentativa()+1));
		
		if(numero == null) {
			System.exit(0);
		}
		
		do {
			
			if(numero == null) {
				System.exit(0);
			}
			
			try {
				NumeroEscolhido = Integer.parseInt(numero);
				Verificador = 0;
			} catch (NumberFormatException e) {
				tela.mesagem("DIGITE APENAS NÚMEROS INTEIROS!", "VALOR INVÁLIDO");
				numero = tela.entradaDados("Informe um numero:", "TENTATIVA "+ (jogador.getNumeroTentativa()+1));
				Verificador = 1;
			}
			
		} while (Verificador == 1);
		
		return NumeroEscolhido;
	}

	public void jogadas() {
		
		do {
			verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "\n";
		ArrayList<Integer> Aux = new ArrayList<Integer>();
		Aux = jogador.getListaNumeros();
		
		for (int i = 0; i < Aux.size(); i++) {
			numeros += " - " + Aux.get(i) + "\n";
		}
		
		tela.mesagem("Números apostados: " + numeros, "FIM DO JOGO");
	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido) {
			return true;
		}
		return false;
	}

	public void verificarAcerto() {
		
		int numero = solicitarNumero();
		jogador.addNumero(numero);
		
		if (numero == numeroEscolhido) {
			
			jogador.setNumeroTentativa();
			tela.mesagem("Parabéns você acertou! Número de tentativas: " + jogador.getNumeroTentativa() + "!", "PARABÉNS");
			jogando = false;
			
		} else {
			jogador.setNumeroTentativa();

			if (verificarMenor(numero)) {
				tela.mesagem("Deu ruim, você errou! Tente um número maior!", "NÚMERO ERRADO");
			} else {
				tela.mesagem("Deu ruim, você errou! Tente um número menor!", "NÚMERO ERRADO");
			}
		}
	}
}
