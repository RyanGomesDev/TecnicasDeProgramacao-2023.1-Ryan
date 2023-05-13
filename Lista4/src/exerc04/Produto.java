package exerc04;

public class Produto {
	
	public String Nome;
	public double Preco;
	public int Quantidade;
	public boolean AVenda;
	
	
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		Nome = nome;
		
		if(preco <= 0) {
			Preco = 0.0;
		} else if(preco > 0 && preco <= 100) {
			Preco = preco;
		} else if(preco > 100 && preco <= 200) {
			Preco = preco - (preco * 0.1);
		} else if(preco > 200 && preco <= 500) {
			Preco = preco - (preco * 0.2);
		} else {
			Preco = preco - (preco * 0.25);
		}
		
		Quantidade = quantidade;
		AVenda = true;
	}

	public double valorTotal() {
		return (Preco * Quantidade);
	}

	public void comprarProduto() {
		AVenda = false;
	}
	
}
