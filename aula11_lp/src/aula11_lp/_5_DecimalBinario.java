package aula11_lp;

import java.util.Scanner;

public class _5_DecimalBinario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int decimal = 0;
		int[] vetor = new int[1000];
		int tamanhoVetor = 0;
		
		//Entrada de dados
		
		System.out.print("Digite um número decimal: ");
		decimal = leitor.nextInt();
		
		leitor.close();
		
		do {
			vetor[tamanhoVetor] = (decimal % 2);
			tamanhoVetor++;
			decimal = (decimal /2);
			
		} while (decimal > 0);
		
		//saída
		for (int i = (tamanhoVetor - 1); i>=0; i--) {
			System.out.print(vetor[i]);
		}
		
		
	}

}
