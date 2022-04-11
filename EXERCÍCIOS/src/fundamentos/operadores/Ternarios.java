package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		
//uma maniera mais rápido de saber se algo é falso ou verdadeiro. O que está antes do : é a parte da ação caso true e o outro a ação caso false
		double media = 2.0;
		String resultado = media>=7.0 ? "Aprovado" : media>=5.0 ? "Em recuperação" : "Reprovado";
		System.out.println("O aluno está " +resultado);
		
	}
}

	
