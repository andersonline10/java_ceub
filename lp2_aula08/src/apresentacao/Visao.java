package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao extends JFrame {

	//propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JMenuBar barraDeMenu = new JMenuBar();
	private JMenu mnuArquivo = new JMenu("Arquivo");
	private JMenuItem mniNovo = new JMenuItem("Novo");
	private JMenuItem mniAbrir = new JMenuItem("Abrir");
	private JMenuItem mniSair = new JMenuItem("Sair");
	private JMenu mnuEditar = new JMenu("Editar");
	private JMenuItem mniCopiar = new JMenuItem("Copiar");
	private JMenuItem mniColar = new JMenuItem("Colar");
	
	private JButton btnOk = new JButton("Ok");
	
	private JLabel lblTitulo = new JLabel("Título");
	private JTextField txtTitulo = new JTextField();
	
	private JLabel lblComentario = new JLabel("Comentário");
	private JTextArea txtComentario = new JTextArea();
	private JScrollPane jspComentario = new JScrollPane(txtComentario);
	
	private JLabel lblPais = new JLabel("País");
	private JComboBox<String> cboPais = new JComboBox<String>();
	
	private JCheckBox chkConcordo = new JCheckBox("Concordo");
	
	private JLabel lblCor = new JLabel("Cor");
	private JRadioButton optBranco = new JRadioButton("Branco");
	private JRadioButton optPreto = new JRadioButton("Preto");
	private JRadioButton optAzul= new JRadioButton("Azul");
	private JRadioButton optVermelho = new JRadioButton("Vermelho");
	private ButtonGroup btgCor = new ButtonGroup();
	
	private JLabel lblCompra = new JLabel("Lista de Compras");
	private JList<String> lstCompra = new JList<String>();
	private DefaultListModel<String> dlmCompra = new DefaultListModel<String>();
	private JScrollPane jspCompra = new JScrollPane(lstCompra);
	
	// método principal de execução da classe
	
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	
	// método construtor da classe
	
	public Visao() {
		//configuracao da janela
		setTitle("Exemplo de Utilização dos Controles");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//configuração do painel
		
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//configuraçao do menu
		setJMenuBar(barraDeMenu);
		barraDeMenu.add(mnuArquivo);
		barraDeMenu.add(mnuEditar);
		mnuArquivo.add(mniNovo);
		mnuArquivo.add(mniAbrir);
		mnuArquivo.addSeparator();
		mnuArquivo.add(mniSair);
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniColar);
		
		mniNovo.addActionListener(new ControladorNovo());
		
		mniSair.addActionListener(new ControladorSair());
		
		//configuraçao do botao
		
		btnOk.setBounds(600, 450, 100, 30);
		objPainel.add(btnOk);
		
		//configuraçao do título
		lblTitulo.setBounds(10, 10, 200, 20);
		objPainel.add(lblTitulo);
		txtTitulo.setBounds(10, 30, 300, 20);
		objPainel.add(txtTitulo);
		
		//configuracao do comentário
		
		lblComentario.setBounds(10, 60, 200, 20);
		objPainel.add(lblComentario);
		jspComentario.setBounds(10, 80, 650, 150);
		objPainel.add(jspComentario);
		txtComentario.setLineWrap(true);
		
		//configuracao da caixa de países
		
		lblPais.setBounds(10, 240, 200, 20);
		objPainel.add(lblPais);
		cboPais.setBounds(10, 260, 200, 20);
		objPainel.add(cboPais);
		cboPais.addItem("Argélia");
		cboPais.addItem("Bélgica");
		cboPais.addItem("Canadá");
		cboPais.addItem("Escócia");
		cboPais.addItem("França");
		cboPais.addItem("Holanda");
		
		
		//configuração da caixa de concordo
		chkConcordo.setBounds(10, 290, 200, 20);
		objPainel.add(chkConcordo);
		
		//configuração das cores
		lblCor.setBounds(10, 320, 200, 20);
		objPainel.add(lblCor);
		optBranco.setBounds(10, 340, 200, 20);
		objPainel.add(optBranco);
		optPreto.setBounds(10, 360, 200, 20);
		objPainel.add(optPreto);
		optAzul.setBounds(210, 340, 200, 20);
		objPainel.add(optAzul);
		optVermelho.setBounds(210, 360, 200, 20);
		objPainel.add(optVermelho);
		btgCor.add(optBranco);
		btgCor.add(optPreto);
		btgCor.add(optAzul);
		btgCor.add(optVermelho);
		optBranco.setSelected(true);
		
		
		
		//configuração da lista de compras
		
		lblComentario.setBounds(10, 390, 200, 20);
		objPainel.add(lblCompra);
		jspCompra.setBounds(10, 410, 400, 100);
		objPainel.add(jspCompra);
		lstCompra.setModel(dlmCompra);
		dlmCompra.addElement("Cerveja");
		dlmCompra.addElement("Picanha");
		dlmCompra.addElement("Vodka");
		dlmCompra.addElement("Limão");
		dlmCompra.addElement("Açucar");
		dlmCompra.addElement("Red Bull");
		dlmCompra.addElement("Gelo");
		 
		
		
		
		
		
		
		
		
	}

}
