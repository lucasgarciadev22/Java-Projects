package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.7);
		Aluno a2 = new Aluno("Ana", 4.7);
		Aluno a3 = new Aluno("Ana", 3.7);
		Aluno a4 = new Aluno("Ana", 8.7);
		Aluno a5 = new Aluno("Ana", 9.7);
		Aluno a6 = new Aluno("Ana", 6.7);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		//função predicado será o núcleo do filter 
		Predicate<Aluno> aprovado = a-> a.nota >= 7;
		//função de mensagem
		Function<Aluno, String> mensagemAprovado = 
				a-> "Parabéns " + a.nome + "!Você foi aprovado(a)";
				
	//aplicando no stream-> filtro, map, printando com method reference
				alunos.stream().filter(aprovado).map(mensagemAprovado).forEach(System.out::println);
	}

}
