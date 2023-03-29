package negocio;

public abstract class Ave extends Animal{
	//Propriedades da classe
	private double quantidadeOvos = 0;

	//métodos construtores
	public Ave() {
		super();
	}
	
	public Ave(double peso, double altura, String nome, double quantidadeOvos) {
		super(peso, altura, nome);
		this.quantidadeOvos = quantidadeOvos;
	}
	
	//métodos get/set da classe

	public double getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(double quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
	
	
	
	
}
