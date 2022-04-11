package controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média:");
		double media = entrada.nextDouble();

		if (media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		if(media <7 && media >=4.5) {
			System.out.println("Recuperação!");
		}
		
		if(media<4.5 && media>=0) {
			System.out.println("Reprovado!");
			
			//pode salvar as expressoes matematicas dentro de variaveis boolean e testar se é true ou false com comando IF
		}

		entrada.close();

	}
}
