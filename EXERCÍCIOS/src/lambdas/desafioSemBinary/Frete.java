package lambdas.desafioSemBinary;

public class Frete {
double preco;//pre�o do produto ap�s aplica��o de poss�veis impostos 

public Frete(double preco){
	this.preco = preco;
}

public double calculaFrete() {
	if (preco >= 3000) {
		double precoComFrete = preco+100;
		return precoComFrete;
	}
	
	else{
		double precoComFrete = preco+50;
		return precoComFrete;
	}
	
}



}
