package negocio;

public class Produto {
	//propriedades da classe
	private String nome ="";
	private double preco = 0;
	private Tipo objTipo = null;
	private boolean perecivel = false;
	private String detalhamento = "";
	
	//m�todos construtores da classe
	
	public Produto() {
		super();
	}

	public Produto(String nome, double preco, Tipo objTipo, boolean perecivel, String detalhamento) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.objTipo = objTipo;
		this.perecivel = perecivel;
		this.detalhamento = detalhamento;
	}
	//m�todos get/set da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Tipo getObjTipo() {
		return objTipo;
	}

	public void setObjTipo(Tipo objTipo) {
		this.objTipo = objTipo;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}
	
	
	
	

}
