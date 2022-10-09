//programa cálculo de exponencial

package aula7_lp;

import java.util.Scanner; 

public class _4_CalculoExponencial {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int base = 0;
		int expoente = 1;
		int resultado = 1;
		
		System.out.print("Informe a base: ");
		base = leitor.nextInt();
		System.out.print("Qual o expoente: ");
		expoente = leitor.nextInt();
		
		leitor.close();
		
		for(int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		
		System.out.println("O resultado calculado pelo Java é: " + Math.pow(base, expoente));
		System.out.println("O resultado calculado pelo programa é: " + resultado);
		
				
	}

}
