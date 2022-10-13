//Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene
// os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities._1_Product;

public class _1_ProgramNomePrecoProdutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of ocorrencies: ");
		int n = sc.nextInt();
		
		_1_Product[] vect = new _1_Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter price: ");
			double price = sc.nextDouble();
			vect[i] = new _1_Product(name, price);
		}
		
		double sum = 0.0;
			for(int i=0; i<vect.length; i++) {
				sum += vect[i].getPrice();
			}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		
		sc.close();
		 
	}

}
