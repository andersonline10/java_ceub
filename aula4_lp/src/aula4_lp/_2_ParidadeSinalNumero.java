package aula4_lp;

import java.util.Scanner;

public class _2_ParidadeSinalNumero {
	public static void main (String[]args) { 
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int restoDaDivisaoPorDois = 0;
		
		System.out.print("Informe um n�mero inteiro: ");
		x = leitor.nextInt();
		
		leitor.close();
		
		restoDaDivisaoPorDois = (x % 2);
		
		if (x == 0) 
		{
			System.out.println("N�mero par n�o negativo nem positivo");
		}
		
		else if ((restoDaDivisaoPorDois == 0) && (x > 0)) 
		{
			System.out.println("Esse � um par positivo.");
		}
		
		else if ((restoDaDivisaoPorDois == 0) && (x < 0)) 
		{
			System.out.println("Esse � um par negativo.");
		}
		
		else if ((restoDaDivisaoPorDois != 0) && (x > 0)) 
		{
			System.out.println("Esse � um �mpar positivo.");
		}
		else if ((restoDaDivisaoPorDois != 0) && (x < 0)) 
		{
			System.out.println("Esse � um �mpar negativo.");
		}
	}

}
