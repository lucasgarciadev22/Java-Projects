package classe;

public class ProdutoTeste {//nessa classe vamos testar a classe criada "Produto" que tem nome preco e desconto
	
public static void main(String[] args) {
	//classe produto está dentro do mesmo package classe.
	//** eu joguei o nome no próprio construtor de produto, é possível jogar outros atributos como preço também
	Produto p1= new Produto("Notebook");//chamei a classe produto criada anteriormente
	//p1.nome = "Notebook";//usando a notação ponto eu chamo os membros da instância
	p1.preco = 4356.89;

	//defini os valores que cada membro de classe recebe
	
	var p2 = new Produto("Caneta Preta");//chamei outra instância da classe produto criada anteriormente
	//p2.nome = "Caneta Preta";
	p2.preco = 12.56;

	System.out.println(p1.nome+" "+p1.precoComDesconto(0));//printar produto 1
	System.out.println(p2.nome+" "+p2.precoComDesconto(0));//printar produto 2
	
	//double precoFinal1 = p1.preco *(1-p1.desconto);//define o preço com desconto do produto 1
	
	double precoFinal1 = p1.precoComDesconto(0.1);//chama o metodo direto da classe Produto criada antes
	double precoFinal2 = p2.precoComDesconto(0.1);//chama o metodo direto da classe Produto criada antes
	double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
	System.out.printf("Média do carrinho: R$%.2f" , mediaCarrinho);
	
	//ATENÇÃO AO ALTERAR O STATIC DESCONTO ALTERA OS PREÇOS DO PRODUTO TODO CANETA E NOTEBOOKS

	
	
	
}

}
 