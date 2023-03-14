package negocio;

public class Pessoa {
	
	// Propriedades (atributos) da classe
	
	private String nome = "";
	private String endereco = "";
	private int telefone = 0;

	// Métodos construtores da classe
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	// Métodos get / set da classe
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
}

