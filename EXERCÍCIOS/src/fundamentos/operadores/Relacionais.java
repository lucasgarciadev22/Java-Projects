package fundamentos.operadores;

public class Relacionais {
public static void main(String[] args) {
	//97 é a posição do caractere a na tabela do UNICODE
	int a = 97;
	int b = 'a';
	
	System.out.println(a==b);//printa true devido ao fato descrito acima.
	
	//Os operadores relacionais
	
	System.out.println(3>4);//maior
	System.out.println(3>=3);//maior ou igual
	System.out.println(3<7);//menor
	System.out.println(30<=7);//menor ou igual
	System.out.println(30 != 7);//diferente
	//probleminha
	double nota =9.9;
	boolean bomComportamento = false;
	boolean passouPorMedia = nota >= 7;
	boolean temDesconto = bomComportamento && passouPorMedia;
	 System.out.println("Tem desconto?"+temDesconto);
}
}
