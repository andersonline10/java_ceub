package aula3_lp;

import java.util.Scanner;

public class Aula3MediaNotas {
	public static void main(String[]args) {
		//declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		double prova1 = 0;
		double prova2 = 0;
		double prova3 = 0;
		
		double mediaAritmetica = 0;
		double mediaPonderada = 0;
		
		//entrada de dados
		
		System.out.print("Informe a nota da primeira prova: ");
		prova1 = leitor.nextDouble();
		System.out.print("Informe a nota da segunda prova: ");
		prova2 = leitor.nextDouble();
		System.out.print("Informe a nota da terceira prova: ");
		prova3 = leitor.nextDouble();
		leitor.close();
		
		//processamento
		
		mediaAritmetica = (prova1 + prova2 + prova3)/3;
		mediaPonderada = (prova1*1 + prova2*2 + prova3*3)/(1+2+3);
				
		//sa�da
		System.out.printf("A m�dia aritm�tica �: %.2f.%n", mediaAritmetica);
		System.out.printf("A m�dia ponderada �: %.2f.%n", mediaPonderada);
		
		//System.out.println("A m�dia aritm�tica �: " + mediaAritmetica);
		//System.out.println("A m�dia ponderada �: " + mediaPonderada);
		
		
				
		
	}
	

}
