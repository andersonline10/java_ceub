package negocio;

public class Leopardo extends Mamifero{
	private double velocidade = 0;
	//métodos construtores da classe
	public Leopardo() {
		super();
	}

	public Leopardo(double peso, double altura, String nome, double litrosLeite, double velocidade) {
		super(peso, altura, nome, litrosLeite);
		this.velocidade = velocidade;
	}
	//métodos get/set da classe
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//métodos da classe
	public void correr() {
		System.out.println("Run forest !");
	}
}
