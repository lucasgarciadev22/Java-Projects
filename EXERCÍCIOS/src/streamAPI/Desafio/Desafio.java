package streamAPI.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
	public static void main(String[] args) {
		
		//Desafio do parque de diversões
		//1. criar array com varias pessoas
		//2. verificar altura das pessoas
		//3. filtrar quem pode ir no brinquedo (altura acima de 1,65 m
		
		Pessoa p1= new Pessoa("Ana", 1.62);
		Pessoa p2= new Pessoa("Arthur", 1.85);
		Pessoa p3= new Pessoa("Rebeca", 1.95);
		Pessoa p4= new Pessoa("Luan", 1.50);
		
		List<Pessoa> pessoas = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Pessoa>verificaAltura = p-> p.altura >=1.66;
		Function<Pessoa, String>validaEntrada = v-> v.nome+" pode usar o brinquedo";
		
		pessoas.stream().filter(verificaAltura).map(validaEntrada).forEach(System.out::println);
		
		
	}

}
