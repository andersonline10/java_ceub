package negocio;

public class Fabricante {
	//propriedades da classe
	private String nome = "";
	
	//m�todos construtores
	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	
	//m�todos get/set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
