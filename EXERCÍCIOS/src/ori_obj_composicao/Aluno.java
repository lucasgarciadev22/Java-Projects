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
	
	//método de busca de cursos recebe nome como parâmetro inciial e busca o curso com mesmo nome
	Curso obterCursoPorNome (String nome) {
		
		for(Curso curso: this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	
//criar método público para converter os nomes na memória para string na hora de exibir usando get()
	
	public String toString () {
		return nome;
	}

}
