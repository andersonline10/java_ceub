package application;

import java.util.Locale;
import java.util.Scanner;

import entities._5_Aluguel;


public class _5_AluguelQuartos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n; 
		
		System.out.print("Quantos quartos serão alugados? ");
		n = sc.nextInt();
		
		_5_Aluguel [] vect = new _5_Aluguel[10];
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Reserva #%d:\n", i);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int nrquarto = sc.nextInt();
			vect[nrquarto] = new _5_Aluguel(nome, email);	
		}
		
		System.out.println("Quartos ocupados: ");
		
		for (int i = 0; i < vect.length; i++) {	
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}

