package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s="Bom dia X";
		s = s.toUpperCase(); //insere o valor de s.toUpperCase dentro de s, fazendo com que ela seja ma�scula
							////inserir sempre por �ltimo a fun��o s.toUpperCase
		System.out.println(s);

		String z="Bom dia X";
		z=z.replace("X", "Senhora");//substitui X por Senhora dentro da vari�vel z
		z=z.toUpperCase();//transforma em ma�sculo toda a string de z
		z=z.concat("!!!");//vai concatenar (combinar) o conte�do de z com o que est� no argumento ''!!!''
		System.out.println(z);
		
		//usando nota��o ponto em uma �nica linha
		
		String x="Leo".replace("L","T").toLowerCase().concat(" cuz�o");
		System.out.println(x);
		
	//n�o existe operador nos tipos primitivos
		}

}
