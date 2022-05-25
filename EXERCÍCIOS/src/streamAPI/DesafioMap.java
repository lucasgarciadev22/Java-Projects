package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		//Desafio Map:
		//1. Transformar números do array em string binária... 6=> "110"
		//2. Inverter a string... "110" => "011"
		//3. Converter de volta para inteiro => "011" =>3
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//consumers
		Consumer<Integer> print = System.out::println;
		Function<Integer, String> binario= num-> Integer.toBinaryString(num);
		UnaryOperator<String> reverse = string -> new StringBuilder(string).reverse().toString();
		Function<String, Integer> converteInteiro = decimal ->  Integer.parseInt(decimal, 2); 
		//streams
		
		nums.stream().map(binario).map(reverse).map(converteInteiro).forEach(print);
		
		
		
	}

}
