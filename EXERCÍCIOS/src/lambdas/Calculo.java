package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar (double a, double b);

	//método default é ignorado pela implementação de classe mas pode ser acessado
	default String legal() {
	return "legal"; //posso usar outros métodos de interface no return de um método default
	}
	//método static também não irá conflitar 
	static String muitoLegal() {
		return "muito legal";//não posso usar outro métodos dentro de um static mas o contrário sim
	}
}
