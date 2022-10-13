//Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior n�mero do vetor (supor n�o haver empates). Mostrar tamb�m a posi��o do maior elemento,
//considerando a primeira posi��o como 0 (zero).

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
		double maior;
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();

		double[] vetor = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		posmaior = 0;
		
		for(int i=1;i<n;i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.2f\n", maior);
		System.out.printf("POSI��O DO MAIOR VALOR = %d", posmaior);
		
		sc.close();
		
		
		 

	}

}
