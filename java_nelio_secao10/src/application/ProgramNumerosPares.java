//Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os n�meros pares, e tamb�m a quantidade de n�meros pares.

package application;

import java.util.Scanner;

public class ProgramNumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, qtdPares = 0;
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nN�MEROS PARES: ");
		
		for(int i =0;i<n;i++) {
			if ((vetor[i] % 2) == 0) {
				System.out.printf("%d  ", vetor[i]);
				qtdPares++;
				
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + qtdPares);
		
		sc.close();
		

	}

}
