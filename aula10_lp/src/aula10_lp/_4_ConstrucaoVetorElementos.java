// Programa construção de vetor com os elementos do vetor
// origem maiores que um valor estabelecido

package aula10_lp;

import java.util.Scanner;

public class _4_ConstrucaoVetorElementos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int[1000];
		int[] vetorValoresMaiores = new int[1000];
		int quantidadeDeValoresMaiores = 0;
		int numero = 0;
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			vetorOriginal[i] = ((int) (1000 * Math.random()));
		}
		
		System.out.print("Digite um número: ");
		numero = leitor.nextInt();
		
		leitor.close();
		
		//Processamento
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			if (vetorOriginal[i] > numero) {
				vetorValoresMaiores[quantidadeDeValoresMaiores] = vetorOriginal[i];
				quantidadeDeValoresMaiores++;
			}
		}
		
		//Saída de dados
		
		for (int i = 0; i < quantidadeDeValoresMaiores; i++) {
			System.out.println("vetor[" + i + "] = " + vetorValoresMaiores[i]);
		}

	}

}
