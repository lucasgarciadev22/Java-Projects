package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		//inicia coleta de dados
		Scanner salarios = new Scanner(System.in);
		
		//coleta dados primeiro salario
		System.out.println("Informe o primeiro salário: ");
		String salario1 = salarios.nextLine().replace(",", ".");//converte vírgulas em pontos no padrão americano com replace
		
		//coleta dados segundo salario
		System.out.println("Informe o segundo salário: ");
		String salario2 = salarios.nextLine().replace(",", ".");//converte vírgulas em pontos no padrão americano com replace;
		
		//coleta dados terceiro salario
		System.out.println("Informe o terceiro salario: ");
		String salario3 = salarios.nextLine().replace(",", ".");//converte vírgulas em pontos no padrão americano com replace;	
		
		//converte as Strings para double
		double resultado1= Double.parseDouble(salario1);
		double resultado2=Double.parseDouble(salario2);
		double resultado3=Double.parseDouble(salario3);
		
		//informa os resultados de soma
		double soma=resultado1+resultado2+resultado3;
		System.out.println("A soma dos últimos três salarios é: "+soma);
		System.out.println("A média salarial é: "+soma/3);
		
		
		salarios.close();
		
		
	}

}
