 //8. Elabore um algoritmo que imprima a soma dos 100 primeiros números inteiros positivos.
package java_exercicios_lista3;

public class _8_WhileSomaCemIntPos {
	public static void main(String[]args) {
		int x = 0;
		int soma = 0;
		while (x <= 100) {
			soma += x;
			x += 1;
		}
		System.out.println(soma);
	}

}
 