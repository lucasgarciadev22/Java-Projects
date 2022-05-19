package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		//usando funções da lista java.util.function
		
		
		// int -> Double NÃO
		//double -> Double SIM
		//binary operator só aceita double como parâmetro
		BinaryOperator<Double> calc = (x,y) -> { return x+y;};
		System.out.println(calc.apply(2.0, 3.0));//agora as funções da interface Calculo não são mais acessíveis
		
		//função lambda assumindo novos métodos de cálculo diretamente (agora multiplica)
		calc = (x,y) -> x*y;
		System.out.println(calc.apply(2.0, 3.0));

	}

}
