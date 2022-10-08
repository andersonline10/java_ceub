package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AlunosNotas;

public class ProgramAlunosNotas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AlunosNotas alunos = new AlunosNotas();
		
		
		System.out.print("Informe o nome do estudante: ");
		alunos.name = sc.nextLine();
		
		System.out.print("Digite o valor da primeira nota: ");
		alunos.nota1 = sc.nextDouble();
		
		System.out.print("Digite o valor da segunda nota: ");
		alunos.nota2 = sc.nextDouble();
		
		System.out.print("Digite o valor da terceira nota: ");
		alunos.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", alunos.FinalGrade());
		
		
		if (alunos.FinalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points%n", alunos.Missing());
		}
		
		else {
			System.out.println("PASS");
			
		}
		
		sc.close();
	}
}
