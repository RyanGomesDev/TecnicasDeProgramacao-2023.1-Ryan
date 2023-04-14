
public class Exerc17_18 {
	
	public static String inverterString(String Expressao) {
		
		String ExpInversa = new StringBuilder(Expressao).reverse().toString();
		
		return ExpInversa;
	}
	
	public static double jurosCompostos(float ValorInicial, double Juros, int Periodo) {
		
		double ValorTotal = 0;
		double JurosTotal = 1 + Juros;
		double Aux = JurosTotal;
		
		for (int i = 1; i < Periodo; i++) {
			JurosTotal = JurosTotal * Aux;
		}
		
		ValorTotal = ValorInicial * JurosTotal;
		
		return ValorTotal;
	}
	
	public static void main(String[] args) {
		
		float ValorInicial = 1000;
		double Juros = 0.05;
		int Periodo = 3;
		String Expressao = "Ryan Gomes";
		
		System.out.println("<Inversão de String e Cálculo de Juros Compostos>\n");
		System.out.println("--> String Inversa <--\n");
		
		System.out.println("A string '" + Expressao + "' na forma inversa é '" + inverterString(Expressao) + "'!\n");
		
		System.out.println("--> Juros Compostos <--\n");
		
		System.out.format("O valor final do capital R$%.2f com juros de %.2f em um período de %d meses foi de R$%.2f!", ValorInicial, Juros, Periodo, jurosCompostos(ValorInicial, Juros, Periodo));
		
	}

}
