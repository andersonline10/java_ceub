//Prorama leitura via teclado com máscara

package aula7_lp;

import java.util.Scanner;

public class _1_LeituraTecladoMascara {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		 
		int numero = 0;
		
		
		do {
			System.out.print("Entre com um número entre 10 e 20: ");
			numero = leitor.nextInt();
		} while (numero < 10 || numero > 20);
		
		leitor.close();
		
		System.out.println("Obrigado por ter digitado: " + numero);
	}

}
