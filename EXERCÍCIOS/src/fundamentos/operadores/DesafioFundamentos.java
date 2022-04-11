package fundamentos.operadores;

import java.util.Scanner;

public class DesafioFundamentos {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe o primeiro valor");
	double num1=entrada.nextDouble();
	
	System.out.println("Informe o segundo valor");
	double num2=entrada.nextDouble();
	
	System.out.println("Informe a opera��o desejada");
	String operacao = entrada.next();//informar se ser� + - * /
	
	//Calculadora ir� ler o num1 o num2 e a operacao. Ent�o ela ir� verificar o conte�do da vari�vel operacao para calcular
	double resultado = "+".equals(operacao) ? num1 + num2 : 0; // no in�cio ele ver� se operacao � uma soma sen�o ser� 0 s� para ter algum valor em resultado
	resultado = "-".equals(operacao) ? num1 - num2 : resultado;//verifica subtra��o sen�o mant�m o ultimo valor em resultado
	resultado = "*".equals(operacao) ? num1 * num2 :resultado;//verifica multiplicacao sen�o mant�m o ultimo valor em resultado
	resultado = "/".equals(operacao) ? num1 / num2 :resultado;//verifica multiplicacao sen�o mant�m o ultimo valor em resultado
	resultado = "%".equals(operacao) ? num1 % num2 :resultado;//verifica multiplicacao sen�o mant�m o ultimo valor em resultado
	
	//mostrando o resultado final:
	System.out.printf("%.2f %s %.2f = %.2f",num1,operacao,num2,resultado);//num1 operacao num2 = resultado limitado sempre em 2 casas p�s v�rgula
	
	entrada.close();
	
	
	}

}
