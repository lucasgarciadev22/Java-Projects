package streamAPI;

public class Media {
		private  double total;
		private int quantidade;
		
		//adiciona valores e incrementa a quantidade e retorna a inst�ncia atual (Media)
		public Media adicionar(double valor) {
			total += valor;
			quantidade ++;
			return this;
		}
		
		//exibe media
		public double getValor() {
			return total/quantidade;
		}
		
		//m�todo para somar as m�dias  de forma gen�rica criando o objeto resultante
		public static Media combinar(Media m1, Media m2) {
			Media resultante = new Media();
			resultante.total = m1.total +m2.total;
			resultante.quantidade = m1.quantidade + m2.quantidade;
			return resultante;
		}
	}

