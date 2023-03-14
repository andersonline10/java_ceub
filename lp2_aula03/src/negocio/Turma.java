package negocio;

public class Turma {
	
	//propriedades da classe
	
	private Cadeira objCadeira = null;
	private Professor objProfessor = null;
	private String letra = "";
	private Aluno[] colecao = new Aluno[50];
	private int qtdAlunos = 0;
	
	//métodos construtores
	public Turma() {
		super();
	}
	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecao, int qtdAlunos) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
		this.qtdAlunos = qtdAlunos;
	}
	
	//métodos get/set
	public Cadeira getObjCadeira() {
		return objCadeira;
	}
	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}
	public Professor getObjProfessor() {
		return objProfessor;
	}
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Aluno[] getColecao() {
		return colecao;
	}
	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	
	
	//métodos da classe
	
	public void adicionarAluno(Aluno objAluno) { 
		if (getQtdAlunos() == colecao.length) {
			System.out.println("A turma já está cheia !");
		} else {
			colecao[getQtdAlunos()] = objAluno;
			setQtdAlunos(getQtdAlunos() + 1);
		}
	}

	public void listarAlunos () {
		for (int i = 0; i< getQtdAlunos(); i++) {
			System.out.println("Matrícula: " + colecao[i].getMatricula());
			System.out.println("Nome: " + colecao[i].getNome());
			System.out.println("==========================================");
		}
	}
	
}
