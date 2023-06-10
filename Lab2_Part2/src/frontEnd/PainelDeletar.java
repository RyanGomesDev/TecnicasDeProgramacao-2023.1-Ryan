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

public class PainelDeletar extends JPanel {

	private static final long serialVersionUID = 1L;
	private EscreverDados Escrever = new EscreverDados();
	private Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.gray);
	private BancoAlunos Banco;
	private JTextField TextoMatricula;
	
	public PainelDeletar(BancoAlunos banco) {
		
		Banco = banco;
		
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);
		
		JButton Botao = new JButton("Deletar");
		Botao.addActionListener(new acaoDeletar());
		Botao.setBackground(Color.CYAN);
		
		TextoMatricula = new JTextField();
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(4,2));
		this.setPreferredSize(new Dimension(575,200));
		this.setBorder(Borda);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel(" Matrícula:"));
		this.add(TextoMatricula);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(Aux);
		this.add(Botao);
		
	}
	
	private class acaoDeletar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String Mat = TextoMatricula.getText();
			int MatVelha = 0;
			int MatNovo = 0;
			
			for (int i = 0; i < Banco.getQuantAlunos(); i++) {
				
				MatVelha = Integer.parseInt(Banco.getMatricula(i));
				MatNovo = Integer.parseInt(Mat);
				
				if(MatVelha == MatNovo) {
					Banco.excluirAluno(i);
					JOptionPane.showMessageDialog(null, "Aluno deletado com SUCESSO!", "DELETAR ALUNO", JOptionPane.INFORMATION_MESSAGE);
					Escrever.escreverDados(Banco.formatarDados());
				}
				
			}
			
			TextoMatricula.setText("");
		}
	}
	
}
