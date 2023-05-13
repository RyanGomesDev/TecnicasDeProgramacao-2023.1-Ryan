package exerc18;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Robo robo = new Robo(10, 10);
		Random random = new Random();
		int RandomX = random.nextInt(3);
		int RandomY = random.nextInt(3);
		robo.colocarMoeda(3, 4);
		robo.printarPlano();
		robo.andarNorte();
		robo.printarPlano();
		robo.andarOeste();
		robo.printarPlano();
		robo.andarNorte();
		robo.printarPlano();
		robo.contagemCasas();
	}

}
