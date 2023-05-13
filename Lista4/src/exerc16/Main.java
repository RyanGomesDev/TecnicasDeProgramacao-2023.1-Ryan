package exerc16;

public class Main {

	public static void main(String[] args) {
		
		Elevador Predio = new Elevador(5, 3);
		
		Predio.Entrar();
		Predio.Entrar();
		System.out.println("Andar: " + Predio.getAndarAtual() + "\nPessoas: " + Predio.getPessoas());
		Predio.Sair();
		Predio.Sair();
		System.out.println("\nAndar: " + Predio.getAndarAtual() + "\nPessoas: " + Predio.getPessoas());
	}

}
