//Sequencia Fibonacci

package aula9_lp;

import java.util.Scanner;

public class _1_SequenciaFibonacci {

	public static void main(String[] args) {
		 
		
		int penultimo = 1;
		int ultimo = 0;
		int atual = 0;
		
		while (atual < 100000000) {
				
			atual = (penultimo + ultimo);
			System.out.println(atual);
			
			penultimo = ultimo;
			ultimo = atual;
				
		}
		
		 
		 
	}

}
