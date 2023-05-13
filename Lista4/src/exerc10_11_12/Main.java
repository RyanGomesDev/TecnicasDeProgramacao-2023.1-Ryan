package exerc10_11_12;

public class Main {

	public static void main(String[] args) {
		
		Pessoa Fulano = new Pessoa("Fulano Cunha", "92885566");
		Empregado Ciclano = new Empregado("Ciclano Jr.", "92331166", 21, 1000, 100);
		Operario Alexandre = new Operario("Alexandre Silva", "96441133", 25, 1500, 150, 500, 20);
		Vendedor Maria = new Vendedor("Maria Joaquina", "99667788", 15, 2000, 200, 750, 15);
		
		System.out.println(Fulano.getNome());
		System.out.println(Fulano.getTelefone());
		System.out.println("---------------------------------------------");
		System.out.println(Ciclano.getNome());
		System.out.println(Ciclano.getTelefone());
		System.out.println("O sálario de " + Ciclano.getNome() + " é R$ " + Ciclano.calcularSalario() + "!");
		System.out.println("---------------------------------------------");
		System.out.println(Alexandre.getNome());
		System.out.println(Alexandre.getTelefone());
		System.out.println("O sálario de " + Alexandre.getNome() + " é R$ " + Alexandre.calcularSalario() + "!");
		System.out.println("---------------------------------------------");
		System.out.println(Maria.getNome());
		System.out.println(Maria.getTelefone());
		System.out.println("O sálario de " + Maria.getNome() + " é R$ " + Maria.calcularSalario() + "!");
	}

}
