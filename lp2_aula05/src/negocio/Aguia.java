package negocio;

public class Aguia extends Ave {
	private double autonomia = 0;
	//métodos construtores
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, double quantidadeOvos, double autonomia) {
		super(peso, altura, nome, quantidadeOvos);
		this.autonomia = autonomia;
	}
	// métodos get and set
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	//método da classe
	public void voar() {
		System.out.println("Fly like and eagle, into the future !");
	}
	
}
