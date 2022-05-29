package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 5.8);
		Aluno a2 = new Aluno("Larissa", 8.8);
		Aluno a3 = new Aluno("Laura", 9.8);
		Aluno a4 = new Aluno("Carlos", 4.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		//comparator com lambda		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			
			if( aluno1.nota > aluno2.nota) return 1;
			if( aluno1.nota > aluno2.nota) return -1;
			
			return 0;
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			
			if( aluno1.nota > aluno2.nota) return -1;
			if( aluno1.nota > aluno2.nota) return 1;
			
			return 0;
		};
		
		
		//exibir os resultados de menor nota e maior nota
		
		
		System.out.println(alunos.stream().min(melhorNota).get());
		System.out.println(alunos.stream().max(melhorNota).get());//melhor nota
		//adicionando um segund omprador para pior nota
		
		System.out.println(alunos.stream().min(piorNota).get());//melhor nota
		System.out.println(alunos.stream().max(piorNota).get());
		
	}
	
}
