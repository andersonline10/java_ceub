// Usando o construtor de AccountConstrutor para inicializar a instância name
//variável no momento em que cada objeto Account é criado
package livro_deitel;

public class AccountTestConstrutor 
{
	public static void main (String[]args) 
	{
		//cria dois objetos Account
		AccountConstrutor account1 = new AccountConstrutor("Jane Green");
		AccountConstrutor account2 = new AccountConstrutor("John blue");
		
		//exibe o valor inicial de nome para cada Account
		System.out.printf("account1 name is: %s%n", account1.getName());
		System.out.printf("account2 name is: %s%n", account2.getName());
	}
} //fim da classe AccountTestConstrutor
