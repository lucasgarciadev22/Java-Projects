package ori_obj_heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA; //constante de limite de velocidade (pode ser publico)
	protected int velocidadeAtual;//transferido por herança
	private int delta = 5;//transferido por herança
	
	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}


	//no construtor de Carro eu declaro a constante VELOCIDADE_MAXIMA
	protected Carro (int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	public void acelerar() {//tornar publico este método
		if (velocidadeAtual +getDelta() > VELOCIDADE_MAXIMA){//verifica cada vez se já ultrapassou o limite de velocidade
		velocidadeAtual = VELOCIDADE_MAXIMA;//limita velocidade
		}else {
		velocidadeAtual +=getDelta();
		}
		
	}
	
	public void frear() {//tornar publico este método
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
