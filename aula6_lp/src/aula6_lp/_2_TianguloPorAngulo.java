package aula6_lp;

import java.util.Scanner;

public class _2_TianguloPorAngulo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double angulo1 = 0;
		double angulo2 = 0;
		double angulo3 = 0;
		
		System.out.print("Digite o valor do primeiro ângulo: ");
		angulo1 = leitor.nextDouble();
		
		System.out.print("Digite o valor do segundo ângulo: ");
		angulo2 = leitor.nextDouble();
				
		System.out.print("Digite o valor do terceiro ângulo: ");
		angulo3 = leitor.nextDouble();
				
		leitor.close();
		
		if ((angulo1 + angulo2 + angulo3) != 180) {
			System.out.println("Isso não é um triângulo!");
		} else if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
			System.out.println("Triângulo retângulo!");
		} else if ((angulo1 > 90) || (angulo2 > 90) || (angulo3 > 90)) {
			System.out.println("Triângulo obtuso!");
		}  
		else {
			System.out.println("Triângulo agudo!");
		}
	}

}
