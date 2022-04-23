package ori_obj_composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	//construtor de nome de curso
	Curso(String nome){
		this.nome = nome;
	}
	
	//m�todo de adicionar com rela��o bidirecional
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);//adiciona aluno na lista de curso
		aluno.cursos.add(this);//adiciona curso na lista de aluno
		
		
	}
	
	

}
