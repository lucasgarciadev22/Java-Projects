package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		//lucas 11 de abr de 2022
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double[] [] notasTurma = new double [qtdAlunos] [qtdNotas];//cria a matriz de duas colunas de acordo com a qtd de aluno  notas informado
		
		double total =0;
		
		//preenchendo a matriz 
		
		
		//estrutura for que incrementa o indice de alunos conforme a quantidade de notas de turma, permitindo percorrer o array
		for (int a=0; a <notasTurma.length; a++) {
			//incrementa o indice de notas conforme percorre o array aluno anterior 
			for (int n = 0; n <notasTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);//inicia com incremento de 1 para pular aluno 0
				notasTurma [a] [n] = entrada.nextDouble();//usuario digita o nome e a nota de cada aluno na matriz
				total+= notasTurma [a] [n];//incrementa total de alunos e notas
			}
	
		}
		//calculando a media e exibindo notas da turma
		
		double media= total/ (qtdAlunos*qtdNotas);
		System.out.printf("Média da Turma é %.2f",media);
		//estrutura for para mostrar as notas do aluno com base no array das notas da turma
		for (double [] notasAluno: notasTurma) {
		System.out.println(Arrays.toString(notasAluno));//exibe em forma de texto a matriz construida
		
	}
		entrada.close();
}
	
}