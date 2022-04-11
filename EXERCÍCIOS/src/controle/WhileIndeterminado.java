package controle;

import java.util.Scanner;

public class WhileIndeterminado {
//condição inversa do while usando >>> ! na condição
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		String valor="";//setar valor como vazio string
		
		while(!valor.equalsIgnoreCase("sair")) { //condição inversa enquanto valor for diferente de...
			System.out.println("Seu Texto: ");
			valor=entrada.nextLine()//leitura do valor da entrada e pula uma linha
;
			}
		
		entrada.close();
	}
	
	
}
