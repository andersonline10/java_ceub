//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAbaixoMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma=0, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vetor= new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
			
		for(int i=0;i<n;i++) {
			soma += vetor[i];
		}

		media = soma / n;
		
		System.out.printf("\nMEDIA DO VALOR: %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for(int i=0;i<n;i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		
		sc.close();
		
	}

}
