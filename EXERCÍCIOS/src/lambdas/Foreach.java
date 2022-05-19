package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
	List<String> aprovados = Arrays.asList("Ana","Bia", "Lia","Gui" );
	
	//foreach tradicional 
	System.out.println("Forma tradicional...");
	for(String nome: aprovados) {
		System.out.println(nome);
	}
	System.out.println("\nLambda #01...");
	
	aprovados.forEach((nome) -> {System.out.println(nome+"  Aprovado");});//passa uma função Lambda dentro de cada nome da lista
	
	System.out.println("\nMethod Reference...");
	aprovados.forEach(System.out::println );
	
	System.out.println("\nMethod Reference #02...");
	aprovados.forEach(nome -> meuImprimir(nome)); //passa uma função Lambda (baseada em método externo)dentro de cada nome da lista
	
	}

	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome );
	}
	
	
}
