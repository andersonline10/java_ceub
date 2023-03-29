package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class PrincipalImobiliaria {

	public static void main(String[] args) throws Exception {
		
		//declaração de variáveis
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Imovel objImovel = null;
		String tipo = "";
		
		//entrada de dados
		
		System.out.print("Digite <N> para imóvel novo ou <U> para imóvel usado: ");
		tipo = leitor.readLine();
		
		if (tipo.equalsIgnoreCase("N")) {
			objImovel = new Novo();
		} else {
			objImovel = new Usado();
		}
		
		System.out.print("Digite o endereço: ");
		objImovel.setEndereco(leitor.readLine());
		
		System.out.print("Digite a metragem: ");
		objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
		
		System.out.print("Digite o valor: ");
		objImovel.setValor(Double.parseDouble(leitor.readLine()));
		
		if (tipo.equalsIgnoreCase("N")) {
			System.out.print("Digite o adicional: ");
			((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
		} else {
			System.out.print("Digite a depreciação: ");
			((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
		}
		
		System.out.println("Endereço: " +objImovel.getEndereco());
		System.out.println("Metragem: " +objImovel.getMetragem());
		System.out.println("Valor: " +objImovel.getValor());

	}

}
