package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		//usando funções Lambdas diretamente
		
		Calculo calc = (x,y) -> { return x+y;};
		System.out.println(calc.executar(2, 3));
		
		//função lambda assumindo novos métodos de cálculo diretamente (agora multiplica)
		calc = (x,y) -> x*y;
		System.out.println(calc.executar(2, 3));
		
	}

}
