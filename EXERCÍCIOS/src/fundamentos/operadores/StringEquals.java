package fundamentos.operadores;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		
		System.out.println("2"=="s");
		//ao comparar temos que entender que n�o se est� comparando o conte�do mas sim a vari�vel ent�o � falso nesse caso
		
		String s = new String("2");
		System.out.println("2"==s);
		//uma string que tem o mesmo valor de "2" permanece sendo diferente do texto "2". Mas o conte�do que deveria ser analisado para dar true
		
		//usa-se ent�o .equals para avaliar o conte�do interno da variavel
		Scanner entrada= new Scanner(System.in);
		s= entrada.next();
		System.out.println("2".equals(s));//true finalmente
		System.out.println("2".equals(s.trim()));//ignora todo espa�o vazio "      2  " e busca o conte�do 
		
		entrada.close();
}
	
}
