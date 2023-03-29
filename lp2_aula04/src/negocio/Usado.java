package negocio;

public class Usado extends Imovel{
	
	//propriedades da classe
	
	private double depreciacao = 0;

	//métodos construtores da classe
	
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}

	//métodos get/set da classe
	
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	//métodos sobrescritos da classe
	
	public double getValor() {
		return (super.getValor() - this.getDepreciacao());
	}
	
}
