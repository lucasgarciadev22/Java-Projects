package classe;

public class AreaCirc {
	//ao acrescentar uma vari�vel static ela passa a ser padr�o de classse
	double raio;
	static double pi;//ao acrescentar o final ele nunca altera
	
	AreaCirc(double raioInicial){
		pi=3.14;//pi fixo mas ainda n�o � static
		raio=raioInicial;
		
	}
double area() {
	return raio*raio*pi;// pode usar a fun��o Math.pow(raio,2) que ele eleva o raio ao quadrado 
	
}
}
