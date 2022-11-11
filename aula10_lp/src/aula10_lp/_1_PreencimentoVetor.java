//Programa preenchimento de vetor

package aula10_lp;

import java.util.Scanner;

public class _1_PreencimentoVetor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor[" + i + "] = " + vetor[i]);
		}
		
		leitor.close();

	}

}
