package exception;

public class ErrosBasicos {

	public static void main(String[] args) {
		//este valor ser� uma exce��o do java ... precisa de tratamento
		//System.out.println(7/0);
		
		Aluno a1 = null;
		
		//usando bloco try...catch
		try {
		imprimirNomeDoAluno(a1);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorreu um erro no momento "+
			"de imprimir o nome do usu�rio");
		}
		//usando blocotry... catch para exce��es aristm�ticas
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
	
	
	//com este m�todo � imposs�vel saber se aluno foi ou n�o recebido e ent�o pode gerar erro
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
