package ori_obj_encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade; //private impede a altera��o por fora do programa
	
	//construtor padr�o para setar idades e nomes
	public Pessoa(String nome, String sobrenome, int idade) {
			setNome(nome);
			setSobrenome(sobrenome);
			setIdade(idade);//aplica valida��o de idade atrav�s do m�todo
		}						
	
	//Getter manual
	public int getIdade() {
		
		return idade;
		
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	//Getter & Setter automaticamente gerado pela IDE
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//m�todo de altera��o de idade com prote��o para idades negativas
	public void setIdade(int novaIdade){
		novaIdade = Math.abs(novaIdade); // passa tudo para positivo
		if(novaIdade >= 0 && novaIdade <=120) {  //verifica se valor � maior que zero e se � menor que 120
			this.idade = novaIdade;
		}
	}
	//transforma o retorno das strings em texto para poder puxar as informa��es atrav�s do get
	@Override
	public String toString() {
		return "Ol� eu sou o "+getNome()+" "+getSobrenome()+ " e tenho "+getIdade()+ " anos";	
		}
}
