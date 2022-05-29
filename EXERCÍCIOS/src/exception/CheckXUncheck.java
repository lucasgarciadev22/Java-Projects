package exception;

public class CheckXUncheck {
	
	public static void main(String[] args) {
		//posso colocar o throw da exception no main para ele ser mais genérico ou tratar cada erro em try...catchs
		geraErro1();
		
		//erro 2 tratado no momendo da chamada com throwable em try...catch
		try {
			geraErro2();//precisa tratar neste ponto de chamada
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		//erro três tratado no próprio método 
		geraErro3();
		
		System.out.println("Fim");
		
		//trata erro 1 (opcional porque é runtime)
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());//trata erro runtime
		}
		
	}
	//Exceção Não checada ou não verificada (pode ou não tratar o erro)
	static void geraErro1() {
		new RuntimeException("Ocorreu um erro #01");
	}
	//Exceção Checada ou verificada  (ou usar throws ou usa try ... catch interno no método
	static void geraErro2()  throws Exception{
		throw new Exception("Ocorreu um erro #02");//lança exceção (precisa ser informado  na assinatura )
		
	}
	//Exceção checada com try ...catch interno
	static void geraErro3() {
		try {
			throw new Exception("Ocorreu um erro #03");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro #03!");//essa será a mensagem que vai aparecer 
		}
	}

}
