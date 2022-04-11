package fundamentos;

import java.util.Scanner;

public class DesafioConvers�o {
	public static void main(String[] args) {
		//inicia coleta de dados
		Scanner salarios = new Scanner(System.in);
		
		//coleta dados primeiro salario
		System.out.println("Informe o primeiro sal�rio: ");
		String salario1 = salarios.nextLine().replace(",", ".");//converte v�rgulas em pontos no padr�o americano com replace
		
		//coleta dados segundo salario
		System.out.println("Informe o segundo sal�rio: ");
		String salario2 = salarios.nextLine().replace(",", ".");//converte v�rgulas em pontos no padr�o americano com replace;
		
		//coleta dados terceiro salario
		System.out.println("Informe o terceiro salario: ");
		String salario3 = salarios.nextLine().replace(",", ".");//converte v�rgulas em pontos no padr�o americano com replace;	
		
		//converte as Strings para double
		double resultado1= Double.parseDouble(salario1);
		double resultado2=Double.parseDouble(salario2);
		double resultado3=Double.parseDouble(salario3);
		
		//informa os resultados de soma
		double soma=resultado1+resultado2+resultado3;
		System.out.println("A soma dos �ltimos tr�s salarios �: "+soma);
		System.out.println("A m�dia salarial �: "+soma/3);
		
		
		salarios.close();
		
		
	}

}
