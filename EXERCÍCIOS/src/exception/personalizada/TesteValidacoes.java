package exception.personalizada;

import exception.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		//tratando o caso de erro de string vazia  e nota fora de intervalo válido 
		//em um único bloco try..catch
		try {
			Aluno aluno = new Aluno("A", -7);
			
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch(NumeroForDoIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}

	
}
