package controle;

import java.util.Scanner;

public class WhileIndeterminado {
//condi��o inversa do while usando >>> ! na condi��o
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		String valor="";//setar valor como vazio string
		
		while(!valor.equalsIgnoreCase("sair")) { //condi��o inversa enquanto valor for diferente de...
			System.out.println("Seu Texto: ");
			valor=entrada.nextLine()//leitura do valor da entrada e pula uma linha
;
			}
		
		entrada.close();
	}
	
	
}
