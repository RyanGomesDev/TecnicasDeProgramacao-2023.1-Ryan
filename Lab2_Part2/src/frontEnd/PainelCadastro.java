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

public class PainelCadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	private EscreverDados Escrever = new EscreverDados();
	private Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.gray);
	private BancoAlunos Banco;
	private JTextField TextoNome;
	private JTextField TextoCPF;
	private JTextField TextoMatricula;
	private JTextField TextoVertente;
	
	public PainelCadastro(BancoAlunos banco) {
		
		Banco = banco;
		
		JPanel Aux = new JPanel();
		Aux.setBackground(Color.LIGHT_GRAY);
		
		JButton Botao = new JButton("Cadastrar");
		Botao.setBackground(Color.CYAN);
		Botao.addActionListener(new acaoCadastrar());
		
		TextoNome = new JTextField();
		TextoCPF = new JTextField();
		TextoMatricula = new JTextField();
		TextoVertente = new JTextField();
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(14,2));
		this.setPreferredSize(new Dimension(575,500));
		this.setBorder(Borda);
		
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel(" Nome:"));
		this.add(TextoNome);
		
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel(" CPF:"));
		this.add(TextoCPF);
		
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel(" Matrícula:"));
		this.add(TextoMatricula);
		
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		
		this.add(new JLabel(" Vertente:"));
		this.add(TextoVertente);
		
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		this.add(Aux);
		
		this.add(Aux);
		this.add(Botao);
	}
	
	private class acaoCadastrar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String Nome = TextoNome.getText();
			String CPF = TextoCPF.getText();
			String Mat = TextoMatricula.getText();
			String Vert = TextoVertente.getText();
			int MatVelha = 0;
			int MatNovo = 0;
			int Cont = 0;
			
			TextoNome.setText("");
			TextoCPF.setText("");
			TextoMatricula.setText("");
			TextoVertente.setText("");
			
			for (int i = 0; i < Banco.getQuantAlunos(); i++) {
				
				MatVelha = Integer.parseInt(Banco.getMatricula(i));
				MatNovo = Integer.parseInt(Mat);
				
				if(MatVelha == MatNovo) {
					JOptionPane.showMessageDialog(null, "O Banco já possui um aluno com essa matrícula! CADASTRE UM ALUNO COM UMA MATRÍCULA NOVA!", "CADASTRO INVÁLIDO", JOptionPane.ERROR_MESSAGE);
					Cont++;
				}
				
			}
			
			if(Cont == 0) {
				Banco.adicionarAluno(Nome, CPF, Mat, Vert);
				JOptionPane.showMessageDialog(null, "Cadastro realizado com SUCESSO!", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
				Escrever.escreverDados(Banco.formatarDados());
			}
			
		}
	}
}
