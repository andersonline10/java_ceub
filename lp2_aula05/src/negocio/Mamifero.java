package negocio;

public abstract class Mamifero extends Animal {
	// Propriedades da classe
	private double litrosLeite = 0;

	// m�todos construtores da classe
	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, double litrosLeite) {
		super(peso, altura, nome);
		this.litrosLeite = litrosLeite;
	}

	//m�todos get/set da classe
	public double getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(double litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
	
	
}
