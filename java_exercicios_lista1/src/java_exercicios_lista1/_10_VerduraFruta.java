// 10. Escreva um programa que solicite ao usu�rio o nome de uma verdura e uma fruta de sua
// preferencia e ao final apresente na tela as informa��es digitadas pelo usu�rio da seguinte
// forma: "Voce gosta de AAAAAAA e BBBBBBB"

package java_exercicios_lista1;

import java.util.Scanner;

public class _10_VerduraFruta {
	public static void main(String[]args) {
		//declara��o
		Scanner leitor = new Scanner (System.in);
		String verdura;
		String fruta;
		//entrada
		System.out.print("Informe uma verdura: ");
		verdura = leitor.next();
		System.out.print("Informe uma fruta: ");
		fruta = leitor.next();
		leitor.close();
		//sa�da
		System.out.printf("Voc� gosta de %s e %s.", verdura, fruta);
	}

}
