package aula4_lp;

import java.util.Scanner; 

public class _2_bParidadeSinal {
	public static void main (String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int restoDaDivisaoPorDois = 0;
		
		System.out.print("Informe um n�mero inteiro: ");
		x = leitor.nextInt();
		
		leitor.close();
		
		restoDaDivisaoPorDois = (x % 2);
		
		
		if (restoDaDivisaoPorDois == 0){
			System.out.print("N�mero par ");
		}
		else {
			System.out.print("N�mero �mpar ");
		}
		
		if (x == 0) {
			System.out.println("N�mero par n�o negativo nem positivo");
		}
	
		else if (x > 0){
		System.out.println("positivo.");
		}
		else {
		System.out.println("negativo.");
		}
		
}
}