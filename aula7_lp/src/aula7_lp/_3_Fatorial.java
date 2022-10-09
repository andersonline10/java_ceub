//Programa cálculo do fatorial

package aula7_lp;

import java.util.Scanner; 

public class _3_Fatorial {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		double fatorial = 1;
		
		
		
		System.out.print("Informe um número: ");
		numero = leitor.nextInt();
		
		
		for (int x = numero; x > 0; x--){
			fatorial *= x; 
		}
		
		System.out.println(numero + "! = " + fatorial);
		
		
		leitor.close();
	}

}

