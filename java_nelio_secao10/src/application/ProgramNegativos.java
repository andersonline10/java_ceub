//Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois N n�meros inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros negativos lidos.

package application;

import java.util.Scanner;

public class ProgramNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i<vetor.length; i++) {
			System.out.print("Digite o n�mero inteiro: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("N�MEROS NEGATIVOS: ");
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i]<0) {
				System.out.printf("%d%n", vetor[i]);
			}
		}
					
		sc.close();
		 

	}

}
