//Programa criação da matriz transposta
// –original[m][n]
// –transposta[n][m]

package aula11_lp;

import java.util.Scanner;

public class _2_MatrizTransposta {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int [][] matrizOriginal = new int[2][3];
		int [][] matrizTransposta = new int[3][2];
		
		for (int i = 0; i < matrizOriginal.length; i++) { //navega nas linhas
			for (int j = 0; j < matrizOriginal[i].length; j++) {//navega as colunas
				System.out.print("Matriz [" + i + ", " + j + "] = ");
				matrizOriginal[i][j] = leitor.nextInt();
				}
			}
		
		leitor.close();
		
		//processamento
		
		for (int i = 0; i < matrizOriginal.length; i++) {  
			for (int j = 0; j < matrizOriginal[i].length; j++) {
				matrizTransposta[j][i] = matrizOriginal[i][j];
			}
		}
		
		//saída
		
		for (int i = 0; i < matrizOriginal.length; i++) { 
			for (int j = 0; j < matrizOriginal[i].length; j++) {
				System.out.print(matrizOriginal[i][j] + "\t");
				}
			System.out.println();
			}
		System.out.println();
		for (int i = 0; i < matrizTransposta.length; i++) { 
			for (int j = 0; j < matrizTransposta[i].length; j++) {
				System.out.print(matrizTransposta[i][j] + "\t");
				}
			System.out.println();
			}
	
	}

}
