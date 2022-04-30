package ori_obj_heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA; //constante de limite de velocidade
	int velocidadeAtual;
	int delta = 5;
	
	//no construtor de Carro eu declaro a constante VELOCIDADE_MAXIMA
	Carro (int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	void acelerar() {
		if (velocidadeAtual +delta > VELOCIDADE_MAXIMA){//verifica cada vez se já ultrapassou o limite de velocidade
		velocidadeAtual = VELOCIDADE_MAXIMA;//limita velocidade
		}else {
		velocidadeAtual +=delta;
		}
		
	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			
		}else {
			velocidadeAtual = 0;
			
		}
	}
	public String toString() {
		
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	
	}
}
