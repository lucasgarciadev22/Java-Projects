package array;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		//criando o array e definindo seu tipo e tamanho 
		double [] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;//defini valor na posi��o de �ndice 0
		notasAlunoA[1] = 8;//defini valor na posi��o de �ndice 1
		notasAlunoA[2] = 6.7;//defini valor na posi��o de �ndice 2
		
		System.out.println(Arrays.toString(notasAlunoA));//passa valores do array para string
		System.out.println(notasAlunoA[0]);//exibe primeira nota do aluno A
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);//exibe ultima nota do aluno A (tamanho - 1)
		//System.out.println(notasAlunoA[4]);//exibe erro porque ultrapassa os limites de �ndices
		double total = 0;
		//cria��o de um controle for pra percorrer o array
		for(int i = 0; i<notasAlunoA.length; i++) {
			total+=notasAlunoA[i];	
		}
		//resultado 
		
		System.out.println(total/notasAlunoA.length);// tira m�dia de forma din�mica sem precisar determinar o numero do divisor
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada,10};
		
		double totalAlunoB = 0;
		
	}

}
