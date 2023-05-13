package exerc03;

public class Fatura {
	
	public int Numero;
	public String Descricao;
	public int Quantidade;
	public double PrecoItem;
	public double PrecoTotalFatura;
	
	public Fatura(int numero, String descricao, int quantidade, double precoItem) {
		super();
		Numero = numero;
		Descricao = descricao;
		
		if(quantidade < 0) {
			Quantidade = 0;
		} else {
			Quantidade = quantidade;
		}
		
		if(precoItem < 0) {
			PrecoItem = 0.0;
		} else {
			PrecoItem = precoItem;
		}
	}
	
	public void setDesconto(int Porcentagem) {
		PrecoTotalFatura = PrecoTotalFatura - (PrecoTotalFatura * (Porcentagem/100));
	}
	
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public double getPrecoItem() {
		return PrecoItem;
	}

	public void setPrecoItem(double precoItem) {
		PrecoItem = precoItem;
	}
	
	public double getPrecoTotalFatura() {
		return (Quantidade * PrecoItem);
	}
	
	public void setPrecoTotalFatura(double precoFatura) {
		PrecoTotalFatura = precoFatura;
	}
}
