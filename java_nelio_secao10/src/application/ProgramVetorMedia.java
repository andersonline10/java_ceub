package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetorMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int n = 0;
		
		System.out.print("Informe a quantidade de pessoas: ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Informe a altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
			for (int i=0; i<n; i++) {
				sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		System.out.println();
		System.out.println("Alturas das pessoas:");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.2f%n", vect[i]);
		}
		
		
		sc.close();
		
				
	}

}
