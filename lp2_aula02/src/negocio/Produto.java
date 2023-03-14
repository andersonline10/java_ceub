package negocio;

public class Produto {
	
	// Propriedades da classe
	
	private String nome = "";
	private Estante objEstante = null;
	private int quantidade = 0;
	
	//métodos construtores
	
	public Produto() {
		super();
	}
	
	
	public Produto(String nome, Estante objEstante, int quantidade) {
		super();
		this.nome = nome;
		this.objEstante = objEstante;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Estante getObjEstante() {
		return objEstante;
	}


	public void setObjEstante(Estante objEstante) {
		this.objEstante = objEstante;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//construtores get/set
	
	
	
	

}
