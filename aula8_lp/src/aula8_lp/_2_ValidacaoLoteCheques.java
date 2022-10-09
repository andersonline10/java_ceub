package aula8_lp;

import java.util.Scanner;
 
public class _2_ValidacaoLoteCheques {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valorTotalLote = 0;
		int qtdChequeLote = 0;
		
		double somaValores = 0;
		int qtdCheque = 0;
		
		System.out.print("Informe a quantidade de cheques no lote: ");
		qtdChequeLote = leitor.nextInt();
		
		System.out.print("Informe o valor total do lote: ");
		valorTotalLote = leitor.nextDouble();
		
		do {
			
			qtdCheque ++;
			
			System.out.print("Informe o valor do cheque: ");
			somaValores += leitor.nextDouble();
			
			System.out.print("Digite <1> se tiver mais cheques ou outro número para sair: ");
			
		} while (leitor.nextInt() == 1);
		
		
		leitor.close();
		
		if ((qtdChequeLote == qtdCheque) && (valorTotalLote == somaValores)) {
			System.out.println("Parabéns! O lote está correto!");
		} else {
			System.out.println("Vai ter que pagar a diferença!");
		}
	}

}
