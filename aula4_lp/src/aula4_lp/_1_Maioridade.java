package aula4_lp;

import java.util.Scanner;
 
public class _1_Maioridade {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int idade = 0;
		
		System.out.print("Informe sua idade: ");
		idade = leitor.nextInt();
		leitor.close();
		
		if (idade > 18) {
			System.out.println("A pessoa � maior de idade e pode beber.");
		}
		else {
			System.out.println("A pessoa � menor de idade e n�o pode beber.");
		}
	}

}
