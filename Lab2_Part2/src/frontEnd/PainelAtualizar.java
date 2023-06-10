package frontEnd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import backEnd.BancoAlunos;
import model.EscreverDados;

public class PainelAtualizar extends JPanel {

	private static final long serialVersionUID = 1L;
	private EscreverDados Escrever = new EscreverDados();
	private Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.gray);
	private BancoAlunos Banco;
	private JTextField TextoMatricula;
	private JTextField TextoVertente;
	
	public PainelAtualizar(BancoAlunos banco) {
		
		Banco = banco;
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);
		
		JButton Botao = new JButton("Atualizar");
		Botao.addActionListener(new acaoAtualizar());
		Botao.setBackground(Color.CYAN);
		
		TextoMatricula = new JTextField();
		TextoVertente = new JTextField();
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(6,2));
		this.setPreferredSize(new Dimension(575,300));
		this.setBorder(Borda);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel(" Matrícula:"));
		this.add(TextoMatricula);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel(" Vertente:"));
		this.add(TextoVertente);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(Aux);
		this.add(Botao);
		
	}
	
	private class acaoAtualizar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String Mat = TextoMatricula.getText();
			String Vert = TextoVertente.getText();
			int MatVelha = 0;
			int MatNovo = 0;
			
			for (int i = 0; i < Banco.getQuantAlunos(); i++) {
				
				MatVelha = Integer.parseInt(Banco.getMatricula(i));
				MatNovo = Integer.parseInt(Mat);
				
				if(MatVelha == MatNovo) {
					Banco.setVertente(i, Vert);
					JOptionPane.showMessageDialog(null, "Aluno atualizado com SUCESSO!", "ATUALIZAÇÃO", JOptionPane.INFORMATION_MESSAGE);
					Escrever.escreverDados(Banco.formatarDados());
				}
				
			}
			
			TextoMatricula.setText("");
			TextoVertente.setText("");
		}
	}
	
}
