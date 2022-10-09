package entities;

public class AlunosNotas {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double FinalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public double Missing() {
		if (FinalGrade() < 60.0) {
			return 60.0 - FinalGrade();
		}
		else {
			return 0.0;
		}	
	}
}


