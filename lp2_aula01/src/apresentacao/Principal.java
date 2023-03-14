package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Pessoa;

public class Principal {

	public static void main(String[] args) {
	
		Pessoa objeto1 = new Pessoa();
		
		System.out.println(objeto1.getNome());
		
		Pessoa objeto2 = new Pessoa("Jr", "SHIS Qi 3", 99995);
		
		System.out.println(objeto2.getNome());
		
		System.out.println(objeto2.getEndereco());
		
		System.out.println(objeto2.getTelefone());
		
		
		Pessoa objeto3 = new Pessoa();
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

		try {
			
			System.out.print("Digite o nome: ");
			objeto3.setNome(leitor.readLine());
			
			System.out.print("Digite o endereço: ");
			objeto3.setEndereco(leitor.readLine());
			
			System.out.print("Digite o telefone: ");
			objeto3.setTelefone(Integer.parseInt(leitor.readLine()));
			
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		System.out.println("Nome: " + objeto3.getNome());
		System.out.println("Endereço: " + objeto3.getEndereco());
		System.out.println("Telefone: " + objeto3.getTelefone());
	}

}

