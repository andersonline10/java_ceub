package aula4_lp;

import java.util.Scanner;

public class _3_SalarioFuncionarios {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int cargo = 0;
		double salarioVelho = 0; 
		double salarioNovo = 0;
		
		
		System.out.println("            +====================+");
		System.out.println("            |  Opções de cargo:  |");
		System.out.println("            |  0 - Oreia Seca    |");
		System.out.println("            |  1 - Gerente       |");
		System.out.println("            |  2 - Big Dick      |");
		System.out.println("            +====================+");
		System.out.print("Digite o cargo do colaborador: ");
		cargo = leitor.nextInt();
		
		System.out.print("Informe o valor do salário antigo do funcionário: ");
		salarioVelho= leitor.nextDouble();
		
		leitor.close();
		
		if (cargo == 0) {
			salarioNovo = salarioVelho * 1.10;
		}
		else if (cargo == 1) {
			salarioNovo = salarioVelho * 1.20;
		}
		else if (cargo == 2) {
			salarioNovo = salarioVelho * 1.30;	
		}
		
		System.out.println("O valor do novo salário do funcionário é de R$ " + salarioNovo + ".");
		
	}

}
