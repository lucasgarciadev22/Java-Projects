package lambdas.desafioSemBinary;

public class Imposto {
double preco;
final double imposto = 0.085;//valor fixo passado diretamente

//construtor padrão
public Imposto(double preco) {
	this.preco = preco;
}

public double aplicaImposto() {
	//verifica se é isento ou não 
	if (preco >=2500) {
		double precoTaxado = preco + (preco*imposto);
		return precoTaxado;	
	}
	return preco; //caso isento não aplica taxa
	
}

}
