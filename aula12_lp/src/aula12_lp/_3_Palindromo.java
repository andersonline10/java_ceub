// Programa verificação de palíndromo

package aula12_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _3_Palindromo {

	public static void main(String[] args) {
		// declaração
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String texto = "";
		
		boolean palindromo = false;
		try {
			System.out.println("Digite o texto: ");
			texto = leitor.readLine();
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		
		//processamento
		
		palindromo = (true);
		texto = texto.replace(" ", "").replace("-", "").replace(",", "");
		for (int i = 0; i < (texto.length() / 2); i++) {
			if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
				palindromo = false;
			}
		}

		// saída
		if (palindromo) {
			System.out.println("Parabéns! Isso é um palíndromo!!!");
		} else {
			System.out.println("Isso não é um palíndromo");
		}
		
	}

}
