package frontEnd;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import backEnd.BancoAlunos;

public class PainelLista extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.gray);
	private BancoAlunos Banco;
	
	public PainelLista(BancoAlunos banco) {
		
		Banco = banco;
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(575,500));
		this.setBorder(Borda);
		
		String Dados[][] = new String[Banco.getQuantAlunos()][4];
		
		for (int i = 0; i < Dados.length; i++) {
			
			Dados[i][0] = Banco.getNome(i);
			Dados[i][1] = Banco.getCPF(i);
			Dados[i][2] = Banco.getMatricula(i);
			Dados[i][3] = Banco.getVertente(i);
			
		}
		
		String[] Colunas = {"Nome", "CPF", "Matrícula", "Vertente"};

        DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

        JTable Tabela = new JTable(Modelo);
        
        Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);
		
		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(550,480));

        this.add(PainelRolagem);
	}
	
	public void atualizarLista(BancoAlunos banco) {
		
		this.removeAll();
		
		Banco = banco;
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(575,500));
		this.setBorder(Borda);
		
		String Dados[][] = new String[Banco.getQuantAlunos()][4];
		
		for (int i = 0; i < Dados.length; i++) {
			
			Dados[i][0] = Banco.getNome(i);
			Dados[i][1] = Banco.getCPF(i);
			Dados[i][2] = Banco.getMatricula(i);
			Dados[i][3] = Banco.getVertente(i);
			
		}
		
		String[] Colunas = {"Nome", "CPF", "Matricula", "Vertente"};

		DefaultTableModel Modelo = new DefaultTableModel(Dados, Colunas);

        JTable Tabela = new JTable(Modelo);
        
        Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);
		
		JScrollPane PainelRolagem = new JScrollPane(Tabela);
		PainelRolagem.setPreferredSize(new Dimension(550,480));

        this.add(PainelRolagem);
	}
	
}
