package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		
		double nota= entrada.nextDouble();
		if (nota >10 || nota <0) {
			System.out.println("Nota Inv�lida");//nota corresponde a condi��o
		}
		else if(nota >=8.1) {
			System.out.println("Conceito A");//condi��o contr�ria inicia outro comando if
		}
		else if (nota >=6.1) {
			System.out.println("Conceito B");//teceira condi��o
		}
		else if (nota >=4.1) {
			System.out.println("Conceito C");//outra condi��o 
		}
		else if (nota >=2.1) {
			System.out.println("Conceito D");//outra condi��o
		}
		else {
			System.out.println("Conceito E");//condi��o final
		}
		entrada.close();
	}
	

}
