//Programa convers�o de base bin�ria para decimal

package aula12_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1_BinarioDecimal {

	public static void main(String[] args) {
		//declaracao
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String binario = "";
		int decimal = 0;
		
		//entrada
		try {
			System.out.print("Digite um n�mero bin�rio: ");
			binario = leitor.readLine();
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// processamento
		for (int i=0; i < binario.length(); i++) {
			if (binario.substring(i, i+1).equals("1")){ //1 de booleano (verdadeiro)
				decimal += Math.pow(2,  binario.length() - 1 - i);
			}
		}
		
		//sa�da
		System.out.println("O n�mero decimal equivalente �: " + decimal);
	}

}
