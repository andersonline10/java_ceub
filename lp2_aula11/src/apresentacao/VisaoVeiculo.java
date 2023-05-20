package apresentacao;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Fabricante;

public class VisaoVeiculo extends JFrame{

	//
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblFabricante = new JLabel("Fabricante");
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	
	private JLabel lblModelo = new JLabel("Modelo");
	private JTextField txtModelo = new JTextField();
	
	private JLabel lblCor = new JLabel("Cor");
	private JComboBox<String> cboCor = new JComboBox<String>();
	
	private JCheckBox chkTetoSolar = new JCheckBox("Teto Solar");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//método principal de execução da classe
	public static void main(String[] args) {
		new VisaoVeiculo().setVisible(true);
	}
	
	//método construtor da classe
	public VisaoVeiculo() {
		//config da janela
		setTitle("Cadastro de Veículos");
		setSize(450, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("carro.jpg").getImage());
		
		//configuraçao do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//Fabricante
		lblFabricante.setBounds(20, 10, 200, 20);
		objPainel.add(lblFabricante);
		cboFabricante.setBounds(20, 30, 110, 20);
		objPainel.add(cboFabricante);
		cboFabricante.addItem("");
		for (Fabricante objFabricante : new Fabricante().getTodos()) {
			cboFabricante.addItem(objFabricante.getNome());
		}
		
		//modelo
		
		lblModelo.setBounds(20, 60, 200, 20);
		objPainel.add(lblModelo);
		txtModelo.setBounds(20, 80, 400, 20);
		objPainel.add(txtModelo);
		
		//cor
		
		lblCor.setBounds(20, 130, 200, 20);
		objPainel.add(lblCor);
		cboCor.setBounds(20, 150, 100, 20);
		objPainel.add(cboCor);
		cboCor.addItem("");
		cboCor.addItem("Preto");
		cboCor.addItem("Branco");
		cboCor.addItem("Vermelho");
		cboCor.addItem("Amarelo");
		cboCor.addItem("Prata");
		cboCor.addItem("Azul");
		
		//teto solar
		
		chkTetoSolar.setBounds(20, 190, 200, 20);
		objPainel.add(chkTetoSolar);
		
		//Botões
		btnGravar.setBounds(60, 230, 100, 30);
		btnGravar.addActionListener(new ControladorGravar(
				cboFabricante, txtModelo, cboCor, chkTetoSolar));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(170, 230, 100, 30);
		btnLimpar.addActionListener(new ControladorLimpar(
				cboFabricante, txtModelo, cboCor, chkTetoSolar));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(280, 230, 100, 30);
		btnSair.addActionListener(new ControladorSair());
		objPainel.add(btnSair);
		
		
		
		
		
		
		
	}
}
