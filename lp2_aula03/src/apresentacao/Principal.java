package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class Principal {

	public static void main(String[] args) {
		//Declaração de variáveis
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Produto objProduto = new Produto();
		
		Compra objCompra = new Compra ();
		
		//Entrada de dados
		
		try {
			System.out.print("Digite o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			System.out.print("Digite o tipo do produto: ");
			objProduto.setObjtipo(new Tipo(leitor.readLine()));
			
			System.out.print("Digite o preço do produto: ");
			objProduto.setPreco(Double.parseDouble(leitor.readLine()));
			
			objCompra.setObjProduto(objProduto);
			
			System.out.print("Digite a quantidade dos produtos: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Digite a data da compra: ");
			objCompra.setDataDaTela(leitor.readLine());
			
			System.out.print("Digite o cartão de crédito: ");
			objCompra.setCartao(leitor.readLine());
			
		
		} catch (Exception erro) {
			System.out.println(erro);
		}

		
		System.out.println("Nome do produto: " + objCompra.getObjProduto().getNome());
		System.out.println("Tipo do produto: " + objCompra.getObjProduto().getObjtipo().getDescricao());
		System.out.println("Preço do produto: " + objCompra.getObjProduto().getPreco());
		System.out.println("Quantidade: " + objCompra.getQuantidade());
		System.out.println("Valor total: " + objCompra.getQuantidade() * objCompra.getObjProduto().getPreco());
		System.out.println("Data da compra: " + objCompra.getDataParaTela());
		System.out.println("Cartão: " + objCompra.getCartao());
		
		
		
	}

}
