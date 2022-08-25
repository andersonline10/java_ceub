//13. Escreva um programa que solicite ao usuário dois números inteiros e ao final apresente
//na tela a soma dos dois números informados da seguinte forma: "O numeros N e X
//somados correspondem a Y"

package java_exercicios_lista1;
 
import java.util.Scanner;

public class _13_IntSoma {
	public static void main(String[]args) {
		//declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int soma = 0;
		//entrada de dados
		System.out.print("Informe o primeiro número inteiro: ");
		x = leitor.nextInt();
		System.out.print("Informe o segundo número inteiro: ");
		y = leitor.nextInt();
		leitor.close();
		//processamento
		soma = x + y;
		//saída de dados
		//esse seria o uso mais adequado normalmente com a variável soma
		//System.out.printf("Os números %d e %d somados correspondem a %d.", x, y, soma);
		
		//sem a variável soma, daí eu separo printf e println, porque no printf eu não consigo fazer a soma dentro da sintaxe
		System.out.printf("Os números %d e %d somados correspondem a ", x, y);
		//esse seria o caso de eu não querer usar a variável soma -->
		System.out.println((x+y) + "."); 
	}

}
