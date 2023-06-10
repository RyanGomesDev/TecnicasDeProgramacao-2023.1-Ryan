package backEnd;

import java.util.ArrayList;

public class BancoAlunos {
	
	private ArrayList<Aluno> ListaAlunos = new ArrayList<Aluno>();
	
	public void adicionarAluno(String nome, String cpf, String mat, String vert) {
		ListaAlunos.add(new Aluno(nome, cpf, mat, vert));
	}
	
	public void excluirAluno(int indice) {
		ListaAlunos.remove(indice);
	}
	
	public int getQuantAlunos() {
		return ListaAlunos.size();
	}
	
	public String formatarDados() {
		
		String Saida = "";
		
		for (Aluno Aluno : ListaAlunos) {
			Saida += Aluno.getNome() + ";" + Aluno.getCPF() + ";" + Aluno.getMatricula() + ";" + Aluno.getVertente() + "\n" ;
		}
		
		return Saida;
	}
	
	public void setListaAlunos(ArrayList<Aluno> lista) {
		ListaAlunos = lista;
	}
	
	public String getNome(int indice) {
		return ListaAlunos.get(indice).getNome();
	}
	
	public String getCPF(int indice) {
		return ListaAlunos.get(indice).getCPF();
	}
	
	public String getMatricula(int indice) {
		return ListaAlunos.get(indice).getMatricula();
	}
	
	public String getVertente(int indice) {
		return ListaAlunos.get(indice).getVertente();
	}
	
	public void setVertente(int indice, String str) {
		ListaAlunos.get(indice).setVertente(str);;
	}
	
}
