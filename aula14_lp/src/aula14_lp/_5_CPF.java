package aula14_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _5_CPF {
	private static String lerCPF() {
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
								
		String cpf = "";
		int dv1 = 0;
		int dv2 = 0;
		
		while(true) {
			
			try {
				System.out.println("Digite os 9 dígitos do CPF: ");
				cpf = leitor.readLine();
				Integer.parseInt(cpf);
				
				if (cpf.length() != 9) {
					System.out.println("Número de CPF inválido!");
					continue;
				}
				
				for (int i = 0; i < cpf.length(); i++) {
					dv1 += (10 - i) * Integer.parseInt(cpf.substring(i, i + 1));
					
				}
				
				dv1 = (11 - (dv1 % 11));
				if (dv1 >= 10) {
					dv1 = 0;
				}
				
				
				cpf += dv1;
				
				for (int i = 0; i < cpf.length(); i++) {
					dv2 += (11 - i) * Integer.parseInt(cpf.substring(i, i + 1));
					
				}
				
				dv2 = (11 - (dv2 % 11));
				if (dv2 >= 10) {
					dv2 = 0;
				}
				
				
				break;
				
				
			} catch (Exception erro) {
				System.out.println("Número de CPF inválido!");
			}
		}
	
		return cpf + dv2;
		
	}
	
	public static void main(String[] args) {
		System.out.println("CPF: " + lerCPF());
	}
}
