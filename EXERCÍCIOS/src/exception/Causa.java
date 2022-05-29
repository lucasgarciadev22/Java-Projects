package exception;

public class Causa {
	//este programa exemplifica como um erro é causado por vários outros erros

	public static void main(String[] args) {
		
		//tratando causa do metodoA no main já mais especificamente illegal arguments
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception -> DESCOBRE CAUSA RAIZ DO ERRO
		if(e.getCause()!=null) {
			System.out.println(e.getCause().getMessage());
		}
		}	
		metodoA(null);
	}
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			// TODO: handle exception -> dentro de um bloco try...catch posso adicionar mais throws
			throw new IllegalArgumentException(causa);
		}
}
	static void metodoB(Aluno aluno) {
		if(aluno==null) {
		throw new NullPointerException("Aluno está nulo!");
		}
		System.out.println(aluno.nome);
	}
	}
