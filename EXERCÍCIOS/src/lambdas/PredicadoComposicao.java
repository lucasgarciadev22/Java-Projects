package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
public static void main(String[] args) {
	//recebe pa�metros iniciais e retorna true ou false
	
	Predicate<Integer> isPar = num -> num %2 ==0;
	Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
	
	System.out.println(isPar.test(23));//teste se o n�mero fornecido no argumento � par
	System.out.println(isTresDigitos.test(230));//teste se o n�mero fornecido no argumento tem tr�s d�gitos
	//composi��o de duas fun��es
	System.out.println(isPar.and(isTresDigitos).test(123));
	System.out.println(isPar.and(isTresDigitos).negate().test(123));//negate adicionato inverse a l�gica antes do teste
	System.out.println(isPar.or(isTresDigitos).test(123));
}
}
