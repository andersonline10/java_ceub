package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class PrincipalEscola {

	public static void main(String[] args) {
		//dec de variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Professor objProfessor = new Professor();
		Aluno objAluno = new Aluno();
		Turma objTurma = new Turma();
		
		 
		
		try {
			//entrada de dados
			
			System.out.print("Digite o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(leitor.readLine()));
			
			System.out.print("Digite o nome do professor: ");
			objProfessor.setNome(leitor.readLine());
			
			System.out.print("Digite a titulação do professor: ");
			objProfessor.setTitulo(leitor.readLine());
			
			System.out.print("Digite o salário do professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));
			
			objTurma.setObjProfessor(objProfessor);
			
			do {
				objAluno = new Aluno();
				
				System.out.print("Digite a matrícula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
				System.out.print("Digite o nome do aluno: ");
				objAluno.setNome(leitor.readLine());
				
				objTurma.adicionarAluno(objAluno);
				
				System.out.print("Digite <s> para continuar ou qualquer coisa par");
				
				
			} while(leitor.readLine().equalsIgnoreCase("S"));
			
			// saída de dados
			
			System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
			System.out.println("Professor: " + objTurma.getObjProfessor().getTitulo() + " " + objTurma.getObjProfessor().getNome());
			System.out.println("Salário do professor: " + objTurma.getObjProfessor().getSalario());
			System.out.println("Lista de alunos: ");
			System.out.println("==========================================");
			objTurma.listarAlunos();
			
			
		} catch(Exception erro) {
			System.out.println(erro);
		}

	}

}
 