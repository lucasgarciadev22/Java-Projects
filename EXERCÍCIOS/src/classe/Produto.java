package classe;

public class Produto {// classe
	
	String nome; // 1 atributo
	double preco; // 2 atributo
	static double desconto=0.25; // 3 atributo static sem altera��o
	Produto(){
		
	}
	//definindo o construtor padr�o de forma expl�cita *j� existia de fora impl�cita no c�digo mas agora necessita nome
	Produto(String nomeInicial){
	//necess�rio armazenar o nome em outra vari�vel sen�o o nome ''� descartado''
		nome=nomeInicial;
	}//este nome ser� exigido no arquivo ProdutoTeste porque agora ele exige o nome do produto no construtor
	
	//definindo mais par�metros no construtor do produto
	Produto(String nomeInicial, double precoInicial){
		nome=nomeInicial;
		preco=precoInicial;
		//importante salvar as defini��es em vari�veis separadas.
	}
	
	
	double precoComDesconto(double descontoDoGerente) {//declara um novo parametro interno do metodo deve ser zerado caso quiser ignor�-lo
		return preco * (1-desconto-descontoDoGerente); //cria um novo metodo para preco com desconto usando o atributo desconto e preco que foi criado anteriormente 
	}
	
}
