package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		
//uma maniera mais r�pido de saber se algo � falso ou verdadeiro. O que est� antes do : � a parte da a��o caso true e o outro a a��o caso false
		double media = 2.0;
		String resultado = media>=7.0 ? "Aprovado" : media>=5.0 ? "Em recupera��o" : "Reprovado";
		System.out.println("O aluno est� " +resultado);
		
	}
}

	
