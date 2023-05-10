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
	
	//método construtor cheio da classe
	
	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JTextField txtendreco,
			JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtendreco;
		this.cboUf = cboUf;
	}
	
	//método implementado da interface
	public void actionPerformed(ActionEvent e) {
		//críticas de dados
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigatório !");
			return;
		}
		if (txtEndereco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo endere;o obrigatório !");
			return;
		}
		if (cboUf.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo UF obrigatório !");
			return;
		}
		
		//composição do objeto
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setSexo(optMasculino.isSelected());
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		//Saída de dados
		JOptionPane.showMessageDialog(null,
				"Nome: " + objPessoa.getNome() + "\n" +
				"Sexo: " + (objPessoa.isSexo() ? "Masculino" : "Feminino") + "\n" +
				"Endereço: " + objPessoa.getEndereco() + "\n" +
				"UF: " + objPessoa.getObjUf().getSigla());
	}
	
}
