//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNomeIdadeAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nmenores = 0;
		double alturaTotal = 0, alturaMedia, percentualMenores;
	
						
		System.out.print("Quantas pessoas serão digitadas: ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i]=sc.nextDouble();
		}
		
		for(int i=0; i<n; i++){
			if (idades[i]<16) {
				nmenores++;
			}
			alturaTotal += alturas[i];
		}
		
		alturaMedia = alturaTotal / n;
		percentualMenores = ((double)nmenores / n) * 100;
		
		
		System.out.printf("Altura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for(int i=0;i<n;i++) {
			if (idades[i] <16 ) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	
	}
}	

