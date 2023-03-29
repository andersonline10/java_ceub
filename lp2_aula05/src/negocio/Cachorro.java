package negocio;

public class Cachorro extends Mamifero{
	//propriedades da classe
	private double forcaMordida = 0;

	//m�todos construtores
	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, double litrosLeite, double forcaMordida) {
		super(peso, altura, nome, litrosLeite);
		this.forcaMordida = forcaMordida;
	}

	//m�todos get/set
	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	// M�todos da classe
	
	public void morder() {
		System.out.println("Wolf! Wolf!");
	}
	
	
}
