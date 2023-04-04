package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class PrincipalGeometria {
	public static void main (String[] args) throws Exception {
		//declaração de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Solido objSolido = null;
		int tipo = 0;
		
		//entrada de dados
		System.out.print("Digite <1> para cubo ou <2> para cilindro: ");
		tipo = Integer.parseInt(leitor.readLine());
		
		if (tipo == 1) {
			objSolido = new Cubo();
			
			System.out.print("Digite a aresta: ");
			((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
		} else {
			objSolido = new Cilindro();
			
			System.out.print("Digite o raio: ");
			((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Digite a altura: ");
			((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
		}
		
		//saída de dados
		
		System.out.println("Área: " + objSolido.calcularArea());
		System.out.println("Volume: " + objSolido.calcularVolume());
	}
}
