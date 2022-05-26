package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 5.8);
		Aluno a2 = new Aluno("Larissa", 8.8);
		Aluno a3 = new Aluno("Laura", 9.8);
		Aluno a4 = new Aluno("Carlos", 4.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a-> a.nota >=7;
		Function<Aluno, Double> apenasNota = a-> a.nota;
		
		//função de adicionar média já foi implementada na classe então já irá retornar a média
		BiFunction<Media, Double, Media> calcularMedia =
				(media,nota) -> media.adicionar(nota);
		//instancia o método static de combinar criado na classe Media
		BinaryOperator<Media>combinarMedia=
				(m1,m2)-> Media.combinar(m1,m2);
		
		//stream das notas (reduce modo 3) e armazena o resultado de tudo dentro de uma variável
		Media mediaFinal = alunos.stream().filter(aprovado).map(apenasNota)
		//.reduce(identidade, acumulador, combinador) -> por isso a classe combinar dentro de Media foi criada
		.reduce(new Media(), calcularMedia,combinarMedia);
		
		System.out.println("A média da turma é "+ mediaFinal.getValor());
		
	}

}
