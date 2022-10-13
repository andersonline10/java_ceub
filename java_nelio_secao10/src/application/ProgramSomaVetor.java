// Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a m�dia dos elementos do vetor

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int n;
		double soma = 0.0, media;
		
		System.out.print("Quantos n�meros voc� vai digitar: ");
		n = sc.nextInt();
				
		double[] vetor = new double[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextDouble();
		}
		
		
		for (int i=0; i<vetor.length;i++) {
			soma += vetor[i];
		}
		
		media = soma / n;
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i= 0; i<vetor.length;i++) {
			System.out.printf("%.2f  ", vetor[i]);
		}
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("M�DIA = %.2f%n", media);
				
		
		sc.close();

	}

}
