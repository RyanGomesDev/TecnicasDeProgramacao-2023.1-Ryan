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
import model.LerDados;

public class Janela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private LerDados Ler = new LerDados();
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
	private BancoAlunos Banco;
	
	public Janela() {
		
		Banco = new BancoAlunos();
		Ler.lerDados("dados/Alunos.txt");
		Banco.setListaAlunos(Ler.getLista());
		
		painelCadastro = new PainelCadastro(Banco);
		painelLista = new PainelLista(Banco);
		painelAtualizar = new PainelAtualizar(Banco);
		painelDeletar = new PainelDeletar(Banco);
		
		this.setTitle("BANCO DE ALUNOS");
		this.setSize(600,600);
		this.setLayout(new BorderLayout());
		
		painelCadastro.setVisible(false);
		painelLista.setVisible(false);
		painelAtualizar.setVisible(false);
		painelDeletar.setVisible(false);
		
		BotaoCadastro = new JButton("Cadastrar");
		BotaoCadastro.setBackground(Color.WHITE);
		BotaoCadastro.addActionListener(new acaoCadastrar());
		BotaoLista = new JButton("Listar");
		BotaoLista.setBackground(Color.WHITE);
		BotaoLista.addActionListener(new acaoListar());
		BotaoAtualizar = new JButton("Atualizar");
		BotaoAtualizar.setBackground(Color.WHITE);
		BotaoAtualizar.addActionListener(new acaoAtualizar());
		BotaoDeletar = new JButton("Deletar");
		BotaoDeletar.setBackground(Color.WHITE);
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
				BotaoCadastro.setBackground(Color.WHITE);
			} else {
				BotaoCadastro.setBackground(Color.GREEN);
				BotaoLista.setBackground(Color.WHITE);
				BotaoAtualizar.setBackground(Color.WHITE);
				BotaoDeletar.setBackground(Color.WHITE);
				
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
				BotaoLista.setBackground(Color.WHITE);
			} else {
				BotaoCadastro.setBackground(Color.WHITE);
				BotaoLista.setBackground(Color.GREEN);
				BotaoAtualizar.setBackground(Color.WHITE);
				BotaoDeletar.setBackground(Color.WHITE);
				
				painelLista.atualizarLista(Banco);
				
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
				BotaoAtualizar.setBackground(Color.WHITE);
			} else {
				BotaoCadastro.setBackground(Color.WHITE);
				BotaoLista.setBackground(Color.WHITE);
				BotaoAtualizar.setBackground(Color.GREEN);
				BotaoDeletar.setBackground(Color.WHITE);
				
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
				BotaoDeletar.setBackground(Color.WHITE);
			} else {
				BotaoCadastro.setBackground(Color.WHITE);
				BotaoLista.setBackground(Color.WHITE);
				BotaoAtualizar.setBackground(Color.WHITE);
				BotaoDeletar.setBackground(Color.GREEN);
				
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
