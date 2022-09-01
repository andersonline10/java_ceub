package aula4_lp;

import java.util.Scanner;

public class _4_AprovacaoAvalSubstutiva {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double prova1 = 0;
		double prova2 = 0; 
		double prova3 = 0;
		double media = 0;
		double provaSub = 0;
		
		System.out.print("Informe o resultado da prova 1: ");
		prova1 = leitor.nextDouble();
		System.out.print("Informe o resultado da prova 2: ");
		prova2 = leitor.nextDouble();
		System.out.print("Informe o resultado da prova 3: ");
		prova3 = leitor.nextDouble();
		
		media = (prova1 + prova2 + prova3)/3;
		
		if (media >= 5) {
			System.out.println("Parabéns! Você passou!");
		}
		else {
			System.out.println("Aluno não passou. Qual o valor da nota substitutiva? ");
			provaSub = leitor.nextDouble();
			
			if (provaSub >= 5 ) {
				System.out.println("Parabéns!!! Você passou! Vá beber!");
			}
			else {
				System.out.println("Reprovado!!!");
			}
			leitor.close();
		}
		
		
		
		}
		
			//pergunte prova1, prova 2, prova 3
			//calcular a media simples
			//>= 5 passou
			//< 5 perguntar a substitutiva
			//>= 5 passou
			//<5 reprovou
		
	

}
	

