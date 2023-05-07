package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Emprestimo> listaEmprestimo;
	private ArrayList<Publicacao> listaPublicacao;
	private ArrayList<Cliente> listaCliente;
	
	public Biblioteca() {
	   listaEmprestimo = new ArrayList<Emprestimo>();
	   listaPublicacao = new ArrayList<Publicacao>();
	   listaCliente = new ArrayList<Cliente>();
	}
	
	public void listarPublicacoes() {
		
		int Cont1 = 1;
		int Cont2 = 1;
		int Cont3 = 1;
		
		System.out.println("\nLIVROS:\n");
		
		for (int i = 0; i < listaPublicacao.size(); i++) {
			if((listaPublicacao.get(i)) instanceof Livro){
				System.out.println(Cont1 + " - " + listaPublicacao.get(i).titulo + "; Ano: " + listaPublicacao.get(i).ano + "; Autor: " 
						+ listaPublicacao.get(i).autor + "; Quantidade: " + listaPublicacao.get(i).quantidadeDisponivel + ".");
				Cont1++;
			}
		}
		
		System.out.println("\nARTIGOS:\n");
		
		for (int i = 0; i < listaPublicacao.size(); i++) {
			if((listaPublicacao.get(i)) instanceof Artigo){
				System.out.println(Cont2 + " - " + listaPublicacao.get(i).titulo + "; Ano: " + listaPublicacao.get(i).ano + "; Autor: " 
						+ listaPublicacao.get(i).autor + "Quantidade: " + listaPublicacao.get(i).quantidadeDisponivel + ".");
				Cont2++;
			}
		}
		
		System.out.println("\nREVISTAS:\n");
		
		for (int i = 0; i < listaPublicacao.size(); i++) {
			if((listaPublicacao.get(i)) instanceof Revista){
				System.out.println(Cont3 + " - " + listaPublicacao.get(i).titulo + "; Ano: " + listaPublicacao.get(i).ano + "; Autor: " 
						+ listaPublicacao.get(i).autor + "; Quantidade: " + listaPublicacao.get(i).quantidadeDisponivel + ".");
				Cont3++;
			}
		}
		
	}
	
	public void listarClientes() {
		
		int Cont1 = 1;
		int Cont2 = 1;
		int Cont3 = 1;
		
		System.out.println("\nALUNOS:\n");
		
		for (int i = 0; i < listaCliente.size(); i++) {
			if((listaCliente.get(i)) instanceof Aluno){
				System.out.println(Cont1 + " - " + listaCliente.get(i).nome + "; Matrícula: " + listaCliente.get(i).matricula + "; TPs: " 
						+ listaCliente.get(i).tps + ".");
				Cont1++;
			}
		}
		
		System.out.println("\nPROFESSORES:\n");
		
		for (int i = 0; i < listaCliente.size(); i++) {
			if((listaCliente.get(i)) instanceof Professor){
				System.out.println(Cont2 + " - " + listaCliente.get(i).nome + "; Matrícula: " + listaCliente.get(i).matricula + "; TPs: " 
						+ listaCliente.get(i).tps + ".");
				Cont2++;
			}
		}
		
		System.out.println("\nSERVIDORES:\n");
		
		for (int i = 0; i < listaCliente.size(); i++) {
			if((listaCliente.get(i)) instanceof Servidor){
				System.out.println(Cont3 + " - " + listaCliente.get(i).nome + "; Matrícula: " + listaCliente.get(i).matricula + "; TPs: " 
						+ listaCliente.get(i).tps + ".");
				Cont3++;
			}
		}
	}
	
	public void consultarCliente(int matricula) {
		
		int Cont = 1;
		
		System.out.println("\nO(A) Clinte com matrícula " + matricula + " fez emprestímos das seguintes publicações: \n");
		
		for (int i = 0; i < listaEmprestimo.size(); i++) {
			
			if(listaEmprestimo.get(i).getCliente().matricula == matricula) {
				System.out.println(Cont + " - " + listaEmprestimo.get(i).getPublicacao().tipo + ": " + listaEmprestimo.get(i).getPublicacao().titulo
						+ "; Autor: " + listaEmprestimo.get(i).getPublicacao().autor + "; Ano: " + listaEmprestimo.get(i).getPublicacao().ano);
				Cont++;
			}
			
		}
		
	}
	
	public void buscar(String palavra) {
		 
		int Cont = 1;
		
		System.out.println("RESULTADO DA PESQUISA: " + palavra);
		
		for (int i = 0; i < listaPublicacao.size(); i++) {
			if(listaPublicacao.get(i).titulo.contains(palavra)) {
				System.out.println(Cont + " - " + listaPublicacao.get(i).titulo + "; Ano: " + listaPublicacao.get(i).ano + "; Autor: " 
						+ listaPublicacao.get(i).autor + "; Quantidade: " + listaPublicacao.get(i).quantidadeDisponivel + ".");
			}
		}
		
	}
	
	public void addEmprestimo(Emprestimo e) {
		listaEmprestimo.add(e);
	}
	
	public void addPublicacao(Publicacao publicacao) {
		listaPublicacao.add(publicacao);
	}
	
	public void addCliente(Cliente cliente) {
		listaCliente.add(cliente);
	}
	
	public Cliente getCliente(int matricula) {
		
		ArrayList<Cliente> Aux = new ArrayList<Cliente>();
		
		for (int i = 0; i < listaCliente.size(); i++) {
			if(listaCliente.get(i).matricula == matricula) {
				Aux.add(listaCliente.get(i));
			}
		}
		return Aux.get(Aux.size()-1);
	}
	
	public Publicacao getPublicacao(int id) {
		
		ArrayList<Publicacao> Aux2 = new ArrayList<Publicacao>();
		
		for (int i = 0; i < listaPublicacao.size(); i++) {
			if(listaPublicacao.get(i).id == id) {
				Aux2.add(listaPublicacao.get(i));
			}
		}
		return Aux2.get(Aux2.size()-1);
	}
	
}
