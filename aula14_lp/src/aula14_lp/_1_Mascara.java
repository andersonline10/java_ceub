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
				System.out.println("Amig�o! N�o t� dif�cil..." + 
											"digita um n�mero a�...");
			}
		}
		
		return retorno;
	
		}
	


public static void main(String[] args) {
	int numero = 0;
	
	numero = lerNumeroInteiro("Digite um n�mero inteiro: ");
	
	System.out.println("N�mero: " + numero);
	
	}
	
}
