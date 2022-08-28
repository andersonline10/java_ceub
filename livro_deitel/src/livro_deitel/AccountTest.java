// cria e manipula um objeto Account

package livro_deitel;

import java.util.Scanner;

public class AccountTest {
	public static void main (String[]args) {
		//cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//cria um objeto Account e o atribui a myAccount
		Account myAccount = new Account();
		
		//exibe o valor inicial do nome(null)
		System.out.printf("Nome inicial é o: %s%n%n", myAccount.getName());
		
		//solicita e lê o nome
		System.out.println("Informe o nome:");
		String theName = input.nextLine(); //lê uma linha de texto
		myAccount.setName(theName); //insere theName em myAccount
		System.out.println(); //gera saída de uma linha em branco

		// exibe o nome armazenado no objeto myAccount
		System.out.printf("O nome no objeto myAccount is: %n%s%n", myAccount.getName());
		
	}
}
