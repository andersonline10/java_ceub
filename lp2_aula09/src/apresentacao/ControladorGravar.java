package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

public class ControladorGravar implements ActionListener{
	//Propriedades da classe
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	//m�todo construtor cheio da classe
	
	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JTextField txtendreco,
			JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtendreco;
		this.cboUf = cboUf;
	}
	
	//m�todo implementado da interface
	public void actionPerformed(ActionEvent e) {
		//cr�ticas de dados
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigat�rio !");
			return;
		}
		if (txtEndereco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo endere;o obrigat�rio !");
			return;
		}
		if (cboUf.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo UF obrigat�rio !");
			return;
		}
		
		//composi��o do objeto
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setSexo(optMasculino.isSelected());
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		//Sa�da de dados
		JOptionPane.showMessageDialog(null,
				"Nome: " + objPessoa.getNome() + "\n" +
				"Sexo: " + (objPessoa.isSexo() ? "Masculino" : "Feminino") + "\n" +
				"Endere�o: " + objPessoa.getEndereco() + "\n" +
				"UF: " + objPessoa.getObjUf().getSigla());
	}
	
}
