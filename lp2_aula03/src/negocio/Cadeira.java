package negocio;

public class Cadeira {
	
	//Propriedades da classe
	private String nome = "";

	// M�todos Construtores da classe
	
	public Cadeira() {
		super();
	}

	public Cadeira(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// m�todos get/set da classe
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
