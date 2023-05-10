package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Tipo;

public class VisaoProduto extends JFrame {

	//propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblPreco = new JLabel("Preço");
	private JTextField txtPreco = new JTextField();
	
	private JLabel lblTipo = new JLabel("Tipo");
	private JComboBox<String> cboTipo = new JComboBox<String>();
	
	private JCheckBox chkPerecivel = new JCheckBox("Perecível");
	
	private JLabel lblDetalhamento = new JLabel("Detalhamento");
	private JTextArea txtDetalhamento = new JTextArea();
	private JScrollPane jspDetalhamento = new JScrollPane(txtDetalhamento);
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//método principal de execução da classe
	public static void main(String[] args) {
		new VisaoProduto().setVisible(true);
	}
	//método construtor da classe

	public VisaoProduto() {
		//configuração da janela
		setTitle("Cadastro de Produtos");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//configuração do Painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//Nome
		lblNome.setBounds(20, 20, 200, 20);
		objPainel.add(lblNome);
		txtNome.setBounds(20, 40, 400, 20);
		objPainel.add(txtNome);
		
		//Preço
		lblPreco.setBounds(20, 80, 200, 20);
		objPainel.add(lblPreco);	
		txtPreco.setBounds(20, 100, 400, 20);
		objPainel.add(txtPreco);
		
		//Tipo
		lblTipo.setBounds(20, 140, 120, 20);
		objPainel.add(lblTipo);
		cboTipo.setBounds(20, 160, 120, 20);
		objPainel.add(cboTipo);
		cboTipo.addItem("");
		for (Tipo objTipo : new Tipo().getTodos()) {
			cboTipo.addItem(objTipo.getDescricao());
		}
		
		//Perecível
		chkPerecivel.setBounds(20, 200, 200, 20);
		objPainel.add(chkPerecivel);
		
		//Detalhamento
		
		lblDetalhamento.setBounds(20, 240, 200, 20);
		objPainel.add(lblDetalhamento);
		jspDetalhamento.setBounds(20, 260, 745, 150);
		objPainel.add(jspDetalhamento);
		txtDetalhamento.setLineWrap(true);
		
		//Botões
		
		btnGravar.setBounds(445, 500, 100, 30);
		btnGravar.addActionListener(new ControladorGravar
		(txtNome, txtPreco, cboTipo, chkPerecivel, txtDetalhamento));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(555, 500, 100, 30);
		btnLimpar.addActionListener(new ControladorLimpar
		(txtNome, txtPreco, cboTipo, chkPerecivel, txtDetalhamento));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(665, 500, 100, 30);
		btnSair.addActionListener(new ControladorSair());
		objPainel.add(btnSair);
		
		
	}
	
}
