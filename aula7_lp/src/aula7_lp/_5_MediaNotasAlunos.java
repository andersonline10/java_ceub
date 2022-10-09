// programa cálculo da média aritmética das notas dos alunos de um curso

package aula7_lp;

import java.util.Scanner;

public class _5_MediaNotasAlunos { 
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double media = 0;
		double somatorioNotas = 0;
		int qtdAlunos = 0;
				
		//entrada de dados
		
		do {
			System.out.print("Informe a nota do aluno: ");
			somatorioNotas += leitor.nextDouble();     //interessante
			qtdAlunos++;
			System.out.print("Digite <1> se houver mais alunos: ");
	} while (leitor.nextInt() == 1);
		
						
		leitor.close();
		
		//processamento
		
		media = (somatorioNotas / qtdAlunos);
		
		//saída de dados
		System.out.println("A média do curso é: " + media);
		
	}
}
		