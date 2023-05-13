package exerc06;

import java.util.ArrayList;
import java.util.Scanner;

public class Evento {
	
	private String Nome;
	ArrayList<Ingresso> ListaIngressos = new ArrayList<Ingresso>();
	ArrayList<IngressoVIP> ListaIngressosVIP = new ArrayList<IngressoVIP>();
	ArrayList<Double> ListaIngressosVendidos = new ArrayList<Double>();
	
	public void adicionarIngresso(double valorIngresso, int quantidade) {
		
		Scanner sc = new Scanner(System.in);
		
		while(valorIngresso < 0) {
			System.out.print("\nVALOR DO INGRESSO NORMAL INVÁLIDO! DIGITE UM VALOR MAIOR OU IGUAL 0!!\n Valor novo: R$ ");
			valorIngresso = sc.nextDouble();
		}
		
		for (int i = 0; i < quantidade; i++) {
			
			ListaIngressos.add(new Ingresso(valorIngresso));
			
		}
		sc.close();
	}
	
	public void adicionarIngressoVIP(double valorIngresso, double valorAdicional, int quantidade) {
		
		Scanner sc = new Scanner(System.in);
		
		while(valorIngresso < 0) {
			System.out.print("\nVALOR DO INGRESSO NORMAL INVÁLIDO! DIGITE UM VALOR MAIOR OU IGUAL 0!!\n Valor novo: R$ ");
			valorIngresso = sc.nextDouble();
		}
		
		while(valorAdicional < 0) {
			System.out.print("\nVALOR ADICIONAL INVÁLIDO! DIGITE UM VALOR MAIOR OU IGUAL 0!!\n Valor novo: R$ ");
			valorIngresso = sc.nextDouble();
		}
		
		for (int i = 0; i < quantidade; i++) {
			
			ListaIngressosVIP.add(new IngressoVIP(valorIngresso, valorAdicional));
			
		}
		sc.close();
	}
	
	public void comprarIngresso(double valor, int quantidade) {
		for (int i = 0; i < ListaIngressos.size(); i++) {
			if(ListaIngressos.get(i).getValor() == valor && quantidade > 0) {
				ListaIngressosVendidos.add(ListaIngressos.get(i).getValor());
				ListaIngressos.remove(i);
				quantidade--;
			}
		}
	}
	
	public void comprarIngressoVIP(double valor, int quantidade) {
		for (int i = 0; i < ListaIngressosVIP.size(); i++) {
			if(ListaIngressosVIP.get(i).getValorTotal() == valor && quantidade > 0) {
				ListaIngressosVendidos.add(ListaIngressosVIP.get(i).getValorTotal());
				ListaIngressosVIP.remove(i);
				quantidade--;
			}
		}
	}
	
	public String valorTotal() {
		
		double Total = 0;
		
		for (int i = 0; i < ListaIngressosVendidos.size(); i++) {
			
			Total = Total + ListaIngressosVendidos.get(i);
			
		}
		
		
		return "O valor total de ingressos comprados no Evento " + Nome + " foi de R$" + Total;
	}

	
	public String getNome() {
		return Nome;
	}
	

	public void setNome(String nome) {
		Nome = nome;
	}
}
