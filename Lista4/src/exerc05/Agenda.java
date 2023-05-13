package exerc05;

import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Contato> Lista = new ArrayList<Contato>();
	public String Nome;
	public String Descricao;
	
	public void imprimir() {
		
		System.out.println("Agenda - " + Nome + "\nDescrição: " + Descricao + "\n");
		
		for (int i = 0; i < Lista.size(); i++) {
			System.out.println("-----------------------------------");
			System.out.println("Código: " + Lista.get(i).getCodigo() + "\nNome: " + Lista.get(i).getNome() + "\nEndereço: " 
					+ Lista.get(i).getEndereco() + "\nEmail: " + Lista.get(i).getEmail() + "\nTelefone: " + Lista.get(i).getTelefone() 
					+ "\n*Observação: " + Lista.get(i).getObservacao());
		}
		
		System.out.println("-----------------------------------");
	}
	
	public Contato duplicarContato(int codigo) {
		
		Contato Aux = new Contato(codigo);
		
		for (int i = 0; i < Lista.size(); i++) {
			
			if(Lista.get(i).getCodigo() == codigo) {
				Aux = Lista.get(i);
			}
			
		}
		
		return Aux;
		
	}
	
}