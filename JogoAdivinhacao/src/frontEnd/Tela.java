package frontEnd;

import javax.swing.JOptionPane;

public class Tela {
	
	public void mesagem(String msg, String titulo) {
		JOptionPane.showMessageDialog(null, msg,  titulo, JOptionPane.PLAIN_MESSAGE);	
	}
	
	public String entradaDados(String msg, String titulo) {
		String nome = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
		return nome;
	}
	
}
