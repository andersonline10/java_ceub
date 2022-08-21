package aula1_lp;
import java.util.Scanner;

public class Aula1CalcFull {
	public static void main (String[] args) {
		// declarar variáveis 
		Scanner leitor = new Scanner(System.in);
		
		double primeiroNumero = 0;
		double segundoNumero = 0;
		double resultado = 0;
		int operacao = 0;
		
		// Entrada de dados
		System.out.print("Digite o primeiro número: ");
		primeiroNumero = leitor.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		segundoNumero = leitor.nextDouble();
		
		System.out.print("Escolha a operação desejada: 1-Soma 2-Subtração 3-Multiplicação 4-Divisão: ");
		operacao = leitor.nextInt();
				
		leitor.close();
		
				
		// Processamento
		if (operacao == 1) {
			resultado = (primeiroNumero + segundoNumero);
		}
		else if (operacao == 2) {
			resultado = (primeiroNumero - segundoNumero);
		}
		else if (operacao == 3) {
			resultado = (primeiroNumero * segundoNumero);
		}
		else if (operacao == 4) {
			resultado = (primeiroNumero / segundoNumero);
		}
		
		
		// Saída de dados
		System.out.printf("O resultado da operação escolhida entre os números %.2f e %.2f é %.2f.%n", primeiroNumero, segundoNumero, resultado);
		
	}

}
