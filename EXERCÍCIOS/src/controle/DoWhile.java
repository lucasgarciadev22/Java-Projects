package controle;

import java.util.Scanner;

public class DoWhile {
	//sempre um comando do executa ao menos uma vez o c�digo
	
	public static void main(String[] args) {
		
		//lucas 6 de mar de 2022
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		
		do {
			
			System.out.println("Voc� precisa falar "+"as palavras m�gicas...");
			System.out.print("Quer sair?");
			texto=entrada.nextLine();
		
		}while(!texto.equalsIgnoreCase("por favor"));

		
		

		entrada.close();
	}

}
