package aula4_lp;

import java.util.Scanner; 

public class _2_bParidadeSinal {
	public static void main (String[]args) {
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int restoDaDivisaoPorDois = 0;
		
		System.out.print("Informe um número inteiro: ");
		x = leitor.nextInt();
		
		leitor.close();
		
		restoDaDivisaoPorDois = (x % 2);
		
		
		if (restoDaDivisaoPorDois == 0){
			System.out.print("Número par ");
		}
		else {
			System.out.print("Número ímpar ");
		}
		
		if (x == 0) {
			System.out.println("Número par não negativo nem positivo");
		}
	
		else if (x > 0){
		System.out.println("positivo.");
		}
		else {
		System.out.println("negativo.");
		}
		
}
}