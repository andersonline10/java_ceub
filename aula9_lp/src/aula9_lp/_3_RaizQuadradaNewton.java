//Programa cálculo da raíz quadrada de um número pelo método de Newton
// – Randomize uma estimativa r
// – Substitua r pela média entre r e x/r
// – Repita até atingir a precisão desejada

package aula9_lp;

import java.util.Scanner;

public class _3_RaizQuadradaNewton {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double numero = 0;
		double estimativa = 0;
		double media = 0;
		
		System.out.print("Digite um número: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		estimativa = (numero /2);
		
		for (int i = 0; i < 50; i++) {
			System.out.println(i  + "\t" +estimativa);
			estimativa = ((estimativa + (numero / estimativa)) / 2);
		}

		System.out.println("Raiz quadrada por Newton: " + estimativa);
		System.out.println("Raiz quadrada pelo Java: " + Math.sqrt(numero));
	
		
	}

}
