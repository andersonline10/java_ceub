// Programa cálculo do determinante da matriz

package aula11_lp;

import java.util.Scanner;

public class _1_DeterminanteMatriz {

	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		int determinante = 0;
		
		//Entrada
		
		for (int i = 0; i < matriz.length; i++) { //navega nas linhas
			for (int j = 0; j < matriz[i].length; j++) {//navega as colunas
				System.out.print("Digite o valor da posição" + "[" + i + ", " + j + "] da matriz: ");
				matriz[i][j] = leitor.nextInt();
			}
		}
				
		leitor.close();
		
		//processamento
		
		determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2] +
						matriz[0][1] * matriz[1][2] * matriz[2][0] + 
						matriz[0][2] * matriz[2][1] * matriz[1][0] -
						matriz[0][2] * matriz[1][1] * matriz[2][0] -
						matriz[0][0] * matriz[2][1] * matriz[1][2] -
						matriz[0][1] * matriz[1][0] * matriz[2][2]);
		
		System.out.println("O determinante da matriz é: " + determinante);
	}

}
