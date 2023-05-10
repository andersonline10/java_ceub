package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Tipo {
	//propriedades da classe
	private String descricao = "";

	public Tipo() {
		super();
	}
	//m�todos construtores da classe
	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	//m�todos get/set da classe
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	//m�todos da classe
	
	public Collection<Tipo> getTodos(){
		ArrayList<Tipo> retorno = new ArrayList<Tipo>();
		retorno.add(new Tipo("Eletr�nicos"));
		retorno.add(new Tipo("Vestu�rios"));
		retorno.add(new Tipo("Higiene Pessoal"));
		retorno.add(new Tipo("Alimenta��o"));
		retorno.add(new Tipo("Livros"));
		
		return retorno;
		
	}
	
	
}
