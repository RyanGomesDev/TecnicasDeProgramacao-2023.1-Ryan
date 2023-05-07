package biblioteca;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int Opcao = 1;
		
		Biblioteca UFC = new Biblioteca();
		
		do {
			
			do {
				System.out.println("\n\t\t\t| Biblioteca UFC |\n\n"
						+ "| 1 | Adicionar uma Publicação a Biblioteca.\n"
						+ "| 2 | Adicionar um Cliente a Biblioteca.\n"
						+ "| 3 | Fazer Empréstimo de uma Publicação.\n"
						+ "| 4 | Listar todas as Publicações.\n"
						+ "| 5 | Listar todos os Clientes.\n"
						+ "| 6 | Consultar Cliente.\n"
						+ "| 7 | Busca de Publicação.\n"
						+ "| 8 | Sair do programa.\n");
				System.out.print("OPÇÃO: ");

		        Opcao = sc.nextInt();
				
				if(Opcao < 1 || Opcao > 8) {
					System.out.println("\nOPÇÃO INVÁLIDA! DIGITE NOVAMENTE!\n");
				}
				
			} while(Opcao < 1 || Opcao > 8);
			
			if(Opcao == 1) {
				adicionarPublicacao(UFC);
			}
			if(Opcao == 2) {
				adicionarCliente(UFC);
			}
			if(Opcao == 3) {
				fazerEmprestimo(UFC);
			}
			if(Opcao == 4) {
				UFC.listarPublicacoes();
			}
			if(Opcao == 5) {
				UFC.listarClientes();
			}
			if(Opcao == 6) {
				consultar(UFC);
			}
			if(Opcao == 7) {
				buscarPublicacao(UFC);
			}
			
		} while(Opcao != 8 || Opcao != 8);
		sc.close();
	}
	
	public static void adicionarPublicacao(Biblioteca ufc) {
		
		String Titulo;
		int Ano;
		String Autor;
		int Quantidade;
		int ID;
		
		System.out.print("\nTipos de Publicações:\n\n"
				+ "| 1 | Artigo\n"
				+ "| 2 | Livro\n"
				+ "| 3 | Revista\n\nOPÇÃO: ");
		int Opcao = sc.nextInt();
		
		System.out.print("\nDigite o título da Publicação: ");
		Titulo = sc.next();
		System.out.print("Digite o ano da Publicação: ");
		Ano = sc.nextInt();
		System.out.print("Digite o autor da Publicação: ");
		Autor = sc.next();
		System.out.print("Digite a quantidade disponíveis da Publicação: ");
		Quantidade = sc.nextInt();
		System.out.print("Digite um ID para se referir à Publicação: ");
		ID = sc.nextInt();
		System.out.println("\nPUBLICAÇÃO ADICIONADA COM SUCESSO!");
		
		if(Opcao == 1) {
			Artigo Aux = new Artigo(Titulo, Ano, Autor, Quantidade, ID);
			ufc.addPublicacao(Aux);
		}
		if(Opcao == 2) {
			Livro Aux = new Livro(Titulo, Ano, Autor, Quantidade, ID);
			ufc.addPublicacao(Aux);
		}
		if(Opcao == 3) {
			Revista Aux = new Revista(Titulo, Ano, Autor, Quantidade, ID);
			ufc.addPublicacao(Aux);
		}
	}
	
	public static void adicionarCliente(Biblioteca ufc) {
		
		
		int Matricula;
		String Nome;
		
		System.out.print("\nQual o tipo de Cliente que deseja cadastrar?:\n\n"
				+ "| 1 | Aluno\n"
				+ "| 2 | Professor\n"
				+ "| 3 | Servidor\n\nOPÇÃO: ");
		int Op = sc.nextInt();
		
		System.out.print("\nDigite o nome do Cliente: ");
		Nome = sc.next();
		System.out.print("Digite a matrícula do Cliente: ");
		Matricula = sc.nextInt();
		System.out.println("\nCLIENTE CADASTRADO COM SUCESSO!");
		
		if(Op == 1) {
			Aluno Aux = new Aluno(Matricula, Nome);
			ufc.addCliente(Aux);
		}
		if(Op == 2) {
			Professor Aux = new Professor(Matricula, Nome);
			ufc.addCliente(Aux);
		}
		if(Op == 3) {
			Servidor Aux = new Servidor(Matricula, Nome);
			ufc.addCliente(Aux);
		}
	}
	
	public static void fazerEmprestimo(Biblioteca ufc) {
		
		int Matricula;
		int ID;
		
		System.out.println("\n| EMPRESTÍMO |\n");
		System.out.print("Digite a matrícula do Cliente: ");
		Matricula = sc.nextInt();
		System.out.print("Digite o ID da Publicação: ");
		ID = sc.nextInt();
		
		Emprestimo Aux = new Emprestimo(ufc.getCliente(Matricula), ufc.getPublicacao(ID));
		ufc.addEmprestimo(Aux);
	}
	
	public static void consultar(Biblioteca ufc) {
		
		int Matricula;
		
		System.out.print("\nDigite a matrícula do Cliente que deseja consultar: ");
		Matricula = sc.nextInt();
		
		ufc.consultarCliente(Matricula);
	}

	public static void buscarPublicacao(Biblioteca ufc) {
		
		String Palavra;
		
		System.out.print("\nDigite a palavra que deseja buscar: ");
		Palavra = sc.next();
		System.out.println("");
		
		ufc.buscar(Palavra);
	}
}
