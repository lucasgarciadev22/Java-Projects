package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		//usando fun��es Lambdas diretamente
		
		Calculo calc = (x,y) -> { return x+y;};
		System.out.println(calc.executar(2, 3));
		
		//fun��o lambda assumindo novos m�todos de c�lculo diretamente (agora multiplica)
		calc = (x,y) -> x*y;
		System.out.println(calc.executar(2, 3));
		
	}

}
