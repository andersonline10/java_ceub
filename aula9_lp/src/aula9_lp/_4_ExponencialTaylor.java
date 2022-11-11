// Programa c�lculo do exponencial por meio da s�rie de Taylor
// � e�x = 1 + x + x�2/2! + x�3/3! + x�4/4! + �

package aula9_lp;

import java.util.Scanner;

public class _4_ExponencialTaylor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		double somatorio = 0;
		double exponenciacao = 1;
		double fatorial = 1;
		
		System.out.print("Digite um n�mero: ");
		numero = leitor.nextInt();
				
		leitor.close();
		
		for (int i = 0; i < 148; i++) {
			exponenciacao = 1;
			for (int j = 0; j < i; j++) {
				exponenciacao *= numero;
			}
			
			fatorial = 1;
			for (int j = i; j > 0; j--) {
				fatorial *= j;
			}
			
			somatorio += (exponenciacao / fatorial);
		}

		System.out.println("e^" + numero + " por Taylor �: " + somatorio);
		System.out.println("e^" + numero + " pelo Java �: " + Math.pow(Math.E,  numero));
	}

}
