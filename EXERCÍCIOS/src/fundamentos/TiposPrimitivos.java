package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Infos do funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //Colocar underline para facilitar vizualizar e L por ser LONG caso seja muito grande
		
		
		//Tipos numericos reais
		float salario = 11_445.44F; // colocar F no final porque o padrao seria double
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Números de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id+": ganha -->"+salario);
		System.out.println("Férias?"+ estaDeFerias);
		System.out.println("Status:"+status);
	}


}
