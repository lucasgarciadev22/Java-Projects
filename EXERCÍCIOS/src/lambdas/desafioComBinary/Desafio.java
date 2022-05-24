package lambdas.desafioComBinary;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	//Desafio Binary Operator:
		//1. A partir do produto calcular o preco real (com desconto)
		//2. Imposto Municipal: >= 2500 (8,5%)/ <2500 (isento)
		//3. Frete: >= 3000 (100)/ <3000 (50)
		//4. Arredondar: Deixar duas casas decimais
		//5. Formatar: R$ 1234,56
	
	public static void main(String[] args) {
		
		//construindo a l�gica das opera��es
		Function<Produto, Double> precoFinal = produto -> produto.preco*(1-produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500? preco*1.085 : preco; 
		UnaryOperator<Double> frete = preco -> preco >=3000? preco +100: preco +50;
		Function<Double, String> arredondar = preco -> (String.format("%.2f",preco));//como a sa�da da fun��o j� � String ent�o n�o precisa usar m�todos de convers�o Double parseDouble
		UnaryOperator<String> formatar = preco -> "R$"+preco;
		
		//declarando um produto 
		Produto iPad = new Produto("iPad", 4799.90,0.15);
		
		//declarando o fluxo de opera��es 
		 String valorFinal = precoFinal
				 .andThen(impostoMunicipal)
				 .andThen(frete)
				 .andThen(arredondar)
				 .andThen(formatar)
				 .apply(iPad);
		 //exibir o pre�o final da compra
		 System.out.println("O pre�o final � "+ valorFinal);
	}

}
