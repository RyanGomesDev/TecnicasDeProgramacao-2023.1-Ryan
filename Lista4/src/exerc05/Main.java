package exerc05;

public class Main {

	public static void main(String[] args) {
		Cliente Messias = new Cliente();
		Messias.agenda = new Agenda();
		Contato Pai = new Contato(1000, "Francisco", "francisco@exemple.com");
		Contato Mae = new Contato(2000, "Maria", "maria@exemple.com");
		
		Pai.setEndereco("Rua do Tiradentes, Centro");
		Mae.setEndereco("Rua do Tiradentes, Centro");
		Pai.setTelefone("92998800");
		Mae.setTelefone("92445566");
		Pai.setObservacao("Trocou de número recentemente.");
		Mae.setObservacao("Aniversário próxima semana!");
		
		Messias.agenda.Nome = "Família";
		Messias.agenda.Descricao = "Contatos do Pai e da Mãe";
		Messias.agenda.Lista.add(Pai);
		Messias.agenda.Lista.add(Mae);
		
		Messias.agenda.imprimir();
		Messias.agenda.Lista.add(Messias.agenda.duplicarContato(2000));
		Messias.agenda.imprimir();
	}
	
}
