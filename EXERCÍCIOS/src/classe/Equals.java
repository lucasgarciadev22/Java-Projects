package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1= new Usuario();
		u1.nome = "Lucas Garcia";
		u1.email ="lucas.garcia22@javamail.com";

		Usuario u2= new Usuario();
		u2.nome = "Lucas Garcia";
		u2.email ="lucas.garcia22@javamail.com";
		
		//comparando dar� resultado falso para == porque tem endere�os de mem�ria diferentes e est� sem implementa��o
		
		System.out.println(u1==u2);
		//comparando ser� verdadeiro porque os valores s�o iguais e passaram no teste dentro da classe
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}
}
