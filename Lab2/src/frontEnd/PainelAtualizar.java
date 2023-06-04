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

public class PainelAtualizar extends JPanel {

	private static final long serialVersionUID = 1L;
	private Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.gray);
	private JTextField TextoNome;
	private JTextField TextoCPF;
	
	public PainelAtualizar() {
		
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);
		
		JButton Botao = new JButton("Atualizar");
		Botao.setBackground(Color.CYAN);
		
		TextoNome = new JTextField();
		TextoCPF = new JTextField();
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(6,2));
		this.setPreferredSize(new Dimension(575,300));
		this.setBorder(Borda);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel("Matrícula:"));
		this.add(TextoNome);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel("Vertente:"));
		this.add(TextoCPF);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(Aux);
		this.add(Botao);
		
	}
	
}
