package exerc03;

public class Main {

	public static void main(String[] args) {
		
		Fatura Biscoito = new Fatura(1, "Biscoito de Chocolate - Richester", 10, 2.50);
		
		System.out.println("<Fatura de Items>\n");
		System.out.print("Descrição: " + Biscoito.getDescricao() + "\nPreço: R$" + Biscoito.getPrecoItem() + "\nQuantidade: "
				+ Biscoito.getQuantidade() + "\nFatura Totoal: R$" + Biscoito.getPrecoTotalFatura());
		
	}

}
