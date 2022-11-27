//Programa ordenação de vetor de strings

package aula12_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4_OrdenacaoDireta {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String[] vetor = new String[10];
		
		// entrada de dados
		
		try {
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Digite o valor da posicao " + (i+1) + " do vetor: ");
				vetor[i] = leitor.readLine();

			}
			
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		//processamento
		for (int i = 0; i < (vetor.length - 1); i++) { // do primeiro ao penúltimo
			for (int j = (i + 1); j < vetor.length; j++) {
				if (vetor[i].compareTo(vetor[j]) > 0) { //// maior que zero se for do menor pro maior 
					String temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		
		
		// saída
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
