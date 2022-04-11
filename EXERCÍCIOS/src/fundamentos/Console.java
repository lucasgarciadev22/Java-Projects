package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		//imprimindo sem println pra n�o pular nenhuma linha
	
		System.out.print("Bom ");
		System.out.print("dia!\n");//quebra linha
		System.out.print("Bom ");
		System.out.print("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);// formata o print e joga os n�meros dentro da sequ�ncia de %d e quebra linha %n
		System.out.printf("Sal�rio: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n","Jo�o");// joga a string dentro de %s e quebra lina no %n
		
	//escanear entrada de teclado com system.in
		Scanner entrada= new Scanner(System.in);
		//coletar nome na entrada do usu�rio
		System.out.println("Digite o seu nome:");
		String nome=entrada.nextLine();
		//coletar sobrenome
		System.out.println("Digite o seu sobrenome:");
		String sobrenome=entrada.nextLine();
		//printar resultado das coletas
		System.out.println("\n\nNome completo:"+nome+"  "+sobrenome);
		entrada.close();//finaliza monitoramento de inputs
		
		
		}

}
