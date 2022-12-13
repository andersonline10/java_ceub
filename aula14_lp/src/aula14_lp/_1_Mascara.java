package aula14_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1_Mascara {

	private static int lerNumeroInteiro(String texto) {
		BufferedReader leitor = new BufferedReader (
								new InputStreamReader(
								System.in));
		int retorno = 0;
		
		while (true) {
			try {
				System.out.print(texto);
				retorno = Integer.parseInt(leitor.readLine());
				break;
			} catch(Exception erro) {
				System.out.println("Amigão! Não tá difícil..." + 
											"digita um número aí...");
			}
		}
		
		return retorno;
	
		}
	


public static void main(String[] args) {
	int numero = 0;
	
	numero = lerNumeroInteiro("Digite um número inteiro: ");
	
	System.out.println("Número: " + numero);
	
	}
	
}
