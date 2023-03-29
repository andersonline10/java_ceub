package negocio;

public class Moto extends Veiculo{
	//propriedades da classe
	private int cilindrada = 0;

	//m�todos construtores
	public Moto() {
		super();
	}

	public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
		super(modelo, objFabricante, cor);
		this.cilindrada = cilindrada;
	}

	//m�todos get/set
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
}


