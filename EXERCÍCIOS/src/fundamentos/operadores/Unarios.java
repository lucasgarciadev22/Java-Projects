package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		
		a++;// a = a + 1
		a--;// a = a - 1
		
		++b;// b = b + 1;
		--b;// b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println((++a == b--));
		System.out.println(a == b);//deu falso porque ele fez o seguinte ++a==b (true até aqui)-- (agora b é 1) então a==b vira falso
		System.out.println(a);
		System.out.println(a);
		System.out.println(b);
	}

}
