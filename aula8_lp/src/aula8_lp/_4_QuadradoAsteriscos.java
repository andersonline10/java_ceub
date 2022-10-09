package aula8_lp;

import java.util.Scanner;

public class _4_QuadradoAsteriscos {
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in);
		
		int tamanho = 0;
		
		System.out.print("Qual o tamanho do triângulo: ");
		tamanho = leitor.nextInt();
		
		leitor.close();
		
		
		for (int i = 0; i < tamanho; i++) {  //linhas com variavel i
			for(int j = 0; j < tamanho; j++) { // colunas com variável j
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
