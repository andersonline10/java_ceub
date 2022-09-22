package aula6_lp;

import java.util.Scanner;

public class _3_Equacao2Grau {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		
		double delta = 0;
		
		double raiz1 = 0;
		double raiz2 = 0;
		
		System.out.print("Informe a vari�vel a: ");
		a = leitor.nextDouble();
		
		System.out.print("Informe a vari�vel b: ");
		b = leitor.nextDouble();

		System.out.print("Informe a vari�vel c: ");
		c = leitor.nextDouble();

		leitor.close();
		
		delta = ((Math.pow(b, 2) - 4 * a * c));
		
		if (delta >= 0) {
			raiz1 =  ((-b + Math.sqrt(delta)) / (2 * a));
			raiz2 =  ((-b - Math.sqrt(delta)) / (2 * a));
		}
		
		
		if (delta < 0) {
			System.out.println("N�o h� raizes reais para essa equa��o!");
		} else if (delta == 0) {
			System.out.println("S� h� 1 (uma) raiz real para essa equa��o: " + raiz1);
		} else 
			System.out.println("H� 2 (duas ra�zes reais para essa equa��o: " + raiz1 + ", " + raiz2 + ")");
		}		
}

