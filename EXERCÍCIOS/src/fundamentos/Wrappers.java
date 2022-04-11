package fundamentos;



public class Wrappers {

	public static void main(String[] args) {

		// os tipos de wrappers que são envólucros de primitivos(primitivo orientado à
		// objeto
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;// int
		Long l = 100000L;
		System.out.println(b.byteValue());// imprime valor de byte
		System.out.println(s.toString());// converte o valor em short para uma string e imprime
		System.out.println(i*3);
		System.out.println(l/3);//operações desse tipo gera valor do mesmo tipo (mas se colocar 3.0 coloca resultado em vírgula)
		//parse é uma função que transforma o valor válido dentro de uma string em um valor válido do mesmo tipo desejado
		Boolean bo=Boolean.parseBoolean("true");//pega o texto "true" e transforma em boolean
		System.out.println(bo);//imprime o boolean true
		System.out.println(bo.toString().toUpperCase());//pega o true boolean e transforma em texto, após joga pra maúsculo
		
		Float f=123.10F;
		System.out.println(f);
		Double d=1234.5678;
		System.out.println(d);
		
		
		Character c='#';//char (usar aspas simples)
		System.out.println(c);
		System.out.println(c+"...");
		//os Wrappers sempre usam letra maiúsculas, apenas char e int mudam nome
	}

}
