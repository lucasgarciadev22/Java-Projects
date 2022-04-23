package ori_obj_composicao;

import java.util.ArrayList;

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	//construtor de nome de aluno
	Aluno (String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
		}
	
	//m�todo de busca de cursos recebe nome como par�metro inciial e busca o curso com mesmo nome
	Curso obterCursoPorNome (String nome) {
		
		for(Curso curso: this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	
//criar m�todo p�blico para converter os nomes na mem�ria para string na hora de exibir usando get()
	
	public String toString () {
		return nome;
	}

}
