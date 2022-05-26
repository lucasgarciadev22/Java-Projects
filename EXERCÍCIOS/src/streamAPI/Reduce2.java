package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 5.8);
		Aluno a2 = new Aluno("Larissa", 8.8);
		Aluno a3 = new Aluno("Laura", 9.8);
		Aluno a4 = new Aluno("Carlos", 4.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a-> a.nota >=7;
		Function<Aluno, Double> apenasNota = a-> a.nota;
		BinaryOperator<Double> somatorio = (a,b) -> a+b;
		
		//stream soma as notas dos alunos aprovados (parallel foi usado porque não precisa ser sequenciado)
		alunos.parallelStream().filter(aprovado).
		map(apenasNota).reduce(somatorio).
		ifPresent(System.out::println);
	}

}
