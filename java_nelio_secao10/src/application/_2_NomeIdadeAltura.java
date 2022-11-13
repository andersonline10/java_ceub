//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities._2_Altura;

public class _2_NomeIdadeAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nmenores = 0;
		double alturaTotal = 0.0, alturaMedia, percentualMenores;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		_2_Altura[] vect = new _2_Altura[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new _2_Altura(name, idade, altura);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				nmenores++;
			}
			alturaTotal += vect[i].getAltura();
		}
		
		alturaMedia = alturaTotal / n;
		percentualMenores = ((double)nmenores / n) * 100;
		
		System.out.printf("Altura média das pessas: %.2f\n", alturaMedia);
		System.out.printf("Percentual de pessoas com menos de 16 anos: %.2f%%\n", percentualMenores);
		System.out.println();
		System.out.println("Nome das pessoas com menos de 16 anos: ");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				
				System.out.println(vect[i].getName());
			}
			
		}
		
		
		
		
		sc.close();

	}

}
