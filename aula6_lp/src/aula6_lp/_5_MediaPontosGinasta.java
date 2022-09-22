package aula6_lp;

import java.util.Scanner;

public class _5_MediaPontosGinasta {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double nota5 = 0;
		double nota6 = 0;
		double notaMaior = 0;
		double notaMenor = 0;
		
		double media = 0;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = leitor.nextDouble();
		System.out.print("Informe a segunda nota: ");
		nota2 = leitor.nextDouble();
		System.out.print("Informe a terceira nota: ");
		nota3 = leitor.nextDouble();
		System.out.print("Informe a quarta nota: ");
		nota4 = leitor.nextDouble();
		System.out.print("Informe a quinta nota: ");
		nota5 = leitor.nextDouble();
		System.out.print("Informe a sexta nota: ");
		nota6 = leitor.nextDouble();
		
		leitor.close();
		
		if (nota1 > nota2 && nota1 > nota3 && nota1 > nota4 && nota1 > nota5 && nota1 > nota6) {
			notaMaior = nota1;
		} else if (nota2 > nota1 && nota2 > nota3 && nota2 > nota4 && nota2 > nota5 && nota2 > nota6) {
			notaMaior = nota2;
		} else if (nota3 > nota1 && nota3 > nota2 && nota3 > nota4 && nota3 > nota5 && nota3 > nota6) {
			notaMaior = nota3;
		} else if (nota4 > nota1 && nota4 > nota2 && nota4 > nota3 && nota4 > nota5 && nota3 > nota6) {
			notaMaior = nota4;
		} else if (nota5 > nota1 && nota5 > nota2 && nota5 > nota3 && nota5 > nota4 && nota5 > nota6) {
			notaMaior = nota5;
		} else {
			notaMaior = nota6;
		}	
					
			
		
		if (nota1 < nota2 && nota1 < nota3 && nota1 < nota4 && nota1 < nota5 && nota1 < nota6) {
			notaMenor = nota1;
		} else if (nota2 < nota1 && nota2 < nota3 && nota2 < nota4 && nota2 < nota5 && nota2 < nota6) {
			notaMenor = nota2;
		} else if (nota3 < nota1 && nota3 < nota2 && nota3 < nota4 && nota3 < nota5 && nota3 < nota6) {
			notaMenor = nota3;
		} else if (nota4 < nota1 && nota4 < nota2 && nota4 < nota3 && nota4 < nota5 && nota3 < nota6) {
			notaMenor = nota4;
		} else if (nota5 < nota1 && nota5 < nota2 && nota5 < nota3 && nota5 < nota4 && nota5 < nota6) {
			notaMenor = nota5;
		} else {
			notaMenor = nota6;
		}	
		
			
				
		media = ((nota1 + nota2 + nota3 + nota4 + nota5 + nota6 - notaMaior - notaMenor) / 4);
				
		System.out.println("O maior número informado foi o " + notaMaior + " e o menor número informado foi o " + notaMenor);
		System.out.println("A média final é " + media);
	}
}


