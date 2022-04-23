package ori_obj_composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno ("João");
		Aluno aluno2 = new Aluno ("Jaciara");
		Aluno aluno3 = new Aluno ("Rodolfo");
		
		Curso curso1 = new Curso ("Java Completo");
		Curso curso2 = new Curso ("Web 2023");
		Curso curso3 = new Curso ("React Native");
		
		//relacionando os alunos com os cursos
		
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno1);

		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		//cria uma nova var de classe Aluno e exibe todos os alunos matriculados no curso 1 
		for (Aluno alunoCurso1: curso1.alunos) {
			System.out.print("Estou matriculado no curso "+ curso1.nome);
			System.out.println(" e meu nome é "+ alunoCurso1.nome);
		}
		for (Aluno alunoCurso2: curso2.alunos) {
			System.out.print("Estou matriculado no curso "+ curso2.nome);
			System.out.println(" e meu nome é "+ alunoCurso2.nome);
		}	
		for (Aluno alunoCurso3: curso3.alunos) {
			System.out.print("Estou matriculado no curso "+ curso3.nome);
			System.out.println(" e meu nome é "+ alunoCurso3.nome);
		}
		
		//exibir todos os alunos 
		System.out.println(aluno1.cursos.get(0).alunos);//pega todos os alunos do curso 1 em forma de array original
		
		//procura o curso que contenha no nome "Java Completo" e se o resultado for diferente de nula exibe os alunos matriculados
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado !=null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
		
		
		
		
		
	}

}
