//8. Elabore um algoritmo que imprima a soma dos 100 primeiros números inteiros positivos.

package java_exercicios_lista3;

public class _8_ForSomaCemIntPos {
	public static void main(String[]args) {
		int soma = 0;
		for(int i = 0; i <= 100; i++) {
			soma += i;
		}
		System.out.println(soma);
	}

}
  