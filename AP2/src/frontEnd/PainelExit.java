package frontEnd;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import backEnd.Jogo;
//import frontEnd.PainelJogo.acaoExit;

public class PainelExit extends JPanel {

	private static final long serialVersionUID = 1L;
	private Jogo Jogo;
	private Border Borda = BorderFactory.createMatteBorder(1,1,1,1, Color.BLACK);
	private ImageIcon IconeSair = new ImageIcon("icons/exit.png");
	
	public PainelExit(Jogo jogo) {
		
		Jogo = jogo;
		
		JButton Botao = new JButton("FECHAR JOGO");
		
		String Rodadas = "";
		String CasasVazias = "";
		String PontosTotal = "";
		String Alunos = "";
		String Bugs = "";
		String PontosAndador = "";
		String PontosCavalo = "";
		String PontosRei = "";
		
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(575,500));
		this.setBorder(Borda);
		
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
		
        this.add(PainelRolagem);
		this.add(Botao);
        
	}
	
	public void atualizarPainelExit() {
		
		this.removeAll();
		
		JButton Botao = new JButton("FECHAR JOGO");
		
		String Rodadas = "";
		String CasasVazias = "";
		String PontosTotal = "";
		String Alunos = "";
		String Bugs = "";
		String PontosAndador = "";
		String PontosCavalo = "";
		String PontosRei = "";
		
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(575,500));
		this.setBorder(Borda);
		
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
		
        this.add(PainelRolagem);
		this.add(Botao);
		
	}
	
	private class acaoExit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
}
