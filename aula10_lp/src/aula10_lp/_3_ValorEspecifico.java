//Programa encontro de valor espec�fico em um vetor

package aula10_lp;

import java.util.Scanner;

public class _3_ValorEspecifico {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		int numero = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posi��o " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		System.out.print("Digite o n�mero a ser pesquisado: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				System.out.println("Achei na posi��o " + i);
				return;
			}
		}
		
		System.out.println("N�o achei!");
		
		

	}

}
