package lambdas;

import java.util.function.Function;

public class Funcao {
	
//utilizando Java Function para composi��o de fun��es
	
public static void main(String[] args) {
	
	//fun��o 1 (entra Int, sai String)
	Function<Integer, String> parOuImpar = numero -> numero %2 == 0? "Par" : "�mpar";
	 System.out.println(parOuImpar.apply(32));
	
	 //fun��o 2 (entra string da sa�da da fun��o 1 e sai nova string formatada com texto)
	Function<String, String> resultadoTxt = valor -> "O resultado �: " + valor;
	
	//fun��o 3 (entra string da sa�da da fun��o 2 e sai nova string acrescida de !!!
	Function<String, String> empolgado = valor -> valor + "!!!";
	
	//fun��o 4 (entra string da sa�da da fun��o 3 e sai nova string acrescida de ???
	Function<String, String> duvida = valor -> valor + "???";
	
	//armazena todo o processo em uma nova string usando o m�todo .andThen para sequenciar a composi��o de fun��o
	String resultadoFinal = parOuImpar.andThen(resultadoTxt).apply(32); 
	
	System.out.println(resultadoFinal);
	
	String resultadoFinal2 = parOuImpar.andThen(resultadoTxt).andThen(duvida).apply(33);
	
	System.out.println(resultadoFinal2);





}
	
	


}
