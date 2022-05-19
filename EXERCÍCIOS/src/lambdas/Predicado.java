package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		//fun��o predicado para teste se o produto � caro ou n�o (boolean)
		Predicate<Produto> isCaro = prod -> (prod.preco*(1-prod.desconto)) >=1000;
		
		Produto produto = new Produto("Pc", 2590.55, 0.10);
		
		//passa o teste de predicado
		System.out.println(isCaro.test(produto));
	}
}
