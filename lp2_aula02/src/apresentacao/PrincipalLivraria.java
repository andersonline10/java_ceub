package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.Livro;

public class PrincipalLivraria {
	public static void main(String[] args) throws Exception {
		//declaracao de variaveis
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Livro objLivro = new Livro();
		
		//entrada de dados
		
		System.out.print("Digite o t�tulo do livro: ");
		objLivro.setTitulo(leitor.readLine());
		
		System.out.print("Digite o nome do autor do livro: ");
		objLivro.setObjAutor(new Autor(leitor.readLine()));
		
		System.out.print("Digite o g�nero do livro: ");
		objLivro.setGenero(leitor.readLine());
		
		System.out.println("T�tulo: " + objLivro.getTitulo());
		System.out.println("Autor: " + objLivro.getObjAutor().getNome());
		System.out.println("G�nero: " + objLivro.getGenero());
	}
}
