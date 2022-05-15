package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar (double a, double b);

	//m�todo default � ignorado pela implementa��o de classe mas pode ser acessado
	default String legal() {
	return "legal"; //posso usar outros m�todos de interface no return de um m�todo default
	}
	//m�todo static tamb�m n�o ir� conflitar 
	static String muitoLegal() {
		return "muito legal";//n�o posso usar outro m�todos dentro de um static mas o contr�rio sim
	}
}
