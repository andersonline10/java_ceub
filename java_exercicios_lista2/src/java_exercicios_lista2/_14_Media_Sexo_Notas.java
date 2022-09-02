//14. Escreva um programa que solicite ao usuário a média para aprovação
//em um curso e em seguida solicite ao usuário o nome, sexo e as 03 notas do aluno e ao
//final imprima a frase: "O aluno XXXXX foi aprovado com media YY" considerando o gênero
//do(a) aluno(a) e se foi aprovado(a) ou reprovado(a)


package java_exercicios_lista2;

import java.util.Scanner;

public class _14_Media_Sexo_Notas {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		double mediaAprov = 0;
		double mediaFinal = 0;
		String nomeAluno;
		int sexoAluno = 0;
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		
		System.out.print("Informe a média necessária para aprovação: ");
		mediaAprov = leitor.nextDouble();
		
		System.out.print("Informe o nome do(a) aluno(a): ");
		nomeAluno = leitor.next();
		
		System.out.printf("Informe o sexo de %s (1 - Masculino 2 - Feminino): ", nomeAluno);
		sexoAluno = leitor.nextInt();
		
		System.out.printf("Informe a nota 1 de %s: ", nomeAluno);
		nota1 = leitor.nextDouble();
		
		System.out.printf("Informe a nota 2 de %s: ", nomeAluno);
		nota2 = leitor.nextDouble();
		
		System.out.printf("Informe a nota 3 de %s: ", nomeAluno);
		nota3 = leitor.nextDouble();
		
		mediaFinal = (nota1 + nota2 + nota3)/3;
		
		if ((mediaFinal > mediaAprov) && (sexoAluno == 1)){
			System.out.printf("O aluno %s foi aprovado com a média %.2f.", nomeAluno, mediaFinal);
		}
		else if ((mediaFinal < mediaAprov) && (sexoAluno == 1)){
			System.out.printf("O aluno %s foi reprovado com a média %.2f.", nomeAluno, mediaFinal);
		}
		
		else if ((mediaFinal > mediaAprov) && (sexoAluno == 2)){
			System.out.printf("A aluna %s foi aprovada com a média %.2f.", nomeAluno, mediaFinal);
		}
		else
			System.out.printf("A aluna %s foi reprovada com a média %.2f.", nomeAluno, mediaFinal);
		}
}
