package negocio;

public class Veiculo {
	
	//propriedades da classe
	private Fabricante objFabricante = null;
	private String modelo = "";
	private String cor = "";
	private boolean tetoSolar = false;
	//métodos construtores da classe
	public Veiculo() {
		super();
	}

	public Veiculo(Fabricante objFabricante, String modelo, String cor, boolean tetoSolar) {
		super();
		this.objFabricante = objFabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.tetoSolar = tetoSolar;
	}
	//métodos get /set
	public Fabricante getObjFabricante() {
		return objFabricante;
	}

	public void setObjFabricante(Fabricante objFabricante) {
		this.objFabricante = objFabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
	
}
