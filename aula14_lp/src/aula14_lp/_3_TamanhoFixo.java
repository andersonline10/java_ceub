package aula14_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _3_TamanhoFixo {
	
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
	
	private static double lerNumeroFracionario(String texto) {
		BufferedReader leitor = new BufferedReader (
								new InputStreamReader(
								System.in));
		double retorno = 0;
		
		while (true) {
			try {
				System.out.print(texto);
				retorno = Double.parseDouble(leitor.readLine());
				break;
			} catch(Exception erro) {
				System.out.println("Amig�o! N�o t� dif�cil..." + 
											"digita um n�mero a�...");
			}
		}
		
		return retorno;
		
		
		}
	
	
	
	
	private static String lerTextoDeTamanhoFixo(String texto, int tamanho) {
		BufferedReader leitor = new BufferedReader (
								new InputStreamReader(
								System.in));
		String retorno = "";
		
		while (retorno.length() != tamanho) {
			try {
				System.out.print(texto);
				retorno = leitor.readLine();
				if (retorno.length() != tamanho) {
					System.out.println("Amig�o! N�o t� dif�cil..." + 
							"digita um texto exatamente com " + tamanho + " caracteres");
				}
			} catch (Exception erro) {
				System.out.println(erro);
			}
		}
		
		return retorno;	
	}

	
	public static void main(String[] args) {
		int numero = 0;
		double fracionario = 0;
		String texto= "";
		
		numero = lerNumeroInteiro("Digite um n�mero inteiro: ");
		fracionario = lerNumeroFracionario("Digite um n�mero real: ");
		texto = lerTextoDeTamanhoFixo("Digite uma placa de carro: ", 7);
		
		System.out.println("N�mero: " + numero);
		System.out.println("Fracion�rio: " + fracionario);
		System.out.println("Placa do carro: " + texto);
		
		}
	
}
