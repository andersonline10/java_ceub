package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {

	//propriedades da classe
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		/*
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 300, 400, 200);
		g.fillOval(300, 200, 200, 200);
		g.setColor(Color.blue);
		g.fillOval(350, 250, 150, 150);*/
		
		//céu
		
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 800, 600);
		
		//chão
		
		g.setColor(Color.GREEN);
		g.fillRect(0, 300, 800, 600);
		
		//sol
		g.setColor(Color.yellow);
		g.fillOval(650, 50, 100, 100);
		g.setColor(Color.orange);
		g.fillOval(660, 60, 80, 80);
		
		//frente da casa
		g.setColor(Color.black);
		g.drawLine(50, 500, 150, 500);
		g.drawLine(50, 500, 50, 350);
		g.drawLine(150, 500, 150, 350);
		//telhado da frente da casa
		g.drawLine(50, 350, 100, 280);
		g.drawLine(150, 350, 100, 280);
		//lateral da casa
		g.drawLine(150, 500, 350, 400);
		g.drawLine(350, 400, 350, 280);
		g.drawLine(150, 350, 350, 280);
		//telhado da lateral da casa
		g.drawLine(100, 280, 300, 230);
		g.drawLine(350, 280, 300, 230);
		//boneco cabeçudo
		g.fillOval(645, 390, 40, 40);
		g.drawLine(665, 415, 665, 500);
		g.drawLine(630, 450, 700, 450);
		g.drawLine(665, 500, 635, 550);
		g.drawLine(665, 500, 695, 550);
		
		
		
	}
	
}
