package streamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {
//criando uma classe para os fluxos de operação
	public final static UnaryOperator<String> maiuscula = n-> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n-> n.charAt(0)+"";
	public final static String  grito(String n) { return n+"!";
	}
	
}
