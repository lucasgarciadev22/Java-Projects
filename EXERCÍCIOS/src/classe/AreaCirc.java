package classe;

public class AreaCirc {
	//ao acrescentar uma variável static ela passa a ser padrão de classse
	double raio;
	static double pi;//ao acrescentar o final ele nunca altera
	
	AreaCirc(double raioInicial){
		pi=3.14;//pi fixo mas ainda não é static
		raio=raioInicial;
		
	}
double area() {
	return raio*raio*pi;// pode usar a função Math.pow(raio,2) que ele eleva o raio ao quadrado 
	
}
}
