package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VisaoPessoa extends JFrame{

	//propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblNome = new JLabel ("Nome");
	
	private JTextField txtNome = new JTextField();
	
	private JLabel lblSexo = new JLabel("Sexo");
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	private ButtonGroup btgSexo = new ButtonGroup();
	
	private JLabel lblEndereco = new JLabel("Endereço");
	
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblUf = new JLabel("UF");
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	
	//método principal de execução da classe
	
	public static void main(String[] args) {
		new VisaoPessoa().setVisible(true);
	}
	
	//método construtor da classe
	
	public VisaoPessoa() {
		//configuracao da janela
		setTitle("Cadastro de Pessoas");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//configuração do painel
		
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//Nome
		lblNome.setBounds(20, 20,200,20);
		objPainel.add(lblNome);
		txtNome.setBounds(20, 40, 300, 20);
		objPainel.add(txtNome);
		
		
		//sexo
		
		lblSexo.setBounds(20, 80, 200, 20);
		objPainel.add(lblSexo);
		optMasculino.setBounds(20, 100, 100, 20);
		objPainel.add(optMasculino);
		optFeminino.setBounds(120, 100, 100, 20);
		objPainel.add(optFeminino);
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		optMasculino.setSelected(true);
		
		//Endereço
		lblEndereco.setBounds(20, 140, 200, 20);
		objPainel.add(lblEndereco);
		txtEndereco.setBounds(20, 160, 600, 20);
		objPainel.add(txtEndereco);
		
		//UF
		lblUf.setBounds(20, 200, 200, 20);
		objPainel.add(lblNome);
		cboUf.setBounds(20, 220, 60, 20);
		objPainel.add(cboUf);
		cboUf.addItem("");
		cboUf.addItem("AC");
		cboUf.addItem("AM");
		cboUf.addItem("BA");
		cboUf.addItem("CE");
		cboUf.addItem("DF");
		cboUf.addItem("ES");
		cboUf.addItem("RJ");
		cboUf.addItem("SP");
		cboUf.addItem("TO");
		
		// Botões
		
		btnGravar.setBounds(450, 500, 100, 30);
		btnGravar.addActionListener(new ControladorGravar(txtNome, optMasculino, txtEndereco, cboUf));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(560, 500, 100, 30);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, cboUf));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(670, 500, 100, 30);
		btnSair.addActionListener(new ControladorSair());
		objPainel.add(btnSair);
		
		
		
	}
	
}
