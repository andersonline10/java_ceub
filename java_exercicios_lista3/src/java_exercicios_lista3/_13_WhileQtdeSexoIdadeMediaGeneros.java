// 13. Elabore um algoritmo que leia um número de entrada que indicará a quantidade de
// registros a serem lidos (N). Em seguida algoritmo deve solicitar o sexo (M/F) e idade de N
// pessoas e ao final apresentar a média de idade de ambos os gêneros catalogados.

package java_exercicios_lista3;

import java.util.Scanner;

public class _13_WhileQtdeSexoIdadeMediaGeneros {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		int i = 1;
		int qtde = 0;
		int sexo = 0;
		int idade = 0;
		int somaidademasc = 0;
		int somaidadefem = 0;
		int somasexmasc = 0;
		int somasexfem = 0;
		int mediaidademasc = 0;
		int mediaidadefem = 0;
		
		System.out.print("Informe a quantidade de registros a serem lidos: ");
		qtde = leitor.nextInt();
		
		while (i <= qtde) {
			System.out.printf("Informe o sexo da %da pessoa ( 1 - Masculino 2 - Feminino): ", i);
			sexo = leitor.nextInt();
			System.out.print("Informe a idade: ");
			idade = leitor.nextInt();
			
			
			if (sexo ==1) {
				somaidademasc += idade;
				somasexmasc += sexo;	
			}
			else {
				somaidadefem += idade;
				somasexfem += (sexo / 2);
			}
			
			i +=1;
			
		}
		
		leitor.close();
		
		mediaidademasc = (somaidademasc / somasexmasc);
		mediaidadefem = (somaidadefem / somasexfem);
		
		System.out.printf("A média da idade das pessoas do sexo masculino é de " + mediaidademasc + ".%n");
		System.out.printf("A média da idade das pessoas do sexo feminino é de " + mediaidadefem + ".");
			
	}
}
