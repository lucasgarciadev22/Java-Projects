package streamAPI;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		//alunos repetidos serão distinguidos
		Aluno a1 = new Aluno("Ana", 5.8);
		Aluno a2 = new Aluno("Larissa", 8.8);
		Aluno a3 = new Aluno("Laura", 9.8);
		Aluno a4 = new Aluno("Carlos", 4.8);
		Aluno a5 = new Aluno("Carla", 4.8);
		Aluno a6 = new Aluno("José", 7.9);
		Aluno a7 = new Aluno("Ana", 4.3);
		Aluno a8 = new Aluno("Leonarda", 0.8);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		//usando distinct para excluir duplicados
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		//usando skip para pular elementos e limit para limitar a execução do codigo
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(1).limit(2).forEach(System.out::println);
		
		//take while -> executa até o critério ser válido (neste caso usando a lambda de aprovado)
		System.out.println("\ntakeWhile");
		alunos.stream().distinct().skip(2).takeWhile(a-> a.nota >=7).forEach(System.out::println);
		
	}
	
	

}