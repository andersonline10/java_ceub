package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class PrincipalRH {

	public static void main(String[] args) {
		
		//declaração de variáveis
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String opcao = "";
		Colaborador objColaborador = null;
		
		//Entrada de dados
		
		try {
			
			System.out.print("Digite <C> para colaborador ou <G> para gerente: ");
			opcao = leitor.readLine();
			
			if (opcao.equals("C")) {
				objColaborador = new Colaborador();
			} else {
				objColaborador = new Gerente();
			}
			
			System.out.print("Informe a matrícula: ");
			objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));
			
			System.out.print("Informe o nome: ");
			objColaborador.setNome(leitor.readLine());
			
			System.out.print("Informe o salário: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
			
			if (! opcao.equalsIgnoreCase("C")) {
				System.out.print("Informe o bônus: ");
				//tenho que converter colaborador em gerente
				((Gerente)objColaborador).setBonus(Double.parseDouble(leitor.readLine()));
			}
			
			//saída de dados
			
			System.out.println("Matrícula: " + objColaborador.getMatricula());
			System.out.println("Nome: " + objColaborador.getNome());
			System.out.println("Salário: " + objColaborador.getSalario());
			
			
			
			
		} catch(Exception erro) {
			System.out.println(erro);
		}

	}

}
