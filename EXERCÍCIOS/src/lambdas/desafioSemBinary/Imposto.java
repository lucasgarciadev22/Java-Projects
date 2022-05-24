package lambdas.desafioSemBinary;

public class Imposto {
double preco;
final double imposto = 0.085;//valor fixo passado diretamente

//construtor padr�o
public Imposto(double preco) {
	this.preco = preco;
}

public double aplicaImposto() {
	//verifica se � isento ou n�o 
	if (preco >=2500) {
		double precoTaxado = preco + (preco*imposto);
		return precoTaxado;	
	}
	return preco; //caso isento n�o aplica taxa
	
}

}
