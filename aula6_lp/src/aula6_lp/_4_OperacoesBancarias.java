package aula6_lp;

import java.util.Scanner;

public class _4_OperacoesBancarias {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double saldoInicial = 0; 
		int tipoOperacao = 0;
		double valorOperacao = 0;
		double saldoFinal = 0;
		
		
		System.out.print("Informe o saldo inicial: ");
		saldoInicial = leitor.nextDouble();
		
		System.out.print("Digite <1> para saque ou <2> para depósito: ");
		tipoOperacao = leitor.nextInt();
		
		System.out.print("Informe o valor da operação: ");
		valorOperacao = leitor.nextDouble();

		leitor.close();
		
		if (tipoOperacao == 1) {
			saldoFinal = saldoInicial - valorOperacao; 
		} else if (tipoOperacao == 2) {
			saldoFinal = saldoInicial + valorOperacao;
		}
		
		if ((tipoOperacao != 1) && (tipoOperacao != 2)) {
			System.out.println("Informe 1 ou 2! ");	
		} else {
			System.out.println("O valor do saldo final é " + saldoFinal);	
		}
	}
}
