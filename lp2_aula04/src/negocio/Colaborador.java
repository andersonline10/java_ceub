package negocio;

public class Colaborador {
	
	//propriedades da classe
	
	private int matricula = 0;
	private String nome = "";
	private double salario = 0;
	
	// métodos construtores da classe
	
	public Colaborador() {
		super();
	}
	
	public Colaborador(int matricula, String nome, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	// métodos get/set da classe
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
