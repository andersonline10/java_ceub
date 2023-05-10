package negocio;

public class Uf {
	//Propriedades da classe
	private String sigla = "";

	public Uf() {
		super();
	}
	
	//métodos construtores da classe

	public Uf(String sigle) {
		super();
		this.sigla = sigle;
	}

	//métodos get/set
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigle) {
		this.sigla = sigle;
	}
	
	
	
	
}
