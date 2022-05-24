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
		
		//método calcular preço final 
		public double calculaPreco(){
			double precoFinal= preco*(1-desconto);
			return precoFinal;
		}
		//construindo método padrão toString que será a assinatura da classe 
		public String toString() {
			double precoFinal= preco*(1-desconto);
			return nome+" tem preço de R$"+precoFinal;
		}
	}

