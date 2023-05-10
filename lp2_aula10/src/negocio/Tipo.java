package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Tipo {
	//propriedades da classe
	private String descricao = "";

	public Tipo() {
		super();
	}
	//métodos construtores da classe
	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	//métodos get/set da classe
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	//métodos da classe
	
	public Collection<Tipo> getTodos(){
		ArrayList<Tipo> retorno = new ArrayList<Tipo>();
		retorno.add(new Tipo("Eletrônicos"));
		retorno.add(new Tipo("Vestuários"));
		retorno.add(new Tipo("Higiene Pessoal"));
		retorno.add(new Tipo("Alimentação"));
		retorno.add(new Tipo("Livros"));
		
		return retorno;
		
	}
	
	
}
