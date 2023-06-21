package frontEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import backEnd.Jogo;

public class Janela extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private Jogo Jogo;
	private Border Borda = BorderFactory.createMatteBorder(1,1,1,1, Color.BLACK);
	private ImageIcon IconePlay = new ImageIcon("icons/play.png");
	private ImageIcon IconeRel = new ImageIcon("icons/relatorio.png");
	private ImageIcon IconeSair = new ImageIcon("icons/exit.png");
	private JPanel PainelCima;
	private JPanel PainelBaixo;
	private JPanel PainelIntro;
	private JPanel PainelJogo;
	private PainelRelatorio PainelRelatorio;
	private PainelExit PainelExit;
	private JTextField NomeText;
	private JLabel Score;
	private JLabel QuantAlunos;
	private JLabel QuantBugs;
	private JLabel PontosAndador;
	private JLabel PontosCavalo;
	private JLabel PontosRei;
	private JButton BotaoJogar;
	private JButton BotaoRelatorio;
	private boolean Comecou;
	
	public void comecarJogo() {
		
		Jogo = new Jogo();
		
		this.setTitle("O Resgate dos alunos na Ilha Java");
		this.setSize(600,600);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		NomeText = new JTextField();
		PainelCima = painelCima();
		PainelIntro = new PainelInfo();
		PainelRelatorio = new PainelRelatorio(Jogo);
		PainelJogo = new PainelJogo(Jogo, this, PainelRelatorio);
		PainelExit = new PainelExit(Jogo);
		
		PainelIntro.setVisible(true);
		PainelRelatorio.setVisible(false);
		PainelJogo.setVisible(false);
		PainelExit.setVisible(false);
		
		PainelBaixo = new JPanel();
		PainelBaixo.setLayout(new FlowLayout());
		PainelBaixo.setBackground(Color.white);
		PainelBaixo.add(PainelIntro);
		PainelBaixo.add(PainelJogo);
		PainelBaixo.add(PainelRelatorio);
		PainelBaixo.add(PainelExit);
		
		this.add(PainelCima, BorderLayout.NORTH);
		this.add(PainelBaixo, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	private JPanel painelCima() {
		
		JPanel Painel = new JPanel();
		BotaoJogar = new JButton("PLAY");
		BotaoRelatorio = new JButton("SCOREBOARD");
		
		NomeText.setPreferredSize(new Dimension(130, 25));
		BotaoJogar.setBackground(Color.white);
		BotaoJogar.setIcon(IconePlay);
		BotaoJogar.addActionListener(new acaoPlay());
		BotaoRelatorio.setBackground(Color.white);
		BotaoRelatorio.setIcon(IconeRel);
		BotaoRelatorio.addActionListener(new acaoRelatorio());
		
		Painel.setBackground(Color.orange);
		Painel.setBorder(Borda);
		Painel.setPreferredSize(new Dimension(600, 40));
		Painel.add(new JLabel("Player's name:"));
		Painel.add(NomeText);
		Painel.add(BotaoJogar);
		Painel.add(BotaoRelatorio);
		
		return Painel;
	}
	
	private JPanel painelExit() {
		
		JPanel Painel = new JPanel();
		JButton Botao = new JButton("FECHAR JOGO");
		
		String Rodadas = "";
		String CasasVazias = "";
		String PontosTotal = "";
		String Alunos = "";
		String Bugs = "";
		String PontosAndador = "";
		String PontosCavalo = "";
		String PontosRei = "";
		
		Painel.setBackground(Color.orange);
		Painel.setPreferredSize(new Dimension(575,500));
		Painel.setBorder(Borda);
		
		String Dados[][] = new String[Jogo.getQuantJogadores()][9];
		
		for (int i = 0; i < Dados.length; i++) {
			
			Rodadas = "" + Jogo.getRodadas(i);
			CasasVazias = "" + Jogo.getCasasVazias(i);
			PontosTotal = "" + Jogo.getPontosTotal(i);
			Alunos = "" + Jogo.getAlunos(i);
			Bugs = "" + Jogo.getBugs(i);
			PontosAndador = "" + Jogo.getPontosAndador(i);
			PontosCavalo = "" + Jogo.getPontosCavalo(i);
			PontosRei = "" + Jogo.getPontosRei(i);
			
			Dados[i][0] = Jogo.getNome(i);
			Dados[i][1] = Rodadas;
			Dados[i][2] = CasasVazias;
			Dados[i][3] = PontosTotal;
			Dados[i][4] = Alunos;
			Dados[i][5] = Bugs;
			Dados[i][6] = PontosAndador;
			Dados[i][7] = PontosCavalo;
			Dados[i][8] = PontosRei;
			
		}
		
		String[] Colunas = {"Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo", "Rei"};

        DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

        JTable Tabela = new JTable(Modelo);
        
        Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);
		
		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(550,400));
		
		Botao.setBackground(Color.white);
		Botao.setIcon(IconeSair);
		Botao.setPreferredSize(new Dimension(150, 80));
		Botao.addActionListener(new acaoExit());
		
        Painel.add(PainelRolagem);
		Painel.add(Botao);
        
		return Painel;
		
	}
	
	public void atualizarPainelRodada() {
		
		int Aux = Jogo.getQuantJogadores() - 1;
		
		String StrScore = "Score: " + Jogo.getPontosTotal(Aux);
		String StrAlunos = "" + Jogo.getAlunos(Aux);
		String StrBugs = "" + Jogo.getBugs(Aux);
		String StrAndador = "" + Jogo.getPontosAndador(Aux);
		String StrCavalo = "" + Jogo.getPontosCavalo(Aux);
		String StrRei = "" + Jogo.getPontosRei(Aux);
		
		Score.setText(StrScore);
		QuantAlunos.setText(StrAlunos);
		QuantBugs.setText(StrBugs);
		PontosAndador.setText(StrAndador);
		PontosCavalo.setText(StrCavalo);
		PontosRei.setText(StrRei);
	}
	
	public void atualizarPainelRelatorio() {
		
		PainelRelatorio.removeAll();
		
		String Rodadas = "";
		String CasasVazias = "";
		String PontosTotal = "";
		String Alunos = "";
		String Bugs = "";
		String PontosAndador = "";
		String PontosCavalo = "";
		String PontosRei = "";
		
		PainelRelatorio.setBackground(Color.orange);
		PainelRelatorio.setPreferredSize(new Dimension(575,500));
		PainelRelatorio.setBorder(Borda);
		
		String Dados[][] = new String[Jogo.getQuantJogadores()][9];
		
		for (int i = 0; i < Dados.length; i++) {
			
			Rodadas = "" + Jogo.getRodadas(i);
			CasasVazias = "" + Jogo.getCasasVazias(i);
			PontosTotal = "" + Jogo.getPontosTotal(i);
			Alunos = "" + Jogo.getAlunos(i);
			Bugs = "" + Jogo.getBugs(i);
			PontosAndador = "" + Jogo.getPontosAndador(i);
			PontosCavalo = "" + Jogo.getPontosCavalo(i);
			PontosRei = "" + Jogo.getPontosRei(i);
			
			Dados[i][0] = Jogo.getNome(i);
			Dados[i][1] = Rodadas;
			Dados[i][2] = CasasVazias;
			Dados[i][3] = PontosTotal;
			Dados[i][4] = Alunos;
			Dados[i][5] = Bugs;
			Dados[i][6] = PontosAndador;
			Dados[i][7] = PontosCavalo;
			Dados[i][8] = PontosRei;
			
		}
		
		String[] Colunas = {"Jogador", "Rodadas", "Casas Vazias", "Pontuação", "Alunos", "Bugs", "Andador", "Cavalo", "Rei"};

        DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

        JTable Tabela = new JTable(Modelo);
        
        Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);
		
		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(550,480));

		PainelRelatorio.add(PainelRolagem);
		
	}
	
	private class acaoPlay implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			PainelIntro.setVisible(false);
			PainelJogo.setVisible(true);
			BotaoJogar.setEnabled(false);
			NomeText.setEnabled(false);
			Comecou = true;
			
			Jogo.criarJogador(NomeText.getText());
			Jogo.adicionarAlunos();
			Jogo.adicionarBugs();
		}
	}
	
	private class acaoRelatorio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(PainelRelatorio.isVisible() && Comecou == false) {
				PainelIntro.setVisible(true);
				PainelJogo.setVisible(false);
				PainelRelatorio.setVisible(false);
			} else if(PainelRelatorio.isVisible() && Comecou) {
				PainelIntro.setVisible(false);
				PainelJogo.setVisible(true);
				PainelRelatorio.setVisible(false);
			} else {
				PainelIntro.setVisible(false);
				PainelJogo.setVisible(false);
				PainelRelatorio.setVisible(true);
			}
		}
	}
	
	private class acaoExit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public void actionPerformed(ActionEvent e) {
		
		JPanel Aux = painelExit();
		
		PainelBaixo.add(Aux);
		
		PainelIntro.setVisible(false);
		PainelJogo.setVisible(false);
		PainelRelatorio.setVisible(false);
		Aux.setVisible(true);
		
		NomeText.setEnabled(false);
		BotaoJogar.setEnabled(false);
		BotaoRelatorio.setEnabled(false);
		
		Jogo.escreverDados();
	}
	
	public void setPainelSair(boolean b) {
		PainelExit.atualizarPainelExit();
		PainelExit.setVisible(b);
	}
	
}
