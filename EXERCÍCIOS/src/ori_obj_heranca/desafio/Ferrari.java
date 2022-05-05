package ori_obj_heranca.desafio;

public class Ferrari extends Carro implements Esportivo_Interface, Luxo_Interface{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	//chama construtor padrão
	public Ferrari(){			//tornar Ferrari uma classe publica  e construtor publico 
			this(315);//passa parâmetro velocidadeMaxima setado
	}
	//chama construtor sem definir velocidade máxima
	public Ferrari(int velocidadeMaxima){
		super (velocidadeMaxima);
		setDelta(15); //altera delta de 5 pra 15 para testar se ele para no limite setado (usa setter de carro)
	}
	
	//implementar métodos dentro da interface Esportivo
	@Override
	public void ligarTubo() {
		// TODO Auto-generated method stub
		setDelta(35);
		ligarTurbo = true;
	}
	
	@Override
	public void desligarturbo() {
		// TODO Auto-generated method stub
		setDelta(15);
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		// TODO Auto-generated method stub
		if(ligarTurbo && !ligarAr) {//turbo ligado e ar desligado
		return 35;
		
	}else if(ligarTurbo && ligarAr) {//turbo ligado e ar ligado
		return 30;
		
	}else if(!ligarTurbo && !ligarAr) {//turbo e ar desligados
		return 20;	
		
	}else {
		return 15; //fator aceleração delta padrão
	}
	}
}
//	@Override
////	void acelerar() {
//		// TODO Auto-generated method stub
//		velocidadeAtual+=15;
//	}


