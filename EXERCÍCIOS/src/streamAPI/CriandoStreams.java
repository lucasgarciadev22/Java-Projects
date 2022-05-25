package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		//usando Stream.of
		
		Consumer<String> print = System.out::print; //consumer básico de método printar
		//Consumer<Integer> println = System.out::print; //consumer básico de método printar
		
		Stream<String> langs = Stream.of("Java ", "Lua ","JS\n");
		
		//executa stream
		langs.forEach(print);
		
		//aplicando stream.of em arrays
		
		//método 1
		String[] maisLangs = {"Python ", "Lisp ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		//metodo 2
		Arrays.stream(maisLangs).forEach(print);
		//método 3
		Arrays.stream(maisLangs, 1, 2).forEach(print);//selecionando quais índices do array eu quero mostrar 
		
		//usando o parallelStream sem ordem
		List<String> outrasLangs = Arrays.asList("\nC ","PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		//usando o Stream.generate/.iterate para streams infinitas
		//Stream.generate(()->"a").forEach(print);
		//Stream.iterate(0, n-> n+1).forEach(println);
	
	
	
	
	
	}

}
