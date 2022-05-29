package exception;

public class ErrosBasicos {

	public static void main(String[] args) {
		//este valor será uma exceção do java ... precisa de tratamento
		//System.out.println(7/0);
		
		Aluno a1 = null;
		
		//usando bloco try...catch
		try {
		imprimirNomeDoAluno(a1);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu um erro no momento "+
			"de imprimir o nome do usuário");
		}
		//usando blocotry... catch para exceções aristméticas
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Ocorreu o erro: "+e.getMessage());//Throw exception
		}
		//finally:
		System.out.println("Fim");
		//NUNCA SILENCIAR O CATCH...
	}
	
	
	//com este método é impossível saber se aluno foi ou não recebido e então pode gerar erro
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
