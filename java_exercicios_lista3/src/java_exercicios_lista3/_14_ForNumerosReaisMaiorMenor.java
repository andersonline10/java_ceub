// 14. Elabore um algoritmo que solicite ao usu�rio 10 n�meros reais e ao final apresente o
// maior e o menor deles.


package java_exercicios_lista3;

import java.util.Scanner;

public class _14_ForNumerosReaisMaiorMenor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double numero = 0;
		double guardaMenor = 0;
		double guardaMaior = 0;
		
		
		System.out.printf("Informe o 1o n�mero: ");
		numero = leitor.nextDouble();
		
		guardaMenor = numero;
		guardaMaior = numero;
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("Informe o %do n�mero: ", i+1);
			numero = leitor.nextDouble();
			if (numero > guardaMaior){
				guardaMaior = numero;
			}
			
			else if (numero < guardaMenor) {
				guardaMenor = numero;
			}
		}
		leitor.close();
		System.out.println("O n�mero maior � o " + guardaMaior + ".");
		System.out.println("O n�mero menor � o " + guardaMenor + ".");
	}
}
