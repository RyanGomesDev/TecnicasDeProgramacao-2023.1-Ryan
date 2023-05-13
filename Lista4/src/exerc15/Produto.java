package exerc15;

public class Produto {
	
	private String Nome;
	private double PrecoCusto;
	private double PrecoVenda;
	private double MargemLucro;
	private double Despesas;
	
	public Produto(String nome, double precoCusto, double precoVenda, double despesas) {
		Nome = nome;
		PrecoCusto = precoCusto;
		PrecoVenda = precoVenda;
		Despesas = despesas;
	}
	
	public void CalcularMargem() {
		MargemLucro = ((PrecoVenda - (PrecoCusto + Despesas)) / PrecoVenda) * 100;
	}

	
	public String getNome() {
		return Nome;
	}
	

	public void setNome(String nome) {
		Nome = nome;
	}
	

	public double getPrecoCusto() {
		return PrecoCusto;
	}
	

	public void setPrecoCusto(double precoCusto) {
		PrecoCusto = precoCusto;
	}
	

	public double getPrecoVenda() {
		return PrecoVenda;
	}
	

	public void setPrecoVenda(double precoVenda) {
		PrecoVenda = precoVenda;
	}
	

	public double getMargemLucro() {
		return MargemLucro;
	}
	

	public void setMargemLucro(double margemLucro) {
		MargemLucro = margemLucro;
	}
	

	public double getDespesas() {
		return Despesas;
	}
	

	public void setDespesas(double despesas) {
		Despesas = despesas;
	}
}
