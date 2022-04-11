package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		
		double nota= entrada.nextDouble();
		if (nota >10 || nota <0) {
			System.out.println("Nota Inválida");//nota corresponde a condição
		}
		else if(nota >=8.1) {
			System.out.println("Conceito A");//condição contrária inicia outro comando if
		}
		else if (nota >=6.1) {
			System.out.println("Conceito B");//teceira condição
		}
		else if (nota >=4.1) {
			System.out.println("Conceito C");//outra condição 
		}
		else if (nota >=2.1) {
			System.out.println("Conceito D");//outra condição
		}
		else {
			System.out.println("Conceito E");//condição final
		}
		entrada.close();
	}
	

}
