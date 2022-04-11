package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
		//método comer --------------------------
	
	//parâmetros iniciais busca dentro da classe Comida e armazena dentro do novo objeto comida:
	void comer(Comida comida) {
		if(comida !=null) {
			this.peso +=comida.peso;//adiciona o peso da comida ao peso da pessoa
		}
	}
	//função de apresentação de pessoa:
	
	String apresentar() {
		return "Olá eu sou o "+nome+" e tenho "+peso+" Kgs.";
	}


}

