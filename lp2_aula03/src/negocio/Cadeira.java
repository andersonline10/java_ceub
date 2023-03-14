package negocio;

public class Cadeira {
	
	//Propriedades da classe
	private String nome = "";

	// Métodos Construtores da classe
	
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

	// métodos get/set da classe
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
