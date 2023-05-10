package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Produto;
import negocio.Tipo;

public class ControladorGravar implements ActionListener {
	//propriedades da classe
	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> cboTipo = null;
	private JCheckBox chkPerecivel = null;
	private JTextArea txtDetalhamento = null;


	public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo, JCheckBox chkPerecivel,
			JTextArea txtDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.cboTipo = cboTipo;
		this.chkPerecivel = chkPerecivel;
		this.txtDetalhamento = txtDetalhamento;
	}


	// m�todo sobrescrito da interfaces
	public void actionPerformed(ActionEvent e) {
		//cr�ticas de dados
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigat�rio!");
			return;
		}
		if (txtPreco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo pre�o obrigat�rio!");
			return;
		}
		try {
			Double.parseDouble(txtPreco.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Campo pre�o deve ser num�rico!");
			return;
		}
		
		if (cboTipo.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo tipo obrigat�rio!");
			return;
		}
		
		if (txtDetalhamento.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo detalhamento obrigat�rio!");
			return;
		}
		
		//composi��o do objeto
		Produto objProduto = new Produto();
		objProduto.setNome(txtNome.getText());
		objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
		objProduto.setObjTipo(new Tipo(cboTipo.getSelectedItem().toString()));
		objProduto.setPerecivel(chkPerecivel.isSelected());
		objProduto.setDetalhamento(txtDetalhamento.getText());
		
		//Sa�da de dados
		
		JOptionPane.showMessageDialog(null,
				"Grava��o realizada com sucesso !!\n\n" +
				"Nome: " + objProduto.getNome() + "\n" +
				"Pre�o: " + objProduto.getPreco() + "\n" +
				"Tipo: " + objProduto.getObjTipo().getDescricao() + "\n" +
				"Perec�vel: " + (objProduto.isPerecivel() ? "SIM" : "NAO") + "\n" +
				"Detalhamento: " + objProduto.getDetalhamento());
				
		
	}

}
