package backEnd;

import java.util.ArrayList;

public class BancoAlunos {
	
	private ArrayList<Aluno> ListaAlunos = new ArrayList<Aluno>();
	
	public void adicionarAluno(String nome, String cpf, String mat, String vert) {
		ListaAlunos.add(new Aluno(nome, cpf, mat, vert));
	}
	
	public int getQuantAlunos() {
		return ListaAlunos.size();
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
	
}
