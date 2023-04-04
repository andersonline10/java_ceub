package negocio;

public class Cubo implements Solido{
	
	//propriedades da classe
	
	private double aresta = 0;

	//construtores da classe
	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}

	//getters and setters da classe
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	//métodos implementados da interface
	
	public double calcularArea() {
		return (6 * Math.pow(getAresta(), 2));
	}
	
	public double calcularVolume() {
		return (6 * Math.pow(getAresta(), 3));
	}
	
}
