package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Fabricante {
	//propriedades da classe
	private String nome = "";

	// métodos construtores da classe

	public Fabricante() {
		super();
	}
	
	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	
	//métodos get/set da classe	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//métodos da classe
	public Collection<Fabricante> getTodos(){
		ArrayList<Fabricante> colecao = new ArrayList<Fabricante>();
		
		colecao.add(new Fabricante("Audi"));
		colecao.add(new Fabricante("BMW"));
		colecao.add(new Fabricante("Chery"));
		colecao.add(new Fabricante("Ferrari"));
		colecao.add(new Fabricante("Hyunday"));
		colecao.add(new Fabricante("Porsche"));
		colecao.add(new Fabricante("Volvo"));
		
		return colecao;
	}
	
}
