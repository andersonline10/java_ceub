//10. O sistema de avaliação de determinada disciplina é composto por três provas. A primeira
//prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Considerando que a
//média para aprovação é 6.0, faça um algoritmo para calcular a média final de um aluno
//desta disciplina e dizer se o aluno foi aprovado ou não


package java_exercicios_lista2;

import java.util.Scanner;

public class _10_ProvasComPesos {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double prova1 = 0;
		double prova2 = 0;
		double prova3 = 0;
		double mediaFinal = 0;
		
		System.out.print("Informe a nota da prova 1: ");
		prova1 = leitor.nextDouble();	
		System.out.print("Informe a nota da prova 2: ");
		prova2 = leitor.nextDouble();	
		System.out.print("Informe a nota da prova 3: ");
		prova3 = leitor.nextDouble();
		
		leitor.close();
		
		mediaFinal = (prova1*2 + prova2*3 + prova3*5)/10;
				
		if (mediaFinal >= 6) {
			System.out.println("O aluno foi aprovado com a média " + mediaFinal + ".");
		}
		else {
			System.out.println("O aluno foi reprovado com a média" + mediaFinal + ".");
		}
				
				
		
		
		
		
		
		
		
		
	}

}
