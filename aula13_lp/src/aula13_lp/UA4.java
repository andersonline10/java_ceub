package aula13_lp;

import java.util.Scanner;

public class UA4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		
		int numero = -1;
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		int soma4 = 0;
		int soma5 = 0;
		int soma6 = 0;
		double somaTotal = 0;
		
		do {
			System.out.println("Qual o melhor sistema operacional para uso em servidores?"
					+ "Digite a opção abaixo ou 0 para sair.\n 1 - Windows Server\n 2 - Unix\n 3 - Linux\n 4 - Netware\n 5 - Mac OS\n 6 - Outro ");
			numero = leitor.nextInt();
			if (numero == 1 ) {
				soma1++;
			} else if (numero == 2){
				soma2++; 
			} else if (numero == 3) {
				soma3++;
			} else if (numero == 4) {
				soma4++;
			} else if (numero == 5) {
				soma5++;
			} else if (numero == 6){
				soma6++;						
			}
								
		} while (numero != 0);
	
		somaTotal = soma1 + soma2 + soma3 + soma4 + soma5 + soma6;
		
		System.out.println("                 Votos:   Percentual:");
		
		System.out.printf("Windows Server:    %d        %.2f%%\n", soma1,((double)soma1/somaTotal)*100);
		System.out.printf("Unix:              %d        %.2f%%\n", soma2, ((double)soma2/somaTotal)*100);
		System.out.printf("Linux:             %d        %.2f%%\n", soma3, ((double)soma3/somaTotal)*100);
		System.out.printf("Netware:           %d        %.2f%%\n", soma4, ((double)soma4/somaTotal)*100);
		System.out.printf("Mac OS:            %d        %.2f%%\n", soma5, ((double)soma5/somaTotal)*100);
		System.out.printf("Outro:             %d        %.2f%%\n", soma6, ((double)soma6/somaTotal)*100);
		
		System.out.printf("Total de votos:    %.0f", somaTotal);
		
		leitor.close();

	}

}
