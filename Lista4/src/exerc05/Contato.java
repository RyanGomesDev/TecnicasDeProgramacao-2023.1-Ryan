package exerc05;

import java.util.Scanner;

public class Contato {
	
	private int Codigo;
	private String Nome;
	private String Endereco;
	private String Email;
	private String Telefone;
	private String Observacao;
	Scanner sc = new Scanner(System.in);
	
	public Contato(int codigo) {
		super();
		
		if(codigo >= 1000 && codigo <= 9999) {
			Codigo = codigo;
		} else {
			do {
				System.out.println("\nCÓDIGO INVÁLIDO! DIGITE UM VALOR ENTRE 1000 E 9999!\n");
				System.out.print("Digite um novo código para o contato " + Nome + ": ");
				codigo = sc.nextInt();
			} while(codigo < 1000 || codigo > 9999);
			Codigo = codigo;
		}
	}

	public Contato(int codigo, String nome) {
		super();
		
		if(codigo >= 1000 && codigo <= 9999) {
			Codigo = codigo;
		} else {
			do {
				System.out.println("\nCÓDIGO INVÁLIDO! DIGITE UM VALOR ENTRE 1000 E 9999!\n");
				System.out.print("Digite um novo código para o contato " + Nome + ": ");
				codigo = sc.nextInt();
			} while(codigo < 1000 || codigo > 9999);
			Codigo = codigo;
		}
		
		Nome = nome;
	}

	public Contato(int codigo, String nome, String email) {
		super();
		
		if(codigo >= 1000 && codigo <= 9999) {
			Codigo = codigo;
		} else {
			do {
				System.out.println("\nCÓDIGO INVÁLIDO! DIGITE UM VALOR ENTRE 1000 E 9999!\n");
				System.out.print("Digite um novo código para o contato " + Nome + ": ");
				codigo = sc.nextInt();
			} while(codigo < 1000 || codigo > 9999);
			Codigo = codigo;
		}
		
		Nome = nome;
		Email = email;
	}

	public Contato(String telefone) {
		super();
		
		if(telefone.length() == 8) {
			Telefone = telefone;
		} else {
			do {
				System.out.println("\nTELEFONE INVÁLIDO! DIGITE UM NÚMERO QUE TENHA 8 DIGÍTOS!\n");
				System.out.print("Digite um novo telefone para o contato " + Nome + ": ");
				telefone = sc.nextLine();
			} while(telefone.length() < 8 || telefone.length() > 8);
			Telefone = telefone;
		}
	}
	
	public boolean preenchido() {
		int Validar = 0;
		
		if(Codigo == 0 || Nome.length() == 0 || Endereco.length() == 0 || Email.length() == 0 || Telefone.length() == 0 || Observacao.length() == 0) {
			Validar++;
		}
		
		if(Validar > 0) {
			return false;
		} else {
			return true;
		}
		
	}

	public int getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(int codigo) {
		if(codigo >= 1000 && codigo <= 9999) {
			Codigo = codigo;
		} else {
			do {
				System.out.println("\nCÓDIGO INVÁLIDO! DIGITE UM VALOR ENTRE 1000 E 9999!\n");
				System.out.print("Digite um novo código para o contato " + Nome + ": ");
				codigo = sc.nextInt();
			} while(codigo < 1000 || codigo > 9999);
			Codigo = codigo;
		}
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getTelefone() {
		return Telefone;
	}
	
	public void setTelefone(String telefone) {
		
		if(telefone.length() == 8) {
			Telefone = telefone;
		} else {
			do {
				System.out.println("\nTELEFONE INVÁLIDO! DIGITE UM NÚMERO QUE TENHA 8 DIGÍTOS!\n");
				System.out.print("Digite um novo telefone para o contato " + Nome + ": ");
				telefone = sc.nextLine();
			} while(telefone.length() < 8 || telefone.length() > 8);
			Telefone = telefone;
		}
		
	}
	
	public String getObservacao() {
		return Observacao;
	}
	
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	
}
