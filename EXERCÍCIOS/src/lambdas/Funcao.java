package lambdas;

import java.util.function.Function;

public class Funcao {
	
//utilizando Java Function para composição de funções
	
public static void main(String[] args) {
	
	//função 1 (entra Int, sai String)
	Function<Integer, String> parOuImpar = numero -> numero %2 == 0? "Par" : "Ímpar";
	 System.out.println(parOuImpar.apply(32));
	
	 //função 2 (entra string da saída da função 1 e sai nova string formatada com texto)
	Function<String, String> resultadoTxt = valor -> "O resultado é: " + valor;
	
	//função 3 (entra string da saída da função 2 e sai nova string acrescida de !!!
	Function<String, String> empolgado = valor -> valor + "!!!";
	
	//função 4 (entra string da saída da função 3 e sai nova string acrescida de ???
	Function<String, String> duvida = valor -> valor + "???";
	
	//armazena todo o processo em uma nova string usando o método .andThen para sequenciar a composição de função
	String resultadoFinal = parOuImpar.andThen(resultadoTxt).apply(32); 
	
	System.out.println(resultadoFinal);
	
	String resultadoFinal2 = parOuImpar.andThen(resultadoTxt).andThen(duvida).apply(33);
	
	System.out.println(resultadoFinal2);





}
	
	


}
