package frontEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import backEnd.Jogo;


public class PainelJogo extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private Jogo Jogo;
	private Janela Janela;
	private PainelRelatorio PainelRel;
	private Border Borda = BorderFactory.createMatteBorder(1,1,1,1, Color.BLACK);
	private ImageIcon IconeAndador = new ImageIcon("icons/andador.png");
	private ImageIcon IconeCavalo = new ImageIcon("icons/cavalo.png");
	private ImageIcon IconeRei = new ImageIcon("icons/rei.png");
	private ImageIcon IconeAluno = new ImageIcon("icons/aluno.png");
	private ImageIcon IconeBug = new ImageIcon("icons/bug.png");
	private ImageIcon IconeChecar = new ImageIcon("icons/check.png");
	private ImageIcon IconeNext = new ImageIcon("icons/next.png");
	private ImageIcon IconeSair = new ImageIcon("icons/exit.png");
	private ImageIcon IconeVazio = new ImageIcon("icons/rachadura.png");
	private ArrayList<JButton> Casas = new ArrayList<JButton>();
	private JLabel Score;
	private JLabel QuantAlunos;
	private JLabel QuantBugs;
	private JLabel PontosAndador;
	private JLabel PontosCavalo;
	private JLabel PontosRei;
	private JButton BotaoAndador;
	private JButton BotaoCavalo;
	private JButton BotaoRei;
	private int RoboSelecionado;

	public PainelJogo(Jogo jogo, Janela janela, PainelRelatorio rel) {
		
		Jogo = jogo;
		Janela = janela;
		PainelRel = rel;
		
		this.setLayout(new BorderLayout());
		JPanel PainelPlano = painelPlano();
		JPanel PainelRodada = painelRodada();
		
		this.add(PainelPlano, BorderLayout.CENTER);
		this.add(PainelRodada, BorderLayout.EAST);
		
	}
	
	private JPanel painelPlano() {
		
		JPanel Painel = new JPanel();
		
		Painel.setLayout(new GridLayout(8, 8));
		Painel.setBackground(Color.LIGHT_GRAY);
		Painel.setBorder(Borda);
		Painel.setPreferredSize(new Dimension(400, 520));
		
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
            	
                JButton Botao = new JButton();
                Botao.addActionListener(new acaoCasa());
                
                if ((i + j) % 2 == 0) {
                    Botao.setBackground(Color.WHITE);
                } else {
                    Botao.setBackground(Color.cyan);
                }
                
                Casas.add(Botao);
                Painel.add(Botao);
            }
        }
		
		return Painel;
	}
	
	private JPanel painelRodada() {
		
		JPanel Painel = new JPanel();
		
		Score = new JLabel("Score: 0");
		JLabel Total = new JLabel("Total: ");
		QuantAlunos = new JLabel(" 0 ", IconeAluno, JLabel.LEFT);
		QuantBugs = new JLabel(" 0 ", IconeBug, JLabel.LEFT);
		PontosAndador = new JLabel(" 0 ", IconeAndador, JLabel.LEFT);
		PontosCavalo = new JLabel(" 0 ", IconeCavalo, JLabel.LEFT);
		PontosRei = new JLabel(" 0 ", IconeRei, JLabel.LEFT);
		
		BotaoAndador = new JButton();
		BotaoCavalo = new JButton();
		BotaoRei = new JButton();
		JButton Verificar = new JButton("CHECK");
		JButton ProximaRodada = new JButton("NEXT ROUND");
		JButton Sair = new JButton("EXIT");
		
		Score.setPreferredSize(new Dimension(160, 25));
		Total.setPreferredSize(new Dimension(50, 25));
		QuantAlunos.setPreferredSize(new Dimension(50, 25));
		QuantBugs.setPreferredSize(new Dimension(50, 25));
		PontosAndador.setPreferredSize(new Dimension(50, 25));
		PontosCavalo.setPreferredSize(new Dimension(50, 25));
		PontosRei.setPreferredSize(new Dimension(50, 25));
		
		BotaoAndador.setBackground(Color.white);
		BotaoAndador.setIcon(IconeAndador);
		BotaoAndador.setPreferredSize(new Dimension(50, 50));
		BotaoAndador.addActionListener(new acaoAndador());
		BotaoCavalo.setBackground(Color.white);
		BotaoCavalo.setIcon(IconeCavalo);
		BotaoCavalo.setPreferredSize(new Dimension(50, 50));
		BotaoCavalo.addActionListener(new acaoCavalo());
		BotaoRei.setBackground(Color.white);
		BotaoRei.setIcon(IconeRei);
		BotaoRei.setPreferredSize(new Dimension(50, 50));
		BotaoRei.addActionListener(new acaoRei());
		Verificar.setBackground(Color.white);
		Verificar.setIcon(IconeChecar);
		Verificar.setPreferredSize(new Dimension(150, 115));
		Verificar.addActionListener(new acaoCheck());
		ProximaRodada.setBackground(Color.white);
		ProximaRodada.setIcon(IconeNext);
		ProximaRodada.setPreferredSize(new Dimension(150, 115));
		ProximaRodada.addActionListener(new acaoNextRound());
		Sair.setBackground(Color.white);
		Sair.setIcon(IconeSair);
		Sair.setPreferredSize(new Dimension(150, 115));
		Sair.addActionListener(this);
		
		Painel.setBackground(Color.orange);
		Painel.setBorder(Borda);
		Painel.setPreferredSize(new Dimension(180, 520));
		
		Painel.add(Score);
		Painel.add(Total);
		Painel.add(QuantAlunos);
		Painel.add(QuantBugs);
		Painel.add(PontosAndador);
		Painel.add(PontosCavalo);
		Painel.add(PontosRei);
		Painel.add(BotaoAndador);
		Painel.add(BotaoCavalo);
		Painel.add(BotaoRei);
		Painel.add(Verificar);
		Painel.add(ProximaRodada);
		Painel.add(Sair);
		
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
		
		PainelRel.removeAll();
		
		String Rodadas = "";
		String CasasVazias = "";
		String PontosTotal = "";
		String Alunos = "";
		String Bugs = "";
		String PontosAndador = "";
		String PontosCavalo = "";
		String PontosRei = "";
		
		PainelRel.setBackground(Color.orange);
		PainelRel.setPreferredSize(new Dimension(575,500));
		PainelRel.setBorder(Borda);
		
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

		PainelRel.add(PainelRolagem);
		
	}
	
	private class acaoCasa implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			JButton BotaoAux = (JButton) e.getSource();
			int Index = Casas.indexOf(BotaoAux);
			
			if(RoboSelecionado == 1) {
				BotaoAndador.setEnabled(false);
				BotaoAux.setIcon(IconeAndador);
			} else if(RoboSelecionado == 2) {
				BotaoCavalo.setEnabled(false);
				BotaoAux.setIcon(IconeCavalo);
			} else if(RoboSelecionado == 3) {
				BotaoRei.setEnabled(false);
				BotaoAux.setIcon(IconeRei);
			}
			
			if(Jogo.getAlunoCasa(Index) && RoboSelecionado != 0) {
				Jogo.setAlunos();
				Jogo.acertouRobo(RoboSelecionado);
				Jogo.setCasaVisitada(Index);
	            BotaoAux.setEnabled(false);
	            RoboSelecionado = 0;
			} else if(Jogo.getBugCasa(Index) && RoboSelecionado != 0) {
				Jogo.setBugs();
				Jogo.errouRobo(RoboSelecionado);
				Jogo.setCasaVisitada(Index);
	            BotaoAux.setEnabled(false);
	            RoboSelecionado = 0;
				
			} else if(RoboSelecionado != 0){
				Jogo.setCasasVazias();
				Jogo.setCasaVisitada(Index);
	            BotaoAux.setEnabled(false);
	            RoboSelecionado = 0;
			}
			
		}
	}

	private class acaoAndador implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			RoboSelecionado = 1;
			BotaoAndador.setBackground(new Color(105, 235, 150));
			BotaoCavalo.setBackground(Color.white);
			BotaoRei.setBackground(Color.white);
		}
	}
	
	private class acaoCavalo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			RoboSelecionado = 2;
			BotaoAndador.setBackground(Color.white);
			BotaoCavalo.setBackground(new Color(105, 235, 150));
			BotaoRei.setBackground(Color.white);
            
		}
	}
	
	private class acaoRei implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			RoboSelecionado = 3;
			BotaoAndador.setBackground(Color.white);
			BotaoCavalo.setBackground(Color.white);
			BotaoRei.setBackground(new Color(105, 235, 150));
			
		}
	}
	
	private class acaoCheck implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			int Aux = 0;
			
			if(BotaoAndador.isEnabled() == false && BotaoCavalo.isEnabled() == false && BotaoRei.isEnabled() == false) {
				Aux = 1;
			}
			
			if(Aux == 1) {
				for (int i = 0; i < Casas.size(); i++) {
					
					if(Jogo.getAlunoCasa(i) && Jogo.getCasaVisitada(i)) {
						Casas.get(i).setIcon(IconeAluno);
						Jogo.atualizarPontos();
					} else if(Jogo.getBugCasa(i) && Jogo.getCasaVisitada(i)) {
						Casas.get(i).setIcon(IconeBug);
						Jogo.atualizarPontos();
					} else if(Jogo.getCasaVisitada(i)) {
						Casas.get(i).setIcon(IconeVazio);
						Jogo.atualizarPontos();
					}
					
				}
				atualizarPainelRodada();
				atualizarPainelRelatorio();
			}
		}
	}
	
	private class acaoNextRound implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(BotaoAndador.isEnabled() == false && BotaoCavalo.isEnabled() == false && BotaoRei.isEnabled() == false) {
				BotaoAndador.setEnabled(true);
				BotaoCavalo.setEnabled(true);
				BotaoRei.setEnabled(true);
				Jogo.aumentarRodadas();
				Jogo.escreverDados();
				atualizarPainelRelatorio();
			}
			
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		this.setVisible(false);
		Janela.setPainelSair(true);
	}
	
}
