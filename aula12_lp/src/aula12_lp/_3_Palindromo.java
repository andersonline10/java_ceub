// Programa verifica��o de pal�ndromo

package aula12_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _3_Palindromo {

	public static void main(String[] args) {
		// declara��o
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

		// sa�da
		if (palindromo) {
			System.out.println("Parab�ns! Isso � um pal�ndromo!!!");
		} else {
			System.out.println("Isso n�o � um pal�ndromo");
		}
		
	}

}
