package classe;

public class Produto {// classe
	
	String nome; // 1 atributo
	double preco; // 2 atributo
	static double desconto=0.25; // 3 atributo static sem alteração
	Produto(){
		
	}
	//definindo o construtor padrão de forma explícita *já existia de fora implícita no código mas agora necessita nome
	Produto(String nomeInicial){
	//necessário armazenar o nome em outra variável senão o nome ''é descartado''
		nome=nomeInicial;
	}//este nome será exigido no arquivo ProdutoTeste porque agora ele exige o nome do produto no construtor
	
	//definindo mais parâmetros no construtor do produto
	Produto(String nomeInicial, double precoInicial){
		nome=nomeInicial;
		preco=precoInicial;
		//importante salvar as definições em variáveis separadas.
	}
	
	
	double precoComDesconto(double descontoDoGerente) {//declara um novo parametro interno do metodo deve ser zerado caso quiser ignorá-lo
		return preco * (1-desconto-descontoDoGerente); //cria um novo metodo para preco com desconto usando o atributo desconto e preco que foi criado anteriormente 
	}
	
}
