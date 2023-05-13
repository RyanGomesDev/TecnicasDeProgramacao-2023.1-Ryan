package exerc02;

public class Main {

	public static void main(String[] args) {
		
		Empregado Enfermeiro = new Empregado("José", "Antônio", -2000);
		
		Empregado Medica = new Empregado("Maria", "Eduarda", 3000);
		
		System.out.println("<Salários Anuais de cada Empregado>\n");
		System.out.println(Enfermeiro.getNome() + " " + Enfermeiro.getSobrenome() + " - R$" + (Enfermeiro.getSalario()*12));
		System.out.println(Medica.getNome() + " " + Medica.getSobrenome() + " - R$" + (Medica.getSalario()*12) + "\n");
		
		Enfermeiro.setSalario(Enfermeiro.getSalario() + (Enfermeiro.getSalario()*0.1));
		Medica.setSalario(Medica.getSalario() + (Medica.getSalario()*0.1));
		
		System.out.println("Salário Anual mas com um aumento de 10%:\n");
		System.out.println(Enfermeiro.getNome() + " " + Enfermeiro.getSobrenome() + " - R$" + (Enfermeiro.getSalario()*12));
		System.out.print(Medica.getNome() + " " + Medica.getSobrenome() + " - R$" + (Medica.getSalario()*12));
	}

}
