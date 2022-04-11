package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
		//m�todo comer --------------------------
	
	//par�metros iniciais busca dentro da classe Comida e armazena dentro do novo objeto comida:
	void comer(Comida comida) {
		if(comida !=null) {
			this.peso +=comida.peso;//adiciona o peso da comida ao peso da pessoa
		}
	}
	//fun��o de apresenta��o de pessoa:
	
	String apresentar() {
		return "Ol� eu sou o "+nome+" e tenho "+peso+" Kgs.";
	}


}

