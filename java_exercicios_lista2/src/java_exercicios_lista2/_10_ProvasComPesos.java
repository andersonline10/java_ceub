//10. O sistema de avalia��o de determinada disciplina � composto por tr�s provas. A primeira
//prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Considerando que a
//m�dia para aprova��o � 6.0, fa�a um algoritmo para calcular a m�dia final de um aluno
//desta disciplina e dizer se o aluno foi aprovado ou n�o


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
			System.out.println("O aluno foi aprovado com a m�dia " + mediaFinal + ".");
		}
		else {
			System.out.println("O aluno foi reprovado com a m�dia" + mediaFinal + ".");
		}
				
				
		
		
		
		
		
		
		
		
	}

}
