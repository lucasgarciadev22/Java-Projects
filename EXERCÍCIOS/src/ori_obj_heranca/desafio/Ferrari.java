package ori_obj_heranca.desafio;

public class Ferrari extends Carro {
	
	//chama construtor padrão
	Ferrari(){
			this(315);//passa parâmetro velocidadeMaxima setado
	}
	//chama construtor sem definir velocidade máxima
	Ferrari(int velocidadeMaxima){
		super (velocidadeMaxima);
		delta = 350;//altera delta de 5 pra 350 para testar se ele para no limite setado
	}
	
	
	
	}
//	@Override
////	void acelerar() {
//		// TODO Auto-generated method stub
//		velocidadeAtual+=15;
//	}


