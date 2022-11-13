//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1� e 2� semestres. Cada uma dessas informa��es deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja m�dia das notas seja maior ou
//igual a 6.0 (seis).

package application;

import java.util.Locale;
import java.util.Scanner;

import entities._4_Aprovados;

public class _4_AlunosAprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double media;
		
		System.out.print("Quantos alunos ser�o digitados? ");
		n = sc.nextInt();
		
		_4_Aprovados [] vect =  new _4_Aprovados[n];
		
		for (int i = 0; i < vect.length; i++ ) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new _4_Aprovados(nome, nota1, nota2);
		}
		
		for (int i = 0; i < vect.length; i++) {
			media = ((vect[i].getNota1()+ vect[i].getNota2()) / 2);
				if (media >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
		

	}

}
