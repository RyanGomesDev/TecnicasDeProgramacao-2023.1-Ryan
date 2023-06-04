package frontEnd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PainelDeletar extends JPanel {

	private static final long serialVersionUID = 1L;
	private Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.gray);
	private JTextField TextoNome;
	
	public PainelDeletar() {
		
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);
		
		JButton Botao = new JButton("Deletar");
		Botao.setBackground(Color.CYAN);
		
		TextoNome = new JTextField();
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(4,2));
		this.setPreferredSize(new Dimension(575,200));
		this.setBorder(Borda);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel("Matrícula:"));
		this.add(TextoNome);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(Aux);
		this.add(Botao);
		
	}
	
}
