package exerc06;

public class Main {

	public static void main(String[] args) {
		
		Evento Calourada = new Evento();
		
		Calourada.setNome("Computaria");
		
		Calourada.adicionarIngresso(10, 10);        // 1° Parâmetro: Valor Normal / 2° Parâmetro: Quantidade
		Calourada.adicionarIngressoVIP(10, 10, 5);  // 1° Parâmetro: Valor Normal / 2° Parâmetro: Valor Adicional /3° Parâmetro: Quantidade
		
		Calourada.comprarIngresso(10, 5);    // 1° Parâmetro: Valor Normal / 2° Parâmetro: Quantidade
		Calourada.comprarIngressoVIP(20, 2); // 1° Parâmetro: Valor Normal do segundo ingresso + Valor Adicional / 2° Parâmetro: Quantidade
		
		System.out.println(Calourada.ListaIngressos.get(0).toString());
		System.out.println(Calourada.ListaIngressosVIP.get(0).toString());
		System.out.println(Calourada.valorTotal());
		
	}

}
