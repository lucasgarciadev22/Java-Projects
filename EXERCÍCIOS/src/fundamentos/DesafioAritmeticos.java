package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		//potencia��o
		int a= 4*2-4;
		int b= (int)Math.pow(a, 3);//o resultado de potencia��es em Java fornece um valor double. Para evitar isso fazemos cast (int) para ser armazenado em um valor inteiro
		System.out.println(b);
		
		//--------- desafio de simplifica��o de equa��es----------
		
		//primeira parcela !!! usar sempre parentes nas express�es *******
		int a1=6*(3+2);
		int b1=(int)Math.pow(a1, 2);
		int c1=b1/(3*2);
		System.out.println(c1);
		
		//segunda parcela
		int a2=(1-5)*(2-7);
		int b2=a2/2;
		int c2=(int)Math.pow(b2, 2);
		System.out.println(c2);
		//subtrair a parte de cima 150  - 100
		int subtrair=c1-c2;
		//elevar toda parte de cima em 3
		int d2=(int)Math.pow(subtrair, 3);
		int e=(int)Math.pow(10, 3);
		System.out.println(d2);
		System.out.println(e);
		//fra��o final
		int resultado=d2/e;
		System.out.println("O resultado � "+resultado);
		
		//poderia organizar melhor, consultar video fundamentos 44
		
		
		
		
		
		
	
		
	}

}
