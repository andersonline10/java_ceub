package aula5_lp;

import java.util.Scanner;

public class _5_DiaSemanaData {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		int semana = 0;

		System.out.print("Digite o dia do seu nascimento: ");
		dia = leitor.nextInt();
		System.out.print("Digite o mês do seu nascimento: ");
		mes = leitor.nextInt();
		System.out.print("Digite o ano do seu nascimento: ");
		ano = leitor.nextInt();
		
		leitor.close();
		
		
		
		
		semana = (((dia) +
				   (2 * mes) +
				   ((3 * (mes + 1)) / 5) +
				   ((ano) + (ano / 4)) -
				   (ano / 100) +
				   (ano / 400) + 
				   2) % 7);
		
		switch (semana) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		
		}
		
	}

}
