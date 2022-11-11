//Programa encontro de valor específico em um vetor

package aula10_lp;

import java.util.Scanner;

public class _3_ValorEspecifico {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		int numero = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		System.out.print("Digite o número a ser pesquisado: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				System.out.println("Achei na posição " + i);
				return;
			}
		}
		
		System.out.println("Não achei!");
		
		

	}

}
