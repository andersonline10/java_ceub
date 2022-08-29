	// Classe Account que contém uma variável de instância name
	// e métodos para configurar e obter seu valor
	package livro_deitel;
	public class AccountConstrutor 
	{
		private String name; //variável de instância 
		
		//o construtor inicializa name com nome do parâmetro
		public AccountConstrutor(String name) //o nome do construtor é nome da classe
		{
		this.name = name; //armazena o nome
		}
		
		//método para configurar o nome
		public void setName(String name) 
		{
			this.name = name;
		}
		
		//método para recuperar o nome do objeto
		public String getName()
		{
			return name; // retorna valor do nome para o chamador
		}
	} // fim da classe Account


