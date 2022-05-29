package exception;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			
			//lucas 28 de mai de 2022
			

			System.out.println("O resultado é: "+7/entrada.nextInt());

			entrada.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally {//sempre executa e fecha o input
			System.out.println("Finalmente...");
			
			entrada.close();
			
		}
		System.out.println("Fim");
	}
}
