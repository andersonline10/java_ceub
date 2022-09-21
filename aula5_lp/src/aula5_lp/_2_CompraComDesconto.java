package aula5_lp;
import java.util.Scanner;

public class _2_CompraComDesconto {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double preco = 0;
		int quantidade = 0;
		double valorTotal = 0;
		
		System.out.print("Informe o preço do produto: ");
		preco = leitor.nextDouble();
		
		System.out.print("Informe a quantidade: ");
		quantidade = leitor.nextInt();
		
		valorTotal = (preco * quantidade);
		
		// sempre fazer a lógica inversa - do maior para o menor
		
		if (quantidade > 30) {
			valorTotal = (0.5 * valorTotal);
		}
		
		else if (quantidade > 20) {
			valorTotal = (0.6 * valorTotal);
		}
		else if (quantidade > 10) {
			valorTotal = (0.85 * valorTotal);
		}
		
		System.out.println("O valor total com o desconto é de: " + valorTotal);
		
	}

}
