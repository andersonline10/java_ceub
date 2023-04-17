package apresentacao;

import javax.swing.JFrame;

public class Visao extends JFrame{
	//propriedades da classe (controles da janela)
	private static final long serialVersionUID = 1L;
	private Painel objPainel = new Painel();
	
	//m�todo principal de execu��o da classe
	
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	//m�todo construtor da classe
	public Visao() {
		//configuracao da janela
		setTitle("Minha Primeira Janela Bonitona !");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		
		//configura��o do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
	}
	

}
