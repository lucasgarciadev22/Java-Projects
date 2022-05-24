package lambdas.desafioComBinary;

public class Produto {
		
		final String nome;
		final double preco;
		final double desconto;
		
		public Produto(String nome, double preco, double desconto) {
			super();
			this.nome = nome;
			this.preco = preco;
			this.desconto = desconto;
		}
		
		//m�todo calcular pre�o final 
		public double calculaPreco(){
			double precoFinal= preco*(1-desconto);
			return precoFinal;
		}
		//construindo m�todo padr�o toString que ser� a assinatura da classe 
		public String toString() {
			double precoFinal= preco*(1-desconto);
			return nome+" tem pre�o de R$"+precoFinal;
		}
	}

