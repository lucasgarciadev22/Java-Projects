package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		//usando fun��es da lista java.util.function
		
		
		// int -> Double N�O
		//double -> Double SIM
		//binary operator s� aceita double como par�metro
		BinaryOperator<Double> calc = (x,y) -> { return x+y;};
		System.out.println(calc.apply(2.0, 3.0));//agora as fun��es da interface Calculo n�o s�o mais acess�veis
		
		//fun��o lambda assumindo novos m�todos de c�lculo diretamente (agora multiplica)
		calc = (x,y) -> x*y;
		System.out.println(calc.apply(2.0, 3.0));

	}

}
