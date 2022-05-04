package ori_obj_encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade; //private impede a alteração por fora do programa
	
	//construtor padrão para setar idades e nomes
	public Pessoa(String nome, String sobrenome, int idade) {
			setNome(nome);
			setSobrenome(sobrenome);
			setIdade(idade);//aplica validação de idade através do método
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

	//método de alteração de idade com proteção para idades negativas
	public void setIdade(int novaIdade){
		novaIdade = Math.abs(novaIdade); // passa tudo para positivo
		if(novaIdade >= 0 && novaIdade <=120) {  //verifica se valor é maior que zero e se é menor que 120
			this.idade = novaIdade;
		}
	}
	//transforma o retorno das strings em texto para poder puxar as informações através do get
	@Override
	public String toString() {
		return "Olá eu sou o "+getNome()+" "+getSobrenome()+ " e tenho "+getIdade()+ " anos";	
		}
}
