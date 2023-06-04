package frontEnd;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;

public class PainelLista extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Border Borda = BorderFactory.createMatteBorder(3,3,3,3, Color.gray);
	
	public PainelLista() {
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(575,500));
		this.setBorder(Borda);
		
		Object[][] dados = { { "Cauã", 1234567812, 2352355, "Ciências da Computação" }, 
				{ "Giovanna", 3023323, 435552355, "Técnicas de Programação"  }, 
				{ "Israelly", 405555, 54652355, "Cálculo Vetorial"  }};

		String[] colunas = { "Nome", "CPF", "Matrícula", "Vertente" };
		
		JTable Tabela = new JTable(dados, colunas);
		Tabela.setCellSelectionEnabled(false);
		Tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
		Tabela.setRowHeight(30);
		
		JScrollPane painelRolagem = new JScrollPane(Tabela);
		painelRolagem.setPreferredSize(new Dimension(550,480));
		
		this.add(painelRolagem);
		
	}
	
}
