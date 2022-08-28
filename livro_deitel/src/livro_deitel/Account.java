// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor

package livro_deitel;

public class Account {
	private String name; //variável de instância 
	
	//método para definir o nome do objeto
	public void setName(String name)
	{
		this.name = name; //armazena o nome
	}
	
	//método para recuperar o nome do objeto
	public String getName()
	{
		return name; // retorna valor do nome para o chamador
	}

} // fim da classe Account
