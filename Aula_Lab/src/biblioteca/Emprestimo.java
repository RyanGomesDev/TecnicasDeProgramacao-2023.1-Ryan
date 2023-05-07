package biblioteca;

public class Emprestimo {

	private Cliente cliente;
	private Publicacao publicacao;

	public Emprestimo(Cliente cliente, Publicacao publicacao) {
		
		if(cliente.quantidade <= 0) {
			System.out.println("AVISO: O(A) " + cliente.tipo + " " + cliente.nome + " atingiu o número máximo de publicações que pode pegar!");
		}
		
		if((cliente) instanceof Aluno && cliente.quantidade > 0) {
			
			if((publicacao) instanceof Livro) {
				cliente.tps -= 9;
				
				if(((-1 * cliente.tps) % 50) == 0) {
					System.out.println("AVISO: O(A) " + cliente.tipo + " " + cliente.nome + " deve doar uma publicação para a Biblioteca!");
				}
				
			}
			
			if((publicacao) instanceof Revista) {
				cliente.tps -= 9.9;
				
				if(((-1 * cliente.tps) % 50) == 0) {
					System.out.println("AVISO: O(A) " + cliente.tipo + " " + cliente.nome + " deve doar uma publicação para a Biblioteca!");
				}
				
			}
			
			if((publicacao) instanceof Livro) {
				cliente.tps -= 5;
				
				if(((-1 * cliente.tps) % 50) == 0) {
					System.out.println("AVISO: O(A) " + cliente.tipo + " " + cliente.nome + " deve doar uma publicação para a Biblioteca!");
				}
				
			}
			
			cliente.quantidade--;
			this.cliente = cliente;
		}
		
		if((cliente) instanceof Professor && cliente.quantidade > 0) {
			cliente.tps -= 25;
			
			if(((-1 * cliente.tps) % 50) == 0) {
				System.out.println("AVISO: O(A) " + cliente.tipo + " " + cliente.nome + " deve doar uma publicação para a Biblioteca!");
			}
			
			cliente.quantidade--;
			this.cliente = cliente;
		}
		
		if((cliente) instanceof Servidor && cliente.quantidade > 0) {
			cliente.tps -= 15;
			
			if(((-1 * cliente.tps) % 50) == 0) {
				System.out.println("AVISO: O(A) " + cliente.tipo + " " + cliente.nome + " deve doar uma publicação para a Biblioteca!");
			}
			
			cliente.quantidade--;
			this.cliente = cliente;
		}
		
		if(publicacao.quantidadeDisponivel > 0) {
			publicacao.quantidadeDisponivel--;
			System.out.println("\nO(A) " + cliente.tipo + " " + cliente.nome + " tem " + cliente.verificarDias() + " dias para devolver o(a) " + publicacao.tipo + "!");
			this.publicacao = publicacao;
		} else {
			System.out.println("AVISO: Não tem mais exemplares disponíveis dessa publicação!");
		}
		
	}


	public Cliente getCliente() {
		return cliente;
	}
	

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	public Publicacao getPublicacao() {
		return publicacao;
	}
	

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
}
