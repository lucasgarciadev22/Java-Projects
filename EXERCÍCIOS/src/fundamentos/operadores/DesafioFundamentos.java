package fundamentos.operadores;

import java.util.Scanner;

public class DesafioFundamentos {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe o primeiro valor");
	double num1=entrada.nextDouble();
	
	System.out.println("Informe o segundo valor");
	double num2=entrada.nextDouble();
	
	System.out.println("Informe a operação desejada");
	String operacao = entrada.next();//informar se será + - * /
	
	//Calculadora irá ler o num1 o num2 e a operacao. Então ela irá verificar o conteúdo da variável operacao para calcular
	double resultado = "+".equals(operacao) ? num1 + num2 : 0; // no início ele verá se operacao é uma soma senão será 0 só para ter algum valor em resultado
	resultado = "-".equals(operacao) ? num1 - num2 : resultado;//verifica subtração senão mantém o ultimo valor em resultado
	resultado = "*".equals(operacao) ? num1 * num2 :resultado;//verifica multiplicacao senão mantém o ultimo valor em resultado
	resultado = "/".equals(operacao) ? num1 / num2 :resultado;//verifica multiplicacao senão mantém o ultimo valor em resultado
	resultado = "%".equals(operacao) ? num1 % num2 :resultado;//verifica multiplicacao senão mantém o ultimo valor em resultado
	
	//mostrando o resultado final:
	System.out.printf("%.2f %s %.2f = %.2f",num1,operacao,num2,resultado);//num1 operacao num2 = resultado limitado sempre em 2 casas pós vírgula
	
	entrada.close();
	
	
	}

}
