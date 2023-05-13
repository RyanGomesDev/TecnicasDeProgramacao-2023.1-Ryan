package exerc04;

public class Main {

	public static void main(String[] args) {
		
		Produto Geladeira = new Produto("Geladeira BRASTEMP 4 Portas", 400, 10);
		Produto Ventilador = new Produto("Ventilador ARNO", 150, 15);
		Produto Carro = new Produto("Carro da marca Palio - Azul", 1000, 5);
		
		System.out.println("<Compra de Produtos>\n");
		System.out.println("Nome do Produto: " + Geladeira.Nome + "\nValor Total: R$" + Geladeira.valorTotal());
		System.out.println("-----------------------------------------------");
		System.out.println("Nome do Produto: " + Ventilador.Nome + "\nValor Total: R$" + Ventilador.valorTotal());
		System.out.println("-----------------------------------------------");
		System.out.println("Nome do Produto: " + Carro.Nome + "\nValor Total: R$" + Carro.valorTotal());
	}

}
