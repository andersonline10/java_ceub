package aula1_lp;
import java.util.Scanner;

public class Aula1CalcFull {
	public static void main (String[] args) {
		// declarar vari�veis 
		Scanner leitor = new Scanner(System.in);
		
		double primeiroNumero = 0;
		double segundoNumero = 0;
		double resultado = 0;
		int operacao = 0;
		
		// Entrada de dados
		System.out.print("Digite o primeiro n�mero: ");
		primeiroNumero = leitor.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		segundoNumero = leitor.nextDouble();
		
		System.out.print("Escolha a opera��o desejada: 1-Soma 2-Subtra��o 3-Multiplica��o 4-Divis�o: ");
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
		
		
		// Sa�da de dados
		System.out.printf("O resultado da opera��o escolhida entre os n�meros %.2f e %.2f � %.2f.%n", primeiroNumero, segundoNumero, resultado);
		
	}

}
