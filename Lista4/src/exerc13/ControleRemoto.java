package exerc13;

public class ControleRemoto {
	
	private boolean TV = false;
	private int Volume;
	private int Canal;
	
	public void LigarDesligarTV(){
		if(TV) {
			TV = false;
			System.out.println("TV desligou!\n");
		} else {
			TV = true;
			System.out.println("TV ligou!\n");
		}
	}
	
	public void AumentarVolume() {
		if(Volume < 100 && TV == true) {
			Volume++;
		} else if(Volume >= 100 && TV == true) {
			
		} else {
			System.out.println("AVISO: a TV está desligada!\n");
		}
	}
	
	public void DiminuirVolume() {
		if(Volume > 0 && TV == true) {
			Volume--;
		} else if(Volume <= 0 && TV == true) {
			
		} else {
			System.out.println("AVISO: a TV está desligada!\n");
		}
	}
	
	public void Mutar() {
		if(TV == true) {
			Volume = 0;
		} else {
			System.out.println("AVISO: a TV está desligada!\n");
		}
	}
	
	public void AumentarCanal() {
		if(TV == true) {
			Canal++;
		} else {
			System.out.println("AVISO: a TV está desligada!\n");
		}
	}
	
	public void DiminuirCanal() {
		if(Canal > 0 && TV == true) {
			Canal--;
		}
		if(TV == false) {
			System.out.println("AVISO: a TV está desligada!\n");
		}
	}
	
	public void MudarCanal(int numero) {
		if(numero < 0) {
			System.out.println("AVISO: número inválido!\n");
		} else if(TV == true) {
			Canal = numero;
		} else {
			System.out.println("AVISO: a TV está desligada!\n");
		}
	}
	
	public void Consulta() {
		if(TV == true) {
			System.out.println("Canal: " + Canal);
			System.out.println("Volume: " + Volume + "\n");
		} else {
			System.out.println("AVISO: a TV está desligada!\n");
		}
	}
}
