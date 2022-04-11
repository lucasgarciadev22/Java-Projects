package fundamentos.operadores;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		
		System.out.println("2"=="s");
		//ao comparar temos que entender que não se está comparando o conteúdo mas sim a variável então é falso nesse caso
		
		String s = new String("2");
		System.out.println("2"==s);
		//uma string que tem o mesmo valor de "2" permanece sendo diferente do texto "2". Mas o conteúdo que deveria ser analisado para dar true
		
		//usa-se então .equals para avaliar o conteúdo interno da variavel
		Scanner entrada= new Scanner(System.in);
		s= entrada.next();
		System.out.println("2".equals(s));//true finalmente
		System.out.println("2".equals(s.trim()));//ignora todo espaço vazio "      2  " e busca o conteúdo 
		
		entrada.close();
}
	
}
