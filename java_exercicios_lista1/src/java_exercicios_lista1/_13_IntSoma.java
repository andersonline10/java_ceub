//13. Escreva um programa que solicite ao usu�rio dois n�meros inteiros e ao final apresente
//na tela a soma dos dois n�meros informados da seguinte forma: "O numeros N e X
//somados correspondem a Y"

package java_exercicios_lista1;
 
import java.util.Scanner;

public class _13_IntSoma {
	public static void main(String[]args) {
		//declara��o de vari�veis
		Scanner leitor = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int soma = 0;
		//entrada de dados
		System.out.print("Informe o primeiro n�mero inteiro: ");
		x = leitor.nextInt();
		System.out.print("Informe o segundo n�mero inteiro: ");
		y = leitor.nextInt();
		leitor.close();
		//processamento
		soma = x + y;
		//sa�da de dados
		//esse seria o uso mais adequado normalmente com a vari�vel soma
		//System.out.printf("Os n�meros %d e %d somados correspondem a %d.", x, y, soma);
		
		//sem a vari�vel soma, da� eu separo printf e println, porque no printf eu n�o consigo fazer a soma dentro da sintaxe
		System.out.printf("Os n�meros %d e %d somados correspondem a ", x, y);
		//esse seria o caso de eu n�o querer usar a vari�vel soma -->
		System.out.println((x+y) + "."); 
	}

}
