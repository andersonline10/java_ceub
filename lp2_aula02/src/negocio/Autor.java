package negocio;

public class Autor {
	
	//Propriedades da classe
	
	private String nome = "";

	//Métodos Construtores
	
	public Autor() {
		
	}
	
	public Autor(String nome) {
		this.nome = nome;
	}
	
	// métodos get/set da classe
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
