package frontEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import backEnd.BancoAlunos;

public class Janela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel PainelCima = new JPanel();
	private JPanel PainelBaixo = new JPanel();
	private Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.BLACK);
	private JButton BotaoCadastro;
	private JButton BotaoLista;
	private JButton BotaoAtualizar;
	private JButton BotaoDeletar;
	private PainelCadastro painelCadastro;
	private PainelLista painelLista;
	private PainelAtualizar painelAtualizar;
	private PainelDeletar painelDeletar;
	private BancoAlunos Banco = new BancoAlunos();
	
	public Janela(BancoAlunos banco) {
		
		this.Banco = banco;
		painelCadastro = new PainelCadastro(Banco);
		painelLista = new PainelLista();
		painelAtualizar = new PainelAtualizar();
		painelDeletar = new PainelDeletar();
		
		
		this.setTitle("CADASTRO ALUNOS");
		this.setSize(600,600);
		this.setLayout(new BorderLayout());
		
		
		painelCadastro.setVisible(false);
		painelLista.setVisible(false);
		painelAtualizar.setVisible(false);
		painelDeletar.setVisible(false);
		
		BotaoCadastro = new JButton("Cadastrar");
		BotaoCadastro.addActionListener(new acaoCadastrar());
		BotaoLista = new JButton("Listar");
		BotaoLista.addActionListener(new acaoListar());
		BotaoAtualizar = new JButton("Atualizar");
		BotaoAtualizar.addActionListener(new acaoAtualizar());
		BotaoDeletar = new JButton("Deletar");
		BotaoDeletar.addActionListener(new acaoDeletar());
		
		PainelCima.add(BotaoCadastro);
		PainelCima.add(BotaoLista);
		PainelCima.add(BotaoAtualizar);
		PainelCima.add(BotaoDeletar);
		PainelCima.setBackground(Color.LIGHT_GRAY);
		PainelCima.setBorder(Borda);
		
		PainelBaixo.setLayout(new FlowLayout());
		PainelBaixo.setPreferredSize(new Dimension(400, 200));
		PainelBaixo.setBackground(Color.LIGHT_GRAY);
		PainelBaixo.setBorder(Borda);
		PainelBaixo.add(painelCadastro);
		PainelBaixo.add(painelLista);
		PainelBaixo.add(painelAtualizar);
		PainelBaixo.add(painelDeletar);
		
		this.add(PainelCima, BorderLayout.NORTH);
		this.add(PainelBaixo, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

	private class acaoCadastrar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(painelCadastro.isVisible()) {
				painelCadastro.setVisible(false);
			} else {
				painelCadastro.setVisible(true);
				painelLista.setVisible(false);
				painelAtualizar.setVisible(false);
				painelDeletar.setVisible(false);
			}
			
		}
	}
	
	private class acaoListar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(painelLista.isVisible()) {
				painelLista.setVisible(false);
			} else {
				painelCadastro.setVisible(false);
				painelLista.setVisible(true);
				painelAtualizar.setVisible(false);
				painelDeletar.setVisible(false);
			}
		}
		
	}
	
	private class acaoAtualizar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(painelAtualizar.isVisible()) {
				painelAtualizar.setVisible(false);
			} else {
				painelCadastro.setVisible(false);
				painelLista.setVisible(false);
				painelAtualizar.setVisible(true);
				painelDeletar.setVisible(false);
			}
		}
		
	}
	
	private class acaoDeletar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(painelDeletar.isVisible()) {
				painelDeletar.setVisible(false);
			} else {
				painelCadastro.setVisible(false);
				painelLista.setVisible(false);
				painelAtualizar.setVisible(false);
				painelDeletar.setVisible(true);
			}
		}
		
	}
	
	public void tirarAviso() {
		
	}
	
}
