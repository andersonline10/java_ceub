// Programa multiplicação de matrizes
//–operando1[m][p]
//–operando2[p][n]
//–resultado [m][n]

package aula11_lp;

import java.util.Scanner;

public class _4_MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		int[][] operando1 = new int[2][3];
		int[][] operando2 = new int[3][2];
		int[][] resultado = new int[2][2];
		
		//entrada
		for (int i = 0; i < operando1.length; i++) {
			for (int j = 0; j < operando1[i].length; j++) {
				System.out.print("Operando1[" + i + "," + j + "] = ");
				operando1[i][j] = leitor.nextInt();
			}
		}
		
		for (int i = 0; i < operando2.length; i++) {
			for (int j = 0; j < operando2[i].length; j++) {
				System.out.print("Operando2[" + i + "," + j + "] = ");
				operando2[i][j] = leitor.nextInt();
			}
		}
		
		
		leitor.close();

	// Processamento
		for (int i = 0; i < operando1.length; i++) {
			for (int j = 0; j < operando2[i].length; j++) {
				for (int k = 0; k < operando1[i].length; k++) {
					resultado[i][j] += operando1[i][k] * operando2[k][j];
				}
			}
		}
		
		// saída de dados
		for (int i = 0; i < operando1.length; i++) {
			for (int j = 0; j < operando2[i].length; j++) {
				System.out.print(resultado[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
