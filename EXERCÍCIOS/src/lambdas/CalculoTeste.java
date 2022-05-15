package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
//		//primeira maneira de implementar usando duas instâncias de nomes distintos
//		
//		Calculo soma = new Somar();
//		Calculo multiplicacao = new Multiplicar();
//		
//		System.out.println(soma.executar(2, 3));
//		System.out.println(multiplicacao.executar(2, 3));
		
		//segunda maneira de implementar usando duas instâncias de mesmo nome (polimorfismo)
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar();//apenas a primeira instância recebe ' Calculo calculo' a outra apenas 'calculo'
		System.out.println(calculo.executar(2, 3));
		
	}

}
