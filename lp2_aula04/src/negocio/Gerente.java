package negocio;

public class Gerente extends Colaborador {
	//propriedades da classe
	
	private double bonus = 0;

	//m�todos construtores da classe //lembrando de puxar o cheio
	
	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}

	//m�todos get/set da classe
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//m�todos sobrescritos da classe
	
	public double getSalario() {
		return super.getSalario() + this.getBonus();
	}
	
	
	
}
