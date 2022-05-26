package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer>soma = (ac, n) -> ac +n;//operador do reduce
		
		//para obter valor como retorno do reduce usar get e associar o stream à uma variavel
		
		int total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		int total2 = nums.stream().reduce(100,soma);
		System.out.println(total2);
		
		//Resultado foi um Opcional<Integer>... 
		nums.stream().filter(n-> n>5).reduce(soma).ifPresent(System.out::println);
		//só printa se pasar pelo filtro
	}

}
