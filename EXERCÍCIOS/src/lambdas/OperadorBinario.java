package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		//recebe dois parâmetros do mesmo tipo e retorna um valor do mesmo tipo
		
		BinaryOperator<Double> media =
				(Double n1, Double n2) ->(n1 + n2) /2;
				
		System.out.println(media.apply(9.8, 5.5));
		//recebe tres parâmetros personalizados
		BiFunction<Double, Double, String> resultado =
			(n1,n2) -> { double notaFinal = (n1 + n2)/2;
			return notaFinal>= 7? "Aprovado" : "Reprovado";//executa soma/ divisão e aplica um validador ternário
			};
			System.out.println(resultado.apply(9.8,5.5));
		//separando conceito em outra função e fazendo a composição de ambas 
			Function<Double, String> conceito = m -> m>= 7? "Aprovado" : "Reprovado";
			System.out.println(media.andThen(conceito).apply(9.7,4.1));
	}

}
