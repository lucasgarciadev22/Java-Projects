package exception.personalizada;

import exception.Aluno;

public class Validar {

	private Validar() {}
	
	public static void aluno(Aluno aluno) {
		//valida nota do Aluno
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		//erro atributo nome vazio
		if (aluno.nome == null|| aluno.nome.trim().isEmpty()) {//.trim ignors espaços
			throw new StringVaziaException("nome");
		}
		//errp atributo nota fora de intervalo
		if(aluno.nota <0 || aluno.nota>10) {
			throw new NumeroForDoIntervaloException("nota");
		}
	}
	
}
