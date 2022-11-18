//Fazer um programa para ler um n�mero inteiro N e uma matriz de
//ordem N contendo n�meros inteiros. Em seguida, mostrar a diagonal
//principal e a quantidade de valores negativos da matriz.

package application;

import java.util.Scanner;

public class MatrizDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
		System.out.print("Digite quantas linhas e colunas ter� a matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Digite o valor da posi��o " + "[" + i + "," + j + "] da matriz: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
				
				
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Quantidade de n�meros negativos: " + count);
		
		
		sc.close();
		

	}

}
