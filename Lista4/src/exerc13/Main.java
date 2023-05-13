package exerc13;

public class Main {

	public static void main(String[] args) {
		
		ControleRemoto Sala = new ControleRemoto();
		
		Sala.LigarDesligarTV();
		
		for (int i = 0; i < 100; i++) {
			Sala.AumentarVolume();
		}
		
		for (int i = 0; i < 25; i++) {
			Sala.AumentarCanal();
		}
		
		Sala.Consulta();
		Sala.MudarCanal(66);
		Sala.LigarDesligarTV();
		Sala.DiminuirVolume();
		Sala.LigarDesligarTV();
		Sala.Consulta();
		Sala.Mutar();
		Sala.Consulta();
	}

}
