package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		//calcular medias da turma
		//lucas 6 de mar de 2022
		Scanner entrada = new Scanner(System.in);
		int quantidadenotas=0;
		double notanumero=0;//valor inicial  MUITO IMPORTANTE COLOCAAAAR VALOR NULO NO INÍCIOOO
		double total=0;//valor inicial do montante de pontos
		
		while (notanumero!=-1) {
			System.out.println("Digite uma nota:");
			notanumero=entrada.nextDouble();
			if(notanumero<=10 && notanumero>=0) {
			total+=notanumero;//joga o valor da nota dento do total de pontos
			quantidadenotas++;//incrementa o valor do numero das notas inseridas
			}
			else if(notanumero !=-1) {
				System.out.println("Esta é uma nota inválida");
			}
			

			 }
		System.out.println("Você escolheu sair do programa");
		double media=total/quantidadenotas;
		
		System.out.println("Media atual: "+media);
		

		entrada.close();
		
	}

}
