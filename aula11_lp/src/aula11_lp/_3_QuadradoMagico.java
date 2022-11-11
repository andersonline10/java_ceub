// Programa verifica��o do quadrado m�gico�somat�rio linhas = colunas = diagonais

package aula11_lp;

import java.util.Scanner;

public class _3_QuadradoMagico {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		int somaPadrao = 0;
		int soma = 0;
		boolean quadradoMagico = false;
		
		//entrada de dados
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite a posi��o [" + i + "," + j + "]: ");
				matriz[i][j] = leitor.nextInt();
			}
		}
		leitor.close();
		
		//processamento
		//diagonal principal
		for (int i = 0; i < matriz.length; i++) {
			somaPadrao += matriz[i][i];
		}
		
		quadradoMagico = true;
		
		//diagonal invertida
		
		soma = 0;
		
		for (int i = 0; i < matriz.length; i++){
			soma+= matriz[i][matriz.length - 1 - i];
		}
		if (soma != somaPadrao) {
			quadradoMagico = false;
		}
		
		// Linhas
		
		for (int i = 0; i < matriz.length; i++) {
			soma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
			if (soma != somaPadrao) {
				quadradoMagico = false;
			}
		}
		
		// Colunas
		
		for (int i = 0; i < matriz.length; i++) {
			soma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[j][i];
			}
			if (soma != somaPadrao) {
				quadradoMagico = false;
			}
		}
		
		// sa�da
		
		if (quadradoMagico) {
			System.out.println("Parab�ns !!! Isso � um quadrado m�gico !");
		} else {
			System.out.println("Isso N�O � um quadrado m�gico !");
		}
	}

}
