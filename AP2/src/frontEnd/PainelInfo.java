package frontEnd;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PainelInfo extends JPanel {

	private static final long serialVersionUID = 1L;
	private Border Borda = BorderFactory.createMatteBorder(1,1,1,1, Color.BLACK);
	private ImageIcon IconeIlha = new ImageIcon("icons/ilha.png");
	
	public PainelInfo() {
		
		this.setBackground(new Color(73, 199, 222));
		this.setBorder(Borda);
		
		JLabel Texto = new JLabel("<html>O Resgate dos Alunos na Ilha Java - Instruções:<br><br>"
				+ "1) Digite seu nome e clique no botão PLAY;<br>"
                + "2) Clique em um dos três personagens (Andandor/Pézinho, Cavalo e Rei) e depois clique na casa do plano"
                + " a esquerda que deseja;<br>"
                + "3) Cada casa pode conter um aluno para salvar, bug para evitar ou está vazia;<br>"
                + "4) Você deve fazer isso para cada personagem, não podendo ir para a próxima rodada sem ter colocado os 3 em cada casa diferente;<br>"
                + "5) Após colocar todos, você irá clicar em CHECK para verificar se encontrou algum aluno ou bug e computa os pontos;<br>"
                + "6) Após isso, você deve clicar no NEXT ROUND para começar a próxima rodada e assim por diante;<br>"
                + "7) Quando você não quiser mais jogar clique no botão EXIT para sair do jogo e registrar a sua pontuação<br><br><br>"
                + "É isso!! Boa Sorte!!</html>", IconeIlha, JLabel.LEFT);
		
		Texto.setPreferredSize(new Dimension(555, 300));
		this.add(Texto);
		
	}
	
}
