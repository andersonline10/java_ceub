// Programa cálculo do exponencial por meio da série de Taylor
// – eˆx = 1 + x + xˆ2/2! + xˆ3/3! + xˆ4/4! + …

package aula9_lp;

import java.util.Scanner;

public class _4_ExponencialTaylor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		double somatorio = 0;
		double exponenciacao = 1;
		double fatorial = 1;
		
		System.out.print("Digite um número: ");
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

		System.out.println("e^" + numero + " por Taylor é: " + somatorio);
		System.out.println("e^" + numero + " pelo Java é: " + Math.pow(Math.E,  numero));
	}

}
