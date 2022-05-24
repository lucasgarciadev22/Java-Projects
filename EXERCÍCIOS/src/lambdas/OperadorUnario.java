package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n-> n+2;
		UnaryOperator<Integer> vezesDois = n-> n*2;
		UnaryOperator<Integer> aoQuadrado = n-> n*n;
		
		//implementando os operadores un�rios usando -> andThen
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);//valor inicial de n
		System.out.println(resultado1);
		//implementando os operadores un�rios usando -> compose
		int resultado2= maisDois
				.compose(vezesDois)
				.compose(aoQuadrado)
				.apply(0);//valor inicial de n
		System.out.println(resultado1);
		
	}

}
