package lambdas.desafioSemBinary;

public class Desafio {
//Desafio Binary Operator:
	//1. A partir do produto calcular o preco real (com desconto)
	//2. Imposto Municipal: >= 2500 (8,5%)/ <2500 (isento)
	//3. Frete: >= 3000 (100)/ <3000 (50)
	//4. Arredondar: Deixar duas casas decimais
	//5. Formatar: R$ 1234,56
	
	public static void main(String[] args) {
		
		Produto1 iPad = new Produto1("iPad", 4799.90, 0.20);
		//calcula preço final
		double iPadComDesconto = iPad.calculaPreco();
		Imposto impostoMunicipal = new Imposto(iPadComDesconto);
		//aplica imposto municipal
		double iPadTaxado = impostoMunicipal.aplicaImposto();
		//calcula frete do valor final da compra
		Frete frete1 = new Frete(iPadTaxado);
		double valorFinal = frete1.calculaFrete();
		
		// tratando resultado final 
		System.out.println("O valor final da compra é:");
		System.out.printf("R$%.2f",valorFinal);
	}
}
