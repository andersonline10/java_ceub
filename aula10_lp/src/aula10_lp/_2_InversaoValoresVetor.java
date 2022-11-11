//Programa inversão de valores de vetor

package aula10_lp;

import java.util.Scanner;

public class _2_InversaoValoresVetor {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int[] vetorOriginal = new int[5];
		int[] vetorInvertido = new int[5];

		for (int i = 0; i < vetorOriginal.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetorOriginal[i] = leitor.nextInt();
		}

		for (int i = (vetorOriginal.length - 1); i >= 0 ; i--) {
			vetorInvertido[vetorOriginal.length -1 - i] = vetorOriginal[i];
		}

		for (int i = 0; i < vetorOriginal.length; i++) {
			System.out.println("Vetor [" + i + "] = " + vetorInvertido[i]);
		}
		
		leitor.close();

	}

}
