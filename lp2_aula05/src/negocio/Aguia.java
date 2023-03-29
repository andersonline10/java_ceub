package negocio;

public class Aguia extends Ave {
	private double autonomia = 0;
	//m�todos construtores
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, double quantidadeOvos, double autonomia) {
		super(peso, altura, nome, quantidadeOvos);
		this.autonomia = autonomia;
	}
	// m�todos get and set
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	//m�todo da classe
	public void voar() {
		System.out.println("Fly like and eagle, into the future !");
	}
	
}
