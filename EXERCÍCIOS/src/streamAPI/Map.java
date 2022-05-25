package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String>print = System.out ::print;
		
		List<String> marcas = Arrays.asList("BMW ","Honda ","Audi ");
		//criando map
		System.out.println("\nUsando map simples...");
		marcas.stream().map(m-> m.toUpperCase()).forEach(print);
		
		//criando fluxo de operações para inserir no map
		UnaryOperator<String> maiuscula = n-> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n-> n.charAt(0)+"";//concatenando um tipo com string vazia funciona como conversor de string
		UnaryOperator<String> grito = n->n+"!";
		
		System.out.println("\nUsando composição...");
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
		
		//usando a classe Utilitarios para chamar o fluxo de operações ( utilizando method reference para método grito() )
		System.out.println("\nUsando classe separada...");
		marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).map(Utilitarios::grito).forEach(print);
	}
}
