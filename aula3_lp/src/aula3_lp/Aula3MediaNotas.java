package aula3_lp;

import java.util.Scanner;

public class Aula3MediaNotas {
	public static void main(String[]args) {
		//declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0; 
		//entrada de dados
		System.out.print("Informe a primeira nota: ");
		nota1 = leitor.nextDouble();
		System.out.print("Informe a segunda nota: ");
		nota2 = leitor.nextDouble();
		System.out.print("Informe a terceira nota: ");
		nota3 = leitor.nextDouble();
		System.out.print("Informe a quarta nota: ");
		nota4 = leitor.nextDouble();
		leitor.close();
		//processamento
		media = (nota1 + nota2 + nota3 + nota4)/4;
		//sa�da
		System.out.printf("A m�dia do aluno � %.2f.", media);
				
		
	}
	

}
