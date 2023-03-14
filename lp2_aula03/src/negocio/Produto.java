package negocio;

public class Produto {
	//Propriedades da classe
	
	private String nome = "";
	private Tipo objtipo = null;
	private double preco = 0;
	
	// M�todos construtores da classe
	public Produto() {
		super();
	}
	
	public Produto(String nome, Tipo objtipo, double preco) {
		super();
		this.nome = nome;
		this.objtipo = objtipo;
		this.preco = preco;
	}
	
	// M�todos get/set da classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getObjtipo() {
		return objtipo;
	}

	public void setObjtipo(Tipo objtipo) {
		this.objtipo = objtipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
