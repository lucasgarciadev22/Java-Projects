package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 5.8);
		Aluno a2 = new Aluno("Larissa", 8.8);
		Aluno a3 = new Aluno("Laura", 9.8);
		Aluno a4 = new Aluno("Carlos", 4.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a-> a.nota >=7;
		
		//allMatch verifica se todos validaram o requisito
		System.out.println(alunos.stream().allMatch(aprovado));
		//anyMatch verifica se algum valida o requisito
		System.out.println(alunos.stream().anyMatch(aprovado));
		//noneMatch verifica se nenhum validou o requisito
		System.out.println(alunos.stream().noneMatch(aprovado));
	}
	
}
