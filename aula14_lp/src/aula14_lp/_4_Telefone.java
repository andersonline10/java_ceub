package aula14_lp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4_Telefone {
	
	private static String lerNumeroDeTelefone() {
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								System.in));
								
		String telefone ="";
		boolean tudoCerto = true;
		
		do {
			
			try {
				System.out.println("Digite o número do telefone: ");
				telefone = leitor.readLine();
			} catch (Exception erro) {
				System.out.println(erro);
			}
			
			tudoCerto = true;
			
			
			if (telefone.length() != 18) {
				tudoCerto = false;
				continue;
			}
			
			if (! telefone.substring(0, 1).equals("+")) {
				tudoCerto = false;
			}
			
			try {
				Integer.parseInt(telefone.substring(1, 3));
			} catch(Exception erro) {
				tudoCerto = false;
			}
			
			if (! telefone.substring(3, 4).equals("(")) {
				tudoCerto = false;
			}
			
			try {
				Integer.parseInt(telefone.substring(4, 7));
			} catch(Exception erro) {
				tudoCerto = false;
			}
			
			if (! telefone.substring(7, 8).equals(")")) {
				tudoCerto = false;
			}
			
			try {
				Integer.parseInt(telefone.substring(8, 13));
			} catch(Exception erro) {
				tudoCerto = false;
			}
			
			if (! telefone.substring(13, 14).equals("-")) {
				tudoCerto = false;
			}
			
			try {
				Integer.parseInt(telefone.substring(14));
			} catch(Exception erro) {
				tudoCerto = false;
			}
			
			
		} while (! tudoCerto);
		
		return telefone;
		
	}

	public static void main(String[] args) {
		System.out.println("Telefone: " + lerNumeroDeTelefone());
	}
	
}
