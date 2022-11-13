//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities._3_Velho;

public class _3_MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
				
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		_3_Velho[] vect = new _3_Velho[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa\n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new _3_Velho(nome, idade);
		}
		
		sc.close();
		
		int maioridade = 0;
		int posicaomaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() > maioridade) {
				maioridade = vect[i].getIdade();
				posicaomaior = i;
			}
		}
		
		System.out.printf("O nome da pessoa mais velha é %s. ", vect[posicaomaior].getNome() );

	}

}
