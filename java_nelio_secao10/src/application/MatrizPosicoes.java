/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.*/

package application;

import java.util.Scanner;

public class MatrizPosicoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, n;
		
		System.out.print("Números de linhas da matriz: ");
		m = sc.nextInt();
		
		System.out.print("Número de colunas da matriz: ");
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i< mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("[" + i + "]" + "[" + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Digite um número para achar as posições dele na matriz: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position [" + i + "][" + j + "]:");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0 ) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if ( j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
