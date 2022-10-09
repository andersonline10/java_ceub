package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Enter width: ");
		retangulo.width = sc.nextDouble();
		
		System.out.print("Enter hight: ");
		retangulo.height = sc.nextDouble();
		
		
		System.out.println();
		System.out.printf("Area: %.2f%n", retangulo.area());
		System.out.println();
		System.out.printf("Perimeter: %.2f%n", retangulo.perimeter());
		System.out.println();
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());

		sc.close();
	}

}
