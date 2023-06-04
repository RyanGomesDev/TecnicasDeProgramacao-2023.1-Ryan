package backEnd;

public class Aluno {
	
	private String Nome = "";
	private String CPF = "";
	private String Matricula = "";
	private String Vertente = "";
	
	public Aluno(String nome, String CPF, String matricula, String vertente) {
		Nome = nome;
		this.CPF = CPF;
		Matricula = matricula;
		Vertente = vertente;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getVertente() {
		return Vertente;
	}
	public void setVertente(String vertente) {
		Vertente = vertente;
	}
}
