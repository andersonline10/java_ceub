// 14. Elabore um algoritmo que solicite ao usuário 10 números reais e ao final apresente o
// maior e o menor deles.


package java_exercicios_lista3;

import java.util.Scanner;

public class _14_WhileNumerosReaisMaiorMenor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double numero = 0;
		double guardaMenor = 0;
		double guardaMaior = 0;
		
		int i = 1;
		
		System.out.print("Informe o 1o número: ");
		numero = leitor.nextDouble();
		
		guardaMenor = numero;
		guardaMaior = numero;
		
		while (i < 10) {
			System.out.printf("Informe o %do número: ", i+1);
			numero = leitor.nextDouble();
			if (numero > guardaMaior){
				guardaMaior = numero;
			}
			
			else if (numero < guardaMenor) {
				guardaMenor = numero;
			}
			i+=1;
		}
		leitor.close();
		System.out.println("O número maior é o " + guardaMaior + ".");
		System.out.println("O número menor é o " + guardaMenor + ".");
	}
}
