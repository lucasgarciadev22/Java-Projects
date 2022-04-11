package fundamentos;



public class Wrappers {

	public static void main(String[] args) {

		// os tipos de wrappers que s�o env�lucros de primitivos(primitivo orientado �
		// objeto
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;// int
		Long l = 100000L;
		System.out.println(b.byteValue());// imprime valor de byte
		System.out.println(s.toString());// converte o valor em short para uma string e imprime
		System.out.println(i*3);
		System.out.println(l/3);//opera��es desse tipo gera valor do mesmo tipo (mas se colocar 3.0 coloca resultado em v�rgula)
		//parse � uma fun��o que transforma o valor v�lido dentro de uma string em um valor v�lido do mesmo tipo desejado
		Boolean bo=Boolean.parseBoolean("true");//pega o texto "true" e transforma em boolean
		System.out.println(bo);//imprime o boolean true
		System.out.println(bo.toString().toUpperCase());//pega o true boolean e transforma em texto, ap�s joga pra ma�sculo
		
		Float f=123.10F;
		System.out.println(f);
		Double d=1234.5678;
		System.out.println(d);
		
		
		Character c='#';//char (usar aspas simples)
		System.out.println(c);
		System.out.println(c+"...");
		//os Wrappers sempre usam letra mai�sculas, apenas char e int mudam nome
	}

}
