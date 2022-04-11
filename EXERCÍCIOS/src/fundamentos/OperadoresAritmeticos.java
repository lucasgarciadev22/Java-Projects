package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2+3);
		
		var x= 34.56;
		double y = 2.2;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//vai trunkar
		System.out.println(a/(double)b);//não vai trunkar pois ao realizar a operação ele fez um cast de b para convertê-lo em double
		System.out.println(a/(float)b);//não vai trunkar pois ao realizar a operação ele fez um cast de b para convertê-lo em float
		
		System.out.println(8%3);//modulo (resto da divisão)
		System.out.println(a%b);
		
		
		
		
		
		
	}

}
