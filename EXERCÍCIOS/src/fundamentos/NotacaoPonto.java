package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s="Bom dia X";
		s = s.toUpperCase(); //insere o valor de s.toUpperCase dentro de s, fazendo com que ela seja maíscula
							////inserir sempre por último a função s.toUpperCase
		System.out.println(s);

		String z="Bom dia X";
		z=z.replace("X", "Senhora");//substitui X por Senhora dentro da variável z
		z=z.toUpperCase();//transforma em maísculo toda a string de z
		z=z.concat("!!!");//vai concatenar (combinar) o conteúdo de z com o que está no argumento ''!!!''
		System.out.println(z);
		
		//usando notação ponto em uma única linha
		
		String x="Leo".replace("L","T").toLowerCase().concat(" cuzão");
		System.out.println(x);
		
	//não existe operador nos tipos primitivos
		}

}
